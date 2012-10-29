
package com.tinesoft.gwt.socialmedia.client.google.share;

/**
 * Interface for integrating Google 'share' button.
 * <p/>
 * For complete documentation, see 'share' button page on <a
 * href="https://developers.google.com/+/plugins/share/"> Google Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface GoogleShareButton {

    /**
     * Initializes the script for Google 'share' button using the given options.
     * 
     * @param options The Google 'share' button options (size, language,annotation,...).
     */
    void init(GoogleShareButtonOptions options);

}
