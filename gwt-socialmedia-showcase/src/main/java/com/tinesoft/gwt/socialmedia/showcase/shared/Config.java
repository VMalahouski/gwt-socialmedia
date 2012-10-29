
package com.tinesoft.gwt.socialmedia.showcase.shared;

import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonOptions;

/**
 * Configurations.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public final class Config {

    /**
     * Returns the cookie name for the session.
     */
    public static final String SECURITY_COOKIE_NAME = "SHOWCASESESSIONID";

    /**
     * The Google Analytics tracking id for http://my-showcases.appspot.com.
     */
    public static final String GOOGLE_ANALYTICS_TRACKING_ID = "UA-34233197-1";

    /**
     * The Google +1 button options.
     */
    public static final GooglePlusOneButtonOptions GOOGLE_PLUS_ONE_BUTTON_OPTIONS = new GooglePlusOneButtonOptions();

    /**
     * Hide utility class constructor.
     */
    private Config() {}

}
