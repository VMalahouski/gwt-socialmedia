
package com.tinesoft.gwt.socialmedia.client.viadeo.share;

/**
 * Interface for integrating Viadeo 'share' Button.
 * <p/>
 * For complete documentation, see 'share' button page on <a
 * href="http://socialtoolbox.viadeo.com/#recommend"> Viadeo Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface ViadeoShareButton {

    /**
     * Initializes the script for Viadeo 'share' button using the given options.
     * 
     * @param options The Viadeo 'share' button options (size, font,style,...).
     */
    void init(ViadeoShareButtonOptions options);

}
