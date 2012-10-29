
package com.tinesoft.gwt.socialmedia.client.twitter;

/**
 * Class defining the common options for Tweeter buttons, badges, and 'share' buttons.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterOptions {

    /**
     * Defines the languages supported by the Tweeter buttons.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum TwitterLanguage {
        AR("ar", "Arabic — ‫العربية‬"), EU("eu", "Basque — ‪euskara‬"), CA("ca",
                "Catalan — ‪català‬"), ZH_CN("zh-cn", "Chinese (Simplified) — ‪中文（简体）‬"), ZH_TW(
                "zh-tw", "Chinese (Traditional) — ‪繁體中文‬"), CS("cs", "Czech — ‪čeština‬"), DA("da",
                "Danish — ‪dansk‬"), NL("nl", "Dutch — ‪Nederlands‬"), EN("en",
                "English (United States)"), FIL("fil", "Filipino"), FI("fi", "Finnish — ‪suomi‬"), FR(
                "fr", "French — ‪français‬"), HE("he", "Hebrew - עִבְרִית"), DE("de",
                "German — ‪Deutsch‬"), EL("el", "Greek — ‪Ελληνικά‬"), HI("hi", "Hindi — ‪हिन्दी‬"), HU(
                "hu", "Hungarian — ‪magyar‬"), ID("id", "Indonesian — ‪Bahasa Indonesia‬"), IT(
                "it", "Italian — ‪italiano‬"), JA("ja", "Japanese — ‪日本語‬"), KO("ko",
                "Korean — ‪한국어‬"), MSA("msa", "Malay - Bahasa Melayu"), NO("no",
                "Norwegian — ‪norsk‬"), FA("fa", "Persian — ‫فارسی‬"), PL("pl", "Polish — ‪polski‬"), PT(
                "pt", "Portuguese — ‪português"), RU("ru", "Russian — ‪русский‬"), ES("es",
                "Spanish — ‪español"), SV("sv", "Swedish — ‪svenska‬"), TH("th", "Thai — ‪ไทย‬"), TR(
                "tr", "Turkish — ‪Türkçe‬"), UK("uk", "Ukrainian — ‪українська‬"), UR("ur",
                "Urdu — ‫اردو‬");

        private final String code;
        private final String label;

        private TwitterLanguage(final String code, final String label) {
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

    private TwitterLanguage language = TwitterLanguage.EN;
    private String buttonText = "";
    private boolean largeButton = false;
    private boolean unsubscribeFromPersonalization = false;

    public TwitterOptions() {}

    public TwitterOptions(final TwitterLanguage language, final boolean largeButton, final boolean unsubscribeFromPersonalization, final String buttonText) {
        super();
        this.language = language;
        this.largeButton = largeButton;
        this.unsubscribeFromPersonalization = unsubscribeFromPersonalization;
        this.buttonText = buttonText;
    }

    /**
     * @return the buttonText
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * @return the language
     */
    public TwitterLanguage getLanguage() {
        return language;
    }

    /**
     * @return the largeButton
     */
    public boolean isLargeButton() {
        return largeButton;
    }

    /**
     * @return the unsubscribeFromPersonalization
     */
    public boolean isUnsubscribeFromPersonalization() {
        return unsubscribeFromPersonalization;
    }

    /**
     * @param buttonText the buttonText to set
     */
    public void setButtonText(final String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(final TwitterLanguage language) {
        this.language = language;
    }

    /**
     * @param largeButton the largeButton to set
     */
    public void setLargeButton(final boolean largeButton) {
        this.largeButton = largeButton;
    }

    /**
     * @param unsubscribeFromPersonalization the unsubscribeFromPersonalization to set
     */
    public void setUnsubscribeFromPersonalization(final boolean unsubscribeFromPersonalization) {
        this.unsubscribeFromPersonalization = unsubscribeFromPersonalization;
    }

}
