
package com.tinesoft.gwt.socialmedia.client.viadeo.send;

/**
 * Interface for integrating Viadeo 'send' Button.
 * <p/>
 * For complete documentation, see 'send' button page on <a
 * href="http://socialtoolbox.viadeo.com/#recommend"> Viadeo Developers.</a>
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface ViadeoSendButton {

    /**
     * Initializes the script for Viadeo 'send' button using the given options.
     * 
     * @param options The Viadeo 'send' button options (size, font,style,...).
     */
    void init(ViadeoSendButtonOptions options);

}
