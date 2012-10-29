
package com.tinesoft.gwt.socialmedia.showcase.client.util;

import com.google.gwt.animation.client.Animation;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Displays notifications on screen.
 */
public class GWTNotification {

    /**
     * All types of {@link GWTNotification}.
     */
    public enum NotificationType {

        /**
         * Default notification style.
         */
        DEFAULT,

        /**
         * Warning notification style.
         */
        WARN,

        /**
         * Error notification style.
         */
        ERROR,

        /**
         * Tray notification style.
         */
        TRAY
    }

    private static final int DEFAULT_DELAY = 3000;
    private static final int DEFAULT_FADE_IN = 500;
    private static final int DEFAULT_FADE_OUT = 1500;

    /**
     * Shows the default notification.
     * 
     * @param message the text to display.
     */
    public static void display(final String message) {
        show(message, NotificationType.DEFAULT, DEFAULT_DELAY);
    }

    /**
     * Shows the error notification.
     * 
     * @param message the text to display.
     */
    public static void error(final String message) {
        show(message, NotificationType.ERROR, DEFAULT_DELAY);
    }

    /**
     * Shows a notification.
     * 
     * @param message the text to display.
     * @param type the {@link NotificationType}.
     * @param delay the number of milliseconds to display the message.
     */
    public static void show(final String message, final NotificationType type, final int delay) {
        new GWTNotification(message, type, delay).display();
    }

    /**
     * Shows the tray notification.
     * 
     * @param message the text to display.
     */
    public static void tray(final String message) {
        show(message, NotificationType.TRAY, DEFAULT_DELAY);
    }

    /**
     * Shows the warn notification.
     * 
     * @param message the text to display.
     */
    public static void warn(final String message) {
        show(message, NotificationType.WARN, DEFAULT_DELAY);
    }

    private final String message;
    private final NotificationType type;
    private final int delay;
    private final FlowPanel panel;
    private Timer timer;

    /**
     * Constructor.
     * 
     * @param message the text to display.
     * @param type the {@link NotificationType}.
     * @param delay the number of milliseconds to display the message.
     */
    private GWTNotification(final String message, final NotificationType type, final int delay) {
        this.message = message;
        this.type = type;
        this.delay = delay > 0 ? delay : DEFAULT_DELAY;
        panel = new FlowPanel();
        initialize();
    }

    private void customize() {
        switch (type) {
            case ERROR:
                panel.addStyleDependentName("error");
                break;
            case WARN:
                panel.addStyleDependentName("warn");
                break;
            case TRAY:
                panel.addStyleDependentName("tray");
                break;
            default:
                panel.addStyleDependentName("default");
        }
    }

    /**
     * Displays the notification.
     */
    public void display() {
        panel.setVisible(false);
        RootPanel.get().add(panel);
        /*
         * When delay is higher than 0 we add a timer that will automatically close the
         * notification.
         */
        if (delay > 0) {
            timer = new Timer() {

                @Override
                public void run() {
                    hide();
                }
            };
            timer.schedule(delay);
        }
        show();
    }

    private void hide() {
        final Animation fade = new Animation() {

            @Override
            protected void onComplete() {
                super.onComplete();
                panel.setVisible(false);
                panel.removeFromParent();
            }

            @Override
            protected void onUpdate(final double progress) {
                panel.getElement().getStyle().setOpacity(1 - progress);
            }
        };
        fade.run(DEFAULT_FADE_OUT);
    }

    private void initialize() {
        panel.addStyleName("notification");
        customize();

        final FlowPanel content = new FlowPanel();
        final HTMLPanel txt = new HTMLPanel(message);
        content.add(txt);

        panel.addDomHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                panel.setVisible(false);
                panel.removeFromParent();
            }
        }, ClickEvent.getType());

        panel.add(content);
    }

    private void show() {
        panel.getElement().getStyle().setOpacity(0);
        panel.setVisible(true);
        final Animation fade = new Animation() {

            @Override
            protected void onUpdate(final double progress) {
                panel.getElement().getStyle().setOpacity(progress);
            }
        };
        fade.run(DEFAULT_FADE_IN);
    }

}
