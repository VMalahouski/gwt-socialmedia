
package com.tinesoft.gwt.socialmedia.client.linkedin.recommend;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.inject.Inject;

/**
 * Implementation of the {@link LinkedInRecommendButton} interface.
 * 
 * To use it, you must bind the {@link LinkedInRecommendButton} as singleton.
 * <p/>
 * Code to add to the <code>configure()</code> method of your GIN client module:
 * 
 * <pre>
 * bind(LinkedInRecommendButton.class).to(LinkedInRecommendButtonImpl.class).in(Singleton.class);
 * </pre>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInRecommendButtonImpl implements LinkedInRecommendButton {

    @Inject
    public LinkedInRecommendButtonImpl(final LinkedInRecommendButtonOptions options) {
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
    public void init(final LinkedInRecommendButtonOptions options) {

        if (Document.get().getElementById("linkedin-js") != null)
            return;

        final ScriptElement scriptElement = Document.get().createScriptElement();
        scriptElement.setSrc("//platform.linkedin.com/in.js");
        scriptElement.setType("text/javascript");
        scriptElement.setId("linkedin-js");

        final Element bodyElement = Document.get().getElementsByTagName("body").getItem(0);
        // we place the script just after the body tag

        bodyElement.appendChild(scriptElement);

    }

}
