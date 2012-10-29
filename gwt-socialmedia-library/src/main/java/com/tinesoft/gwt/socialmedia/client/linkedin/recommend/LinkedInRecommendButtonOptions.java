
package com.tinesoft.gwt.socialmedia.client.linkedin.recommend;

import com.tinesoft.gwt.socialmedia.client.linkedin.LinkedInOptions;

/**
 * Class defining the options for the LinkedIn 'recommend' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInRecommendButtonOptions extends LinkedInOptions {

    private String companyName = "407244";
    private String productId = "";

    public LinkedInRecommendButtonOptions() {
        super();
    }

    public LinkedInRecommendButtonOptions(String companyName, String productId, CountMode countMode) {
        super(countMode);
        this.companyName = companyName;
        this.productId = productId;
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

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LinkedInRecommendButtonOptions [companyName=" + companyName + ", productId="
               + productId + ", countMode=" + getCountMode() + "]";
    }

}
