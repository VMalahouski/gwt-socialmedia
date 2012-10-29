
package com.tinesoft.gwt.socialmedia.client.linkedin.share;

import com.tinesoft.gwt.socialmedia.client.linkedin.LinkedInOptions;

/**
 * Class defining the options for the LinkedIn 'share' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInShareButtonOptions extends LinkedInOptions {

    private String urlToShare = "http://www.tinesoft.com";

    public LinkedInShareButtonOptions() {
        super();
    }

    public LinkedInShareButtonOptions(String urlToShare, CountMode countMode) {
        super(countMode);
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
        return "LinkedInShareButtonOptions [urlToShare=" + urlToShare + ", countMode="
               + getCountMode() + "]";
    }

}
