
package com.tinesoft.gwt.socialmedia.client.google.plusone;

import com.tinesoft.gwt.socialmedia.client.google.GooglePlusOneOptions;

/**
 * Class defining the options for the Google +1 button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GooglePlusOneButtonOptions extends GooglePlusOneOptions {

    /**
     * Defines how the +1 count should appear relative to the +1 button.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonAnnotation {
        /**
         * The +1 count appears next to the button.
         */
        INLINE,
        /**
         * The +1 count appears as a bubble.
         */
        BUBBLE,
        /**
         * No +1 count.
         */
        NONE
    }

    /**
     * Defines the different button sizes.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonSize {
        /**
         * Small button (15px).
         */
        SMALL(15),
        /**
         * Medium button (20px).
         */
        MEDIUM(20),
        /**
         * Standard button (24px).
         */
        STANDARD(24),
        /**
         * Tall button (60px).
         */
        TALL(60);

        private final int height;

        private ButtonSize(int height) {
            this.height = height;
        }

        /**
         * @return the height
         */
        public int getHeight() {
            return height;
        }

    }

    private ButtonSize size = ButtonSize.STANDARD;
    private ButtonAnnotation annotation = ButtonAnnotation.INLINE;
    private String urlToPlusOne = "http://www.tinesoft.com";

    public GooglePlusOneButtonOptions() {}

    public GooglePlusOneButtonOptions(final ButtonSize size, final ButtonAnnotation annotation, final int width, final PlusOneLanguage language, final boolean asynchronous, final boolean HTML5ValidSyntax, final TagParsingMode tagParsingMode, final String urlToPlusOne) {
        super(asynchronous, HTML5ValidSyntax, width, language, tagParsingMode);
        this.size = size;
        this.annotation = annotation;
        this.urlToPlusOne = urlToPlusOne;
    }

    /**
     * @return the annotation
     */
    public ButtonAnnotation getAnnotation() {
        return annotation;
    }

    /**
     * @return the size
     */
    public ButtonSize getSize() {
        return size;
    }

    /**
     * @return the urlToPlusOne
     */
    public String getUrlToPlusOne() {
        return urlToPlusOne;
    }

    /**
     * @param annotation the annotation to set
     */
    public void setAnnotation(final ButtonAnnotation annotation) {
        this.annotation = annotation;
    }

    /**
     * @param size the size to set
     */
    public void setSize(final ButtonSize size) {
        this.size = size;
    }

    /**
     * @param urlToPlusOne the urlToPlusOne to set
     */
    public void setUrlToPlusOne(final String urlToPlusOne) {
        this.urlToPlusOne = urlToPlusOne;
    }

    /**
     * @param width the width to set
     */
    @Override
    public void setWidth(final int width) {
        // Google allows to specify any width 120px and greater
        if (width >= 120) {
            super.setWidth(width);
        }

    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GooglePlusOneBadgeOptions [size=" + size + ", annotation=" + annotation
               + ", urlToPlusOne=" + urlToPlusOne + ", language=" + getLanguage()
               + ", tagParsingMode=" + getTagParsingMode() + ", width=" + getWidth()
               + ", isAsynchronous=" + isAsynchronous() + ", isHTML5ValidSyntax="
               + isHTML5ValidSyntax() + "]";
    }

}
