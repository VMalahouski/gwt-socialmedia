
package com.tinesoft.gwt.socialmedia.client.viadeo.send;

import com.tinesoft.gwt.socialmedia.client.viadeo.ViadeoOptions;

/**
 * Class defining the options for the Viadeo 'send' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoSendButtonOptions extends ViadeoOptions {

    private String urlToSend = "http://www.tinesoft.com";

    public ViadeoSendButtonOptions() {
        super();
    }

    public ViadeoSendButtonOptions(String urlToSend, DisplayMode displayMode, ViadeoLanguage language, CountDisplay countDisplay, OverlayPosition overlayPosition) {
        super(displayMode, language, countDisplay, overlayPosition);
        this.urlToSend = urlToSend;
    }

    /**
     * @return the urlToSend
     */
    public String getUrlToSend() {
        return urlToSend;
    }

    /**
     * @param urlToSend the urlToSend to set
     */
    public void setUrlToSend(String urlToSend) {
        this.urlToSend = urlToSend;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ViadeoSendButtonOptions [urlToSend=" + urlToSend + ", displayMode="
               + getDisplayMode() + ", language=" + getLanguage() + ", countDisplay="
               + getCountDisplay() + ", overlayPosition=" + getOverlayPosition() + "]";
    }

}
