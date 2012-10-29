
package com.tinesoft.gwt.socialmedia.client.linkedin.follow;

import com.tinesoft.gwt.socialmedia.client.linkedin.LinkedInOptions;

/**
 * Class defining the options for the LinkedIn 'follow' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInFollowButtonOptions extends LinkedInOptions {

    private String companyName = "407244";

    public LinkedInFollowButtonOptions() {
        super();
    }

    public LinkedInFollowButtonOptions(String companyName, CountMode countMode) {
        super(countMode);
        this.companyName = companyName;
    }

    /**
     * @return the urlToShare
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LinkedInShareButtonOptions [companyName=" + companyName + ", countMode="
               + getCountMode() + "]";
    }

}
