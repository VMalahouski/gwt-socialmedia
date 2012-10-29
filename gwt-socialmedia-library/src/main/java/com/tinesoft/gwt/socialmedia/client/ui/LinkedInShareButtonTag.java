
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.linkedin.share.LinkedInShareButtonOptions;

/**
 * Renders the LinkedIn 'share' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInShareButtonTag extends Composite {

    interface LinkedInShareButtonTagUiBinder extends UiBinder<Widget, LinkedInShareButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "LinkedInShareButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public LinkedInShareButtonTag(final LinkedInShareButtonTagUiBinder uiBinder, final LinkedInShareButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the LinkedIn 'share' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final LinkedInShareButtonOptions options) {

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
        tagElement.setAttribute("data-url", options.getUrlToShare());
        tagElement.setAttribute("data-counter", count);
        tagElement.setType("IN/Share");

        panel.getElement().setClassName(NAME);
        panel.getElement().appendChild(tagElement);
    }
}
