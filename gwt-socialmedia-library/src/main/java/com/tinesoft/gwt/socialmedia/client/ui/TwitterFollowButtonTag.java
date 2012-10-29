
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.twitter.follow.TwitterFollowButtonOptions;

/**
 * Renders the Twitter 'follow' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterFollowButtonTag extends Composite {

    interface TwitterFollowButtonTagUiBinder extends UiBinder<Widget, TwitterFollowButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "TwitterFollowButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public TwitterFollowButtonTag(final TwitterFollowButtonTagUiBinder uiBinder, final TwitterFollowButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Twitter 'follow' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final TwitterFollowButtonOptions options) {

        String size = (options.isLargeButton()) ? "large" : "medium";

        String tag = "<a href=\"https://twitter.com/" + options.getUserAccount()
                     + "\" class=\"twitter-follow-button\"" + " data-show-count=\""
                     + options.isShowCount() + "\"" + " data-lang=\""
                     + options.getLanguage().getCode() + "\"" + " data-width=\""
                     + options.getWidth() + "\"" + " data-align=\""
                     + options.getAlignement().toString().toLowerCase() + "\""
                     + " data-show-screen-name=\"" + options.isShowScreenName() + "\""
                     + " data-size=\"" + size + "\"" + " data-dnt=\""
                     + options.isUnsubscribeFromPersonalization() + "\">" + options.getButtonText()
                     + "</a>";

        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
