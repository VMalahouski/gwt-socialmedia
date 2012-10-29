
package com.tinesoft.gwt.socialmedia.client.twitter.share;

/**
 * Interface for integrating Twitter 'share' button.
 * <p/>
 * For complete documentation, see 'share' button page on <a
 * href="https://dev.twitter.com/docs/tweet-button"> Twitter Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface TwitterShareButton {

    /**
     * Initializes the script for Twitter 'share' button using the given options.
     * 
     * @param options The Twitter 'share' button options (size, language,...).
     */
    void init(TwitterShareButtonOptions options);

}
