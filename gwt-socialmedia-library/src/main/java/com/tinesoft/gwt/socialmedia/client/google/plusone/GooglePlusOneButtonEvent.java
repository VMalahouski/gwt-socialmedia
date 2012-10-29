
package com.tinesoft.gwt.socialmedia.client.google.plusone;

import com.google.gwt.event.shared.GwtEvent;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Event fired when the user clicks a +1 button.
 * 
 * It contains information about the state (on/off) and the target URL.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GooglePlusOneButtonEvent extends GwtEvent<GooglePlusOneButtonEventHandler> {

    /**
     * Fires the {@link GooglePlusOneButtonEvent} event on the given event bus.
     * 
     * @param eventBus the event bus
     * @param isButtonStageOn the state of the +1 button
     * @param href the target URL
     */
    public static void fire(final EventBus eventBus, final boolean isButtonStageOn, final String href) {
        eventBus.fireEvent(new GooglePlusOneButtonEvent(isButtonStageOn, href));
    }

    public static Type<GooglePlusOneButtonEventHandler> getType() {
        return TYPE;
    }

    private final boolean buttonStateOn;

    private final String href;

    private final static Type<GooglePlusOneButtonEventHandler> TYPE = new Type<GooglePlusOneButtonEventHandler>();

    /**
     * Constructs a new +1 button clicked event.
     * 
     * @param buttonStateOn the state of the button. <code>true</code> if on, <code>false</code>
     *            otherwise
     * @param href the target URL
     */
    public GooglePlusOneButtonEvent(final boolean buttonStateOn, final String targetUrl) {
        this.buttonStateOn = buttonStateOn;
        this.href = targetUrl;
    }

    @Override
    protected void dispatch(final GooglePlusOneButtonEventHandler handler) {
        handler.onButtonClicked(this);

    }

    @Override
    public Type<GooglePlusOneButtonEventHandler> getAssociatedType() {
        return getType();
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @return the buttonStateOn
     */
    public boolean isButtonStateOn() {
        return buttonStateOn;
    }

}
