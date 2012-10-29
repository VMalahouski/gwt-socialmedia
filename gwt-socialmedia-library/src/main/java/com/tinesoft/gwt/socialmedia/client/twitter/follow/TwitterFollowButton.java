
package com.tinesoft.gwt.socialmedia.client.twitter.follow;

/**
 * Interface for integrating Twitter 'follow' button.
 * <p/>
 * For complete documentation, see 'follow' button page on <a
 * href="https://dev.twitter.com/docs/follow-button"> Twitter Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface TwitterFollowButton {

    /**
     * Initializes the script for Twitter 'follow' button using the given options.
     * 
     * @param options The Twitter 'follow' button options (size, language,...).
     */
    void init(TwitterFollowButtonOptions options);

}
