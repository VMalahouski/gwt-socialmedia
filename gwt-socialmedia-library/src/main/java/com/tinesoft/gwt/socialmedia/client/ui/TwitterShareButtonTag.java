
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.twitter.share.TwitterShareButtonOptions;

/**
 * Renders the Twitter 'share' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterShareButtonTag extends Composite {

    interface TwitterShareButtonTagUiBinder extends UiBinder<Widget, TwitterShareButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "TwitterShareButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public TwitterShareButtonTag(final TwitterShareButtonTagUiBinder uiBinder, final TwitterShareButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Twitter 'share' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final TwitterShareButtonOptions options) {

        String size = (options.isLargeButton()) ? "large" : "medium";

        String tag = "<a href=\"https://twitter.com/share\" class=\"twitter-share-button\""
                     + " data-url=\""
                     + options.getUrlToShare()
                     + "\""
                     + " data-text=\""
                     + options.getTweetText()
                     + "\""
                     + " data-via=\""
                     + options.getViaAccount()
                     + "\""
                     + " data-lang=\""
                     + options.getLanguage().getCode()
                     + "\""
                     + " data-size=\""
                     + size
                     + "\""
                     + " data-related=\""
                     + options.getRelatedAccounts()
                     + "\""
                     + " data-hashtags=\""
                     + options.getHashtags()
                     + "\""
                     + " data-count=\""
                     + options.getCountBoxPosition().toString().toLowerCase()
                     + "\""
                     + " data-dnt=\""
                     + options.isUnsubscribeFromPersonalization()
                     + "\">"
                     + options.getButtonText() + "</a>";

        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
