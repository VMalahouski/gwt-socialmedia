
package com.tinesoft.gwt.socialmedia.client.linkedin.follow;

/**
 * Interface for integrating LinkedIn 'follow' company Button.
 * <p/>
 * For complete documentation, see 'follow' button page on <a
 * href="http://developer.linkedin.com/plugins/follow-company"> LinkedIn Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface LinkedInFollowButton {

    /**
     * Initializes the script for LinkedIn 'share' button using the given options.
     * 
     * @param options The Linked 'share' button options (size, font,style,...).
     */
    void init(LinkedInFollowButtonOptions options);

}
