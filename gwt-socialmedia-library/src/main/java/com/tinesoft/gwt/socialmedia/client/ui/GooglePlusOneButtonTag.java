
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonOptions;

/**
 * Renders the Google +1 button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GooglePlusOneButtonTag extends Composite {

    interface GooglePlusOneButtonTagUiBinder extends UiBinder<Widget, GooglePlusOneButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "GooglePlusOneButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public GooglePlusOneButtonTag(final GooglePlusOneButtonTagUiBinder uiBinder, final GooglePlusOneButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Google +1 button, using the given options.
     * 
     * @param options the options
     */
    private void init(final GooglePlusOneButtonOptions options) {

        String tag = "";
        String urlToPlusOne = "";

        if (options.isHTML5ValidSyntax()) {
            urlToPlusOne = (!"".equals(options.getUrlToPlusOne()) ? " data-href=\""
                                                                    + options.getUrlToPlusOne()
                                                                    + "\"" : "");
            tag = "<div class=\"g-plusone\"" + " data-annotation=\""
                  + options.getAnnotation().toString().toLowerCase() + "\"" + " data-width=\""
                  + options.getWidth() + "\"" + " data-callback=\"onPlusOneButtonClicked\""
                  + urlToPlusOne + "/>";
        } else {
            urlToPlusOne = (!"".equals(options.getUrlToPlusOne()) ? " href=\""
                                                                    + options.getUrlToPlusOne()
                                                                    + "\"" : "");
            tag = "<g:plusone" + " annotation=\""
                  + options.getAnnotation().toString().toLowerCase() + "\"" + " width=\""
                  + options.getWidth() + "\"" + " callback=\"onPlusOneButtonClicked\""
                  + urlToPlusOne + "/>";

        }
        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
