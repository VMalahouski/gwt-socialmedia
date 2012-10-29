
package com.tinesoft.gwt.socialmedia.client.linkedin.share;

/**
 * Interface for integrating LinkedIn 'share' Button.
 * <p/>
 * For complete documentation, see 'share' button page on <a
 * href="http://developer.linkedin.com/plugins/share-plugin-generator"> LinkedIn Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface LinkedInShareButton {

    /**
     * Initializes the script for LinkedIn 'share' button using the given options.
     * 
     * @param options The Linked 'share' button options (size, font,style,...).
     */
    void init(LinkedInShareButtonOptions options);

}
