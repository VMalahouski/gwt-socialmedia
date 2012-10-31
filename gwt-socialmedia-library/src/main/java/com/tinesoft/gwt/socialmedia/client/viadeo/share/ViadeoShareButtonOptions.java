
package com.tinesoft.gwt.socialmedia.client.viadeo.share;

import com.tinesoft.gwt.socialmedia.client.viadeo.ViadeoOptions;

/**
 * Class defining the options for the Viadeo 'share' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoShareButtonOptions extends ViadeoOptions {

    private String urlToShare = "http://www.tinesoft.com";

    public ViadeoShareButtonOptions() {
        super();
    }

    public ViadeoShareButtonOptions(String urlToShare, DisplayMode displayMode, ViadeoLanguage language, CountDisplay countDisplay, OverlayPosition overlayPosition) {
        super(displayMode, language, countDisplay, overlayPosition);
        this.urlToShare = urlToShare;
    }

    /**
     * @return the urlToShare
     */
    public String getUrlToShare() {
        return urlToShare;
    }

    /**
     * @param urlToShare the urlToShare to set
     */
    public void setUrlToShare(String urlToShare) {
        this.urlToShare = urlToShare;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ViadeoShareButtonOptions [urlToShare=" + urlToShare + ", displayMode="
               + getDisplayMode() + ", language=" + getLanguage() + ", countDisplay="
               + getCountDisplay() + ", overlayPosition=" + getOverlayPosition() + "]";
    }

}
