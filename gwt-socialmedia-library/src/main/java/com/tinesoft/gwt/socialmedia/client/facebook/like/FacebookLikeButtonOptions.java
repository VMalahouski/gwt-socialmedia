
package com.tinesoft.gwt.socialmedia.client.facebook.like;

/**
 * Class defining the options for the Facebook 'like' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class FacebookLikeButtonOptions {

    /**
     * Determine the size and amount of social content next to the button.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonLayoutStyle {
        STANTDARD("standard"), BUTTON_COUNT("button_count"), BOX_COUNT("box_count");

        private final String code;

        private ButtonLayoutStyle(final String code) {
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
     * Defines the font of the button and surrounding text.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonFont {
        ARIAL("arial"), LUCIDA_GRANDE("lucida grande"), SEGOE_UI("segoe ui"), TAHOMA("tahoma"), TREBUCHET_MS(
                "trebuchet ms"), VERDANA("verdana");

        private final String code;

        private ButtonFont(final String code) {
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
     * Defines the color scheme of the button.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonColorScheme {
        LIGHT, DARK
    }

    /**
     * Defines the verb to display in the button.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum VerbToDisplay {
        LIKE, RECOMMEND
    }

    private String urlToLike = "http://www.tinesoft.com";
    private int width = 450;
    private ButtonFont font = ButtonFont.ARIAL;
    private ButtonColorScheme colorScheme = ButtonColorScheme.LIGHT;
    private VerbToDisplay verbToDisplay = VerbToDisplay.LIKE;
    private ButtonLayoutStyle layoutStyle = ButtonLayoutStyle.STANTDARD;
    private boolean sendButton = true;
    private boolean showFaces = true;

    public FacebookLikeButtonOptions() {}

    public FacebookLikeButtonOptions(String urlToLike, int width, ButtonFont font, ButtonColorScheme colorScheme, VerbToDisplay verbToDisplay, ButtonLayoutStyle layoutStyle, boolean sendButton, boolean showFaces) {
        super();
        this.urlToLike = urlToLike;
        this.width = width;
        this.font = font;
        this.colorScheme = colorScheme;
        this.verbToDisplay = verbToDisplay;
        this.layoutStyle = layoutStyle;
        this.sendButton = sendButton;
        this.showFaces = showFaces;
    }

    /**
     * @return the urlToLike
     */
    public String getUrlToLike() {
        return urlToLike;
    }

    /**
     * @param urlToLike the urlToLike to set
     */
    public void setUrlToLike(String urlToLike) {
        this.urlToLike = urlToLike;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the font
     */
    public ButtonFont getFont() {
        return font;
    }

    /**
     * @param font the font to set
     */
    public void setFont(ButtonFont font) {
        this.font = font;
    }

    /**
     * @return the colorScheme
     */
    public ButtonColorScheme getColorScheme() {
        return colorScheme;
    }

    /**
     * @param colorScheme the colorScheme to set
     */
    public void setColorScheme(ButtonColorScheme colorScheme) {
        this.colorScheme = colorScheme;
    }

    /**
     * @return the verbToDisplay
     */
    public VerbToDisplay getVerbToDisplay() {
        return verbToDisplay;
    }

    /**
     * @param verbToDisplay the verbToDisplay to set
     */
    public void setVerbToDisplay(VerbToDisplay verbToDisplay) {
        this.verbToDisplay = verbToDisplay;
    }

    /**
     * @return the layoutStyle
     */
    public ButtonLayoutStyle getLayoutStyle() {
        return layoutStyle;
    }

    /**
     * @param layoutStyle the layoutStyle to set
     */
    public void setLayoutStyle(ButtonLayoutStyle layoutStyle) {
        this.layoutStyle = layoutStyle;
    }

    /**
     * @return the sendButton
     */
    public boolean isSendButton() {
        return sendButton;
    }

    /**
     * @param sendButton the sendButton to set
     */
    public void setSendButton(boolean sendButton) {
        this.sendButton = sendButton;
    }

    /**
     * @return the showFaces
     */
    public boolean isShowFaces() {
        return showFaces;
    }

    /**
     * @param showFaces the showFaces to set
     */
    public void setShowFaces(boolean showFaces) {
        this.showFaces = showFaces;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "FacebookLikeButtonOptions [urlToLike=" + urlToLike + ", width=" + width + ", font="
               + font + ", colorScheme=" + colorScheme + ", verbToDisplay=" + verbToDisplay
               + ", layoutStyle=" + layoutStyle + ", sendButton=" + sendButton + ", showFaces="
               + showFaces + "]";
    }

}
