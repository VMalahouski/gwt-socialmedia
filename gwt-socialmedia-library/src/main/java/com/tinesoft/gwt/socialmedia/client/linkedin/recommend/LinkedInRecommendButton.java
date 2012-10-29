
package com.tinesoft.gwt.socialmedia.client.linkedin.recommend;

/**
 * Interface for integrating LinkedIn 'recommend' company Button.
 * <p/>
 * For complete documentation, see 'recommend' button page on <a
 * href="http://developer.linkedin.com/plugins/recommend-button"> LinkedIn Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface LinkedInRecommendButton {

    /**
     * Initializes the script for LinkedIn 'share' button using the given options.
     * 
     * @param options The Linked 'share' button options (size, font,style,...).
     */
    void init(LinkedInRecommendButtonOptions options);

}
