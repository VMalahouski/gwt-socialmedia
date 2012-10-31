
package com.tinesoft.gwt.socialmedia.client.viadeo;

/**
 * Class defining the common options for Viadeo buttons.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class ViadeoOptions {

    /**
     * Defines the position of the count box.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum CountDisplay {
        NONE, TOP, RIGHT
    }

    /**
     * Defines the display mode (icon or button).
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum DisplayMode {
        BUTTON_LIGHT("btnlight"), BUTTON_DARK("btndark"), ICON_LIGHT("iconlight"), ICON_DARK(
                "icondark");

        private final String code;

        private DisplayMode(String code) {
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
     * Defines the position of the overlay.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum OverlayPosition {
        LEFT, RIGHT
    }

    /**
     * Defines the languages supported by the Viadeo buttons.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ViadeoLanguage {
        DEFAULT("", ""), EN("en", "English"), FR("fr", "Français"), IT("it", "Italiano"), DE("de",
                "Deutsch"), ES("es", "Español"), MX("mx", "Español (Latinoamérica)"), PT("pt",
                "Português"), RU("ru", "русский");

        private final String code;
        private final String label;

        private ViadeoLanguage(final String code, final String label) {
            this.code = code;
            this.label = label;
        }

        /**
         * @return the code
         */
        public String getCode() {
            return code;
        }

        /**
         * @return the label
         */
        public String getLabel() {
            return label;
        }

    }

    private DisplayMode displayMode = DisplayMode.BUTTON_LIGHT;
    private ViadeoLanguage language = ViadeoLanguage.DEFAULT;
    private CountDisplay countDisplay = CountDisplay.RIGHT;
    private OverlayPosition overlayPosition = OverlayPosition.LEFT;

    public ViadeoOptions() {
        super();
    }

    public ViadeoOptions(DisplayMode displayMode, ViadeoLanguage language, CountDisplay countDisplay, OverlayPosition overlayPosition) {
        super();
        this.displayMode = displayMode;
        this.language = language;
        this.countDisplay = countDisplay;
        this.overlayPosition = overlayPosition;
    }

    /**
     * @return the displayMode
     */
    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    /**
     * @param displayMode the displayMode to set
     */
    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }

    /**
     * @return the language
     */
    public ViadeoLanguage getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(ViadeoLanguage language) {
        this.language = language;
    }

    /**
     * @return the countDisplay
     */
    public CountDisplay getCountDisplay() {
        return countDisplay;
    }

    /**
     * @param countDisplay the countDisplay to set
     */
    public void setCountDisplay(CountDisplay countDisplay) {
        this.countDisplay = countDisplay;
    }

    /**
     * @return the overlayPosition
     */
    public OverlayPosition getOverlayPosition() {
        return overlayPosition;
    }

    /**
     * @param overlayPosition the overlayPosition to set
     */
    public void setOverlayPosition(OverlayPosition overlayPosition) {
        this.overlayPosition = overlayPosition;
    }

}
