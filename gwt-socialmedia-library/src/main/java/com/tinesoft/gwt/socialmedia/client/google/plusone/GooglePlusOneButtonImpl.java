
package com.tinesoft.gwt.socialmedia.client.google.plusone;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.tinesoft.gwt.socialmedia.client.google.GooglePlusOneOptions.TagParsingMode;

/**
 * Implementation of the {@link GooglePlusOneButton} interface.
 * 
 * To use it, you must bind the {@link GooglePlusOneButton} as singleton.
 * <p/>
 * Code to add to the <code>configure()</code> method of your GIN client module:
 * 
 * <pre>
 * bind(GooglePlusOneButton.class).to(GooglePlusOneButtonImpl.class).in(Singleton.class);
 * </pre>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GooglePlusOneButtonImpl implements GooglePlusOneButton {

    private final EventBus eventBus;

    @Inject
    public GooglePlusOneButtonImpl(final EventBus eventBus, final GooglePlusOneButtonOptions options) {

        this.eventBus = eventBus;

        // if (GWT.isScript()) {FIXME:Restore the || GWT.isScript() check !!!
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                init(options);
                registerJsCallBack();
            }
        });
        // }
    }

    @Override
    public void init(final GooglePlusOneButtonOptions options) {

        if (options == null) {
            throw new IllegalArgumentException(
                    "cannot initialize GooglePlusOneButton. 'options' is null!");
        } else {
            // when the parsing mode is 'Explicit', the asynchronous load is not possible
            if (options.getTagParsingMode() == TagParsingMode.EXPLICIT) {
                options.setAsynchronous(false);
            }

            if (options.isAsynchronous()) {

                final Element bodyElement = Document.get().getElementsByTagName("body").getItem(0);
                final String scriptStr = "window.___gcfg = {lang: '"
                                         + options.getLanguage().getCode()
                                         + "'};"
                                         + "(function() {"
                                         + " if(document.getElementById('gplusonejs')) return;"
                                         + " var po = document.createElement('script'); po.type = 'text/javascript'; "
                                         + " po.async = true;" + " po.id = 'gplusonejs';"
                                         + " po.src = 'https://apis.google.com/js/plusone.js';"
                                         + " var s = document.getElementsByTagName('script')[0];"
                                         + " s.parentNode.insertBefore(po, s);" + "})();";

                final ScriptElement scriptElement = Document.get().createScriptElement(scriptStr);

                // google recommends to place the script after the last +1 button tag.
                bodyElement.appendChild(scriptElement);

            } else {

                final Element firstScript = Document.get().getElementsByTagName("script").getItem(0);
                final ScriptElement script = Document.get().createScriptElement();

                // Create and add the google +1 script in the head section.
                script.setSrc("https://apis.google.com/js/plusone.js");
                script.setType("text/javascript");
                script.setInnerHTML("{lang: '" + options.getLanguage().getCode() + "',"
                                    + "parsetags:'"
                                    + options.getTagParsingMode().toString().toLowerCase() + "'}");

                firstScript.getParentNode().insertBefore(script, firstScript);

            }
        }

    }

    /**
     * Called by the JavaScript callback method, when the +1 button is clicked.
     * 
     * It fires a {@link GooglePlusOneButtonEvent} with the given parameters on the event bus.
     * 
     * @param state the state of the +1 button ("on"|"off")
     * @param href the target URL
     */
    public void onPlusOneButtonClicked(final String state, final String href) {

        GooglePlusOneButtonEvent.fire(eventBus, state.equals("on"), href);
    }

    /**
     * Registers the onPlusOneButonClicked() method, so that it can be called from hand-written
     * JavaScript.
     */
    private native void registerJsCallBack()
    /*-{                                             
         var that = this;
         $wnd.onPlusOneButtonClicked= $entry(function(jsonParam) {
         return that.@com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonImpl::onPlusOneButtonClicked(Ljava/lang/String;Ljava/lang/String;) (jsonParam.state,jsonParam.href)
         });
    }-*/;
}
