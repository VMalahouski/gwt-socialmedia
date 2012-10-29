
package com.tinesoft.gwt.socialmedia.client.facebook.like;

/**
 * Interface for integrating Facebook 'like' Button.
 * <p/>
 * For complete documentation, see 'like' button page on <a
 * href="http://developers.facebook.com/docs/reference/plugins/like/"> Facebook Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface FacebookLikeButton {

    /**
     * Initializes the script for Facebook 'like' button using the given options.
     * 
     * @param options The Facebook 'like' button options (size, font,style,...).
     */
    void init(FacebookLikeButtonOptions options);

}
