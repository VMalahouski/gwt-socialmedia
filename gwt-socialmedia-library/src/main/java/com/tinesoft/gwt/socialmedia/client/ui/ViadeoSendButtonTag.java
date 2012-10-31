
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.viadeo.send.ViadeoSendButtonOptions;

/**
 * Renders the Viadeo 'send' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoSendButtonTag extends Composite {

    interface ViadeoSendButtonTagUiBinder extends UiBinder<Widget, ViadeoSendButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "ViadeoSendButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public ViadeoSendButtonTag(final ViadeoSendButtonTagUiBinder uiBinder, final ViadeoSendButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Viadeo 'send' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final ViadeoSendButtonOptions options) {

        String tag = "<div class=\"viadeo-send\"" + " data-url=\"http://www.tinesoft.com\" "
                     + " data-display=\"" + options.getDisplayMode().getCode() + "\""
                     + " data-count=\"" + options.getCountDisplay().toString().toLowerCase() + "\""
                     + " data-align=\"" + options.getOverlayPosition().toString().toLowerCase()
                     + "\"" + " data-language=\"" + options.getLanguage().getCode() + "\""
                     + " data-partner-id=\"zabgwbzDxVgrxVedsgEOctjccc\"></div>";

        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
