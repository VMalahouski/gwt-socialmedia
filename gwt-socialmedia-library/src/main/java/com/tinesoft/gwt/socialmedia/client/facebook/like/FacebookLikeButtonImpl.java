
package com.tinesoft.gwt.socialmedia.client.facebook.like;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.inject.Inject;

public class FacebookLikeButtonImpl implements FacebookLikeButton {

    @Inject
    public FacebookLikeButtonImpl(final FacebookLikeButtonOptions options) {
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
    public void init(FacebookLikeButtonOptions options) {
        final Element bodyElement = Document.get().getElementsByTagName("body").getItem(0);
        final Element fbRootElement = Document.get().createElement("div");
        fbRootElement.setId("fb-root");

        final String scriptStr = "(function(d, s, id) {"
                                 + "var js, fjs = d.getElementsByTagName(s)[0];"
                                 + "if (d.getElementById(id)) return;"
                                 + "js = d.createElement(s); js.id = id;"
                                 + "js.src = \"//connect.facebook.net/fr_FR/all.js#xfbml=1\";"
                                 + "fjs.parentNode.insertBefore(js, fjs);"
                                 + "}(document, 'script', 'facebook-jssdk'));";

        final ScriptElement scriptElement = Document.get().createScriptElement(scriptStr);

        // facebook recommends to place the script just after the body tag
        bodyElement.insertFirst(fbRootElement);
        bodyElement.insertAfter(scriptElement, fbRootElement);
    }
}
