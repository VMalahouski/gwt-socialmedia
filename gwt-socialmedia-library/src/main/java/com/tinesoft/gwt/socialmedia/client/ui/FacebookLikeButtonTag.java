
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.facebook.like.FacebookLikeButtonOptions;

/**
 * Renders the Facebook 'like' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class FacebookLikeButtonTag extends Composite {

    interface FacebooLikeButtonTagUiBinder extends UiBinder<Widget, FacebookLikeButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "FacebookLikeButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public FacebookLikeButtonTag(final FacebooLikeButtonTagUiBinder uiBinder, final FacebookLikeButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Facebook 'share' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final FacebookLikeButtonOptions options) {

        String urlToLike = (!"".equals(options.getUrlToLike()) ? " data-href=\""
                                                                 + options.getUrlToLike() + "\"" : "");

        String tag = "<div class=\"fb-like\"" + urlToLike + " data-send=\""
                     + options.isSendButton() + "\" data-layout=\""
                     + options.getLayoutStyle().getCode() + "\" data-width=\"" + options.getWidth()
                     + "\" data-show-faces=\"" + options.isShowFaces() + "\" data-action=\""
                     + options.getVerbToDisplay().toString().toLowerCase()
                     + "\" data-colorscheme=\"" + options.getColorScheme().toString().toLowerCase()
                     + "\" data-font=\"" + options.getFont().getCode() + "\"></div>";

        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
