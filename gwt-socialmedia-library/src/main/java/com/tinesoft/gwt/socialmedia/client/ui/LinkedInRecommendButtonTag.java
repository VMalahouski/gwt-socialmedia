
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.linkedin.recommend.LinkedInRecommendButtonOptions;

/**
 * Renders the LinkedIn 'follow' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInRecommendButtonTag extends Composite {

    interface LinkedInRecommendButtonTagUiBinder extends UiBinder<Widget, LinkedInRecommendButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "LinkedInRecommendButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public LinkedInRecommendButtonTag(final LinkedInRecommendButtonTagUiBinder uiBinder, final LinkedInRecommendButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the LinkedIn 'recommend' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final LinkedInRecommendButtonOptions options) {

        final String count;
        switch (options.getCountMode()) {
            case HORIZONTAL:
                count = "right";
                break;
            case VERTICAL:
                count = "top";
                break;
            default:
                count = "none";
        }

        final ScriptElement tagElement = Document.get().createScriptElement();
        tagElement.setAttribute("data-company", options.getCompanyName());
        tagElement.setAttribute("data-product", options.getProductId());
        tagElement.setAttribute("data-counter", count);
        tagElement.setType("IN/RecommendProduct");

        panel.getElement().setClassName(NAME);
        panel.getElement().appendChild(tagElement);
    }
}
