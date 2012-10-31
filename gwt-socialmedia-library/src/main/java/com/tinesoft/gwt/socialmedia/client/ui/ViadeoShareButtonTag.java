
package com.tinesoft.gwt.socialmedia.client.ui;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.tinesoft.gwt.socialmedia.client.viadeo.share.ViadeoShareButtonOptions;

/**
 * Renders the Viadeo 'share' button in the ui page.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoShareButtonTag extends Composite {

    interface ViadeoShareButtonTagUiBinder extends UiBinder<Widget, ViadeoShareButtonTag> {
    }

    /**
     * the name of the tag.
     */
    public final static String NAME = "ViadeoShareButtonTag";

    @UiField
    HTMLPanel panel;

    @Inject
    public ViadeoShareButtonTag(final ViadeoShareButtonTagUiBinder uiBinder, final ViadeoShareButtonOptions options) {
        initWidget(uiBinder.createAndBindUi(this));
        init(options);
    }

    /**
     * Initializes the Viadeo 'share' button, using the given options.
     * 
     * @param options the options
     */
    private void init(final ViadeoShareButtonOptions options) {

        String tag = "<div class=\"viadeo-share\"" + " data-url=\"http://www.tinesoft.com\" "
                     + " data-display=\"" + options.getDisplayMode().getCode() + "\""
                     + " data-count=\"" + options.getCountDisplay().toString().toLowerCase() + "\""
                     + " data-align=\"" + options.getOverlayPosition().toString().toLowerCase()
                     + "\"" + " data-language=\"" + options.getLanguage().getCode() + "\""
                     + " data-partner-id=\"zabgwbzDxVgrxVedsgEOctjccc\"></div>";

        panel.getElement().setClassName(NAME);
        panel.getElement().setInnerHTML(tag);
    }
}
