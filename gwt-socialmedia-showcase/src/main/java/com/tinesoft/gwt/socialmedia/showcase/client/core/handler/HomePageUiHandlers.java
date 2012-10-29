
package com.tinesoft.gwt.socialmedia.showcase.client.core.handler;

import com.gwtplatform.mvp.client.UiHandlers;
import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonEventHandler;

/**
 * Showcase page handler.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public interface HomePageUiHandlers extends UiHandlers, GooglePlusOneButtonEventHandler {

    /**
     * Fired on 'GooglePlusOneButton' showcase click.
     */
    void onGooglePlusOneShowcaseClicked();

}
