
package com.tinesoft.gwt.socialmedia.client.google.plusone;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for the {@link GooglePlusOneButtonEvent} event.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public interface GooglePlusOneButtonEventHandler extends EventHandler {

    /**
     * Fired when the +1 button is clicked.
     * 
     * @param event the {@link GooglePlusOneButtonEvent} event.
     */
    void onButtonClicked(GooglePlusOneButtonEvent event);
}
