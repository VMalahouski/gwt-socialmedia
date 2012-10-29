
package com.tinesoft.gwt.socialmedia.client.google.share;

import com.tinesoft.gwt.socialmedia.client.google.GooglePlusOneOptions;

/**
 * Class defining the options for the Google Share button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GoogleShareButtonOptions extends GooglePlusOneOptions {

    /**
     * Defines how the 'share' count should appear relative to the share button.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonAnnotation {
        /**
         * The 'share' count appears next to the button.
         */
        INLINE("inline"),
        /**
         * The 'share' count appears as an horizontal bubble.
         */
        HORIZONTAL_BUBBLE("bubble"),
        /**
         * The 'share' count appears as an vertical bubble.
         */
        VERTICTAL_BUBBLE("vertical-bubble"),
        /**
         * No 'share' count.
         */
        NONE("none");

        private final String code;

        private ButtonAnnotation(final String code) {
            this.code = code;
        }

        /**
         * @return the code
         */
        public String getCode() {
            return code;
        }

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
        STANDARD(24);

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
    private String urlToShare = "http://www.tinesoft.com";

    public GoogleShareButtonOptions() {}

    public GoogleShareButtonOptions(final ButtonSize size, final ButtonAnnotation annotation, final int width, final PlusOneLanguage language, final boolean asynchronous, final boolean HTML5ValidSyntax, final TagParsingMode tagParsingMode, final String urlToPlusOne) {
        super(asynchronous, HTML5ValidSyntax, width, language, tagParsingMode);
        this.size = size;
        this.annotation = annotation;
        urlToShare = urlToPlusOne;
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
     * @return the urlToShare
     */
    public String getUrlToShare() {
        return urlToShare;
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
     * @param urlToShare the urlToShare to set
     */
    public void setUrlToShare(final String urlToShare) {
        this.urlToShare = urlToShare;
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
               + ", urlToShare=" + urlToShare + ", language=" + getLanguage() + ", tagParsingMode="
               + getTagParsingMode() + ", isAsynchronous=" + isAsynchronous()
               + ", isHTML5ValidSyntax=" + isHTML5ValidSyntax() + "]";
    }

}
