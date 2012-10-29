
package com.tinesoft.gwt.socialmedia.client.linkedin;

/**
 * Class defining the common options for LinkedIn buttons.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class LinkedInOptions {

    /**
     * Defines the position of the count box.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum CountMode {
        NONE, HORIZONTAL, VERTICAL
    }

    private CountMode countMode = CountMode.HORIZONTAL;

    public LinkedInOptions() {
        super();

    }

    public LinkedInOptions(CountMode countMode) {
        super();
        this.countMode = countMode;
    }

    /**
     * @return the countMode
     */
    public CountMode getCountMode() {
        return countMode;
    }

    /**
     * @param countMode the countMode to set
     */
    public void setCountMode(CountMode countMode) {
        this.countMode = countMode;
    }

}
