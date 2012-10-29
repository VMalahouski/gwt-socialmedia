
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.google.share.GoogleShareButtonOptions;
import com.tinesoft.gwt.socialmedia.client.google.share.GoogleShareButtonOptions.ButtonAnnotation;

/**
 * Renders the Google 'share' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GoogleShareButtonTag extends Composite {

    interface GoogleShareButtonTagUiBinder extends UiBinder<Widget, GoogleShareButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "GoogleShareButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public GoogleShareButtonTag(final GoogleShareButtonTagUiBinder uiBinder, final GoogleShareButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Google 'share' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final GoogleShareButtonOptions options) {

        String tag = "";
        String urlToShare = "";
        String width = "";
        String height = "";

        if (options.isHTML5ValidSyntax()) {
            urlToShare = (!"".equals(options.getUrlToShare()) ? " data-href=\""
                                                                + options.getUrlToShare() + "\"" : "");
            if (options.getAnnotation() == ButtonAnnotation.VERTICTAL_BUBBLE) {
                width = " data-width=\"" + options.getWidth() + "\"";
                height = " data-height=\"60\"";
            } else
                height = "data-height=\"" + options.getSize().getHeight() + "\"";

            tag = "<div class=\"g-plus\"" + " data-annotation=\""
                  + options.getAnnotation().getCode().toLowerCase() + "\""
                  + " data-action=\"share\"" + " data-callback=\"onShareButtonClicked\"" + width
                  + height + urlToShare + "/>";
        } else {
            urlToShare = (!"".equals(options.getUrlToShare()) ? " href=\""
                                                                + options.getUrlToShare() + "\"" : "");

            if (options.getAnnotation() == ButtonAnnotation.VERTICTAL_BUBBLE) {
                width = " width=\"" + options.getWidth() + "\"";
                height = " height=\"60\"";
            } else
                height = " height=\"" + options.getSize().getHeight() + "\"";

            tag = "<g:plus" + " annotation=\"" + options.getAnnotation().getCode().toLowerCase()
                  + "\"" + " action=\"share\"" + " callback=\"onShareButtonClicked\"" + width
                  + height + urlToShare + "/>";

        }
        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
