
package com.tinesoft.gwt.socialmedia.client.google.plusone;

/**
 * Interface for integrating Google +1 Button.
 * <p/>
 * For complete documentation, see +1 button page on <a
 * href="https://developers.google.com/+/plugins/+1button/"> Google Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface GooglePlusOneButton {

    /**
     * Initializes the script for Google +1 button using the given options.
     * 
     * @param options The Google +1 button options (size, language,annotation,...).
     */
    void init(GooglePlusOneButtonOptions options);

}
