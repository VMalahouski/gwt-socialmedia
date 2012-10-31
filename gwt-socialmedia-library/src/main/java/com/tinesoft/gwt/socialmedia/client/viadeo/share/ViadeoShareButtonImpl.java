
package com.tinesoft.gwt.socialmedia.client.viadeo.share;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.inject.Inject;

/**
 * Implementation of the {@link ViadeoShareButton} interface.
 * 
 * To use it, you must bind the {@link ViadeoShareButton} as singleton.
 * <p/>
 * Code to add to the <code>configure()</code> method of your GIN client module:
 * 
 * <pre>
 * bind(ViadeoShareButton.class).to(ViadeoShareButtonImpl.class).in(Singleton.class);
 * </pre>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoShareButtonImpl implements ViadeoShareButton {

    @Inject
    public ViadeoShareButtonImpl(final ViadeoShareButtonOptions options) {
        // if (GWT.isScript()) {FIXME:Restore the || GWT.isScript() check !!!
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                init(options);

            }
        });
        // }
    }

    @Override
    public void init(final ViadeoShareButtonOptions options) {

        if (Document.get().getElementById("viadeo-js") != null)
            return;

        final Element bodyElement = Document.get().getElementsByTagName("body").getItem(0);

        final String scriptStr = "var viadeoWidgetsJsUrl = document.location.protocol+'//widgets.viadeo.com';"
                                 + "(function(){"
                                 + "   var e = document.createElement('script');"
                                 + "   e.type='text/javascript'; e.async = true;"
                                 + "   e.src = viadeoWidgetsJsUrl+'/js/viadeowidgets.js';"
                                 + "   var s = document.getElementsByTagName('head')[0];"
                                 + "    s.appendChild(e);" + "})();";
        final ScriptElement scriptElement = Document.get().createScriptElement(scriptStr);
        scriptElement.setId("viadeo-js");
        // we place the script just after the body tag
        bodyElement.appendChild(scriptElement);

    }
}
