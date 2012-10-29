
package com.tinesoft.gwt.socialmedia.client.twitter.follow;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.inject.Inject;

/**
 * Implementation of the {@link TwitterFollowButton} interface.
 * 
 * To use it, you must bind the {@link TwitterFollowButton} as singleton.
 * <p/>
 * Code to add to the <code>configure()</code> method of your GIN client module:
 * 
 * <pre>
 * bind(TwitterFollowButton.class).to(TwitterFollowButtonImpl.class).in(Singleton.class);
 * </pre>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterFollowButtonImpl implements TwitterFollowButton {

    @Inject
    public TwitterFollowButtonImpl(final TwitterFollowButtonOptions options) {
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
    public void init(final TwitterFollowButtonOptions options) {
        final Element bodyElement = Document.get().getElementsByTagName("body").getItem(0);

        final String scriptStr = "!function(d,s,id){" + " var js,fjs=d.getElementsByTagName(s)[0];"
                                 + " if(!d.getElementById(id)){" + "js=d.createElement(s);"
                                 + " js.id=id;js.src='//platform.twitter.com/widgets.js';"
                                 + " fjs.parentNode.insertBefore(js,fjs);"
                                 + " }}(document,'script','twitter-wjs');";

        final ScriptElement scriptElement = Document.get().createScriptElement(scriptStr);

        // we place the script just after the body tag

        bodyElement.appendChild(scriptElement);

    }

}
