
package com.tinesoft.gwt.socialmedia.client.google;

/**
 * Class defining the common options for Google +1 buttons, badges, and 'share' buttons.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class GooglePlusOneOptions {

    /**
     * Defines the languages supported by the +1 buttons, badges,....
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum PlusOneLanguage {
        AF("af", "Afrikaans"), AM("am", "Amharic — ‪አማርኛ‬"), AR("ar", "Arabic — ‫العربية‬"), EU(
                "eu", "Basque — ‪euskara‬"), BN("bn", "Bengali — ‪বাংলা‬"), BG("bg",
                "Bulgarian — ‪български‬"), CA("ca", "Catalan — ‪català‬"), ZH_HK("zh-HK",
                "Chinese (Hong Kong) — ‪中文（香港）‬"), ZH_CN("zh-CN", "Chinese (Simplified) — ‪中文（简体）‬"), ZH_TW(
                "zh-TW", "Chinese (Traditional) — ‪繁體中文‬"), HR("hr", "Croatian — ‪hrvatski‬"), CS(
                "cs", "Czech — ‪čeština‬"), DA("da", "Danish — ‪dansk‬"), NL("nl",
                "Dutch — ‪Nederlands‬"), EN_GB("en-GB", "English (United Kingdom)"), EN("en",
                "English (United States)"), ET("et", "Estonian — ‪eesti‬"), FIL("fil", "Filipino"), FI(
                "fi", "Finnish — ‪suomi‬"), FR_CA("fr-CA", "French (Canada) — ‪français (Canada)‬"), FR(
                "fr", "French (France) — ‪français (France)‬"), GL("gl", "Galician — ‪galego‬"), DE(
                "de", "German — ‪Deutsch‬"), EL("el", "Greek — ‪Ελληνικά‬"), GU("gu",
                "Gujarati — ‪ગુજરાતી‬"), IW("iw", "Hebrew — ‫עברית‬"), HI("hi", "Hindi — ‪हिन्दी‬"), HU(
                "hu", "Hungarian — ‪magyar‬"), IS("is", "Icelandic — ‪íslenska‬"), ID("id",
                "Indonesian — ‪Bahasa Indonesia‬"), IT("it", "Italian — ‪italiano‬"), JA("ja",
                "Japanese — ‪日本語‬"), KN("kn", "Kannada — ‪ಕನ್ನಡ‬"), KO("ko", "Korean — ‪한국어‬"), LV(
                "lv", "Latvian — ‪latviešu‬"), LT("lt", "Lithuanian — ‪lietuvių‬"), MS("ms",
                "Malay — ‪Bahasa Melayu‬"), ML("ml", "Malayalam — ‪മലയാളം‬"), MR("mr",
                "Marathi — ‪मराठी‬"), NO("no", "Norwegian — ‪norsk‬"), FA("fa", "Persian — ‫فارسی‬"), PL(
                "pl", "Polish — ‪polski‬"), PT_BR("pt-BR",
                "Portuguese (Brazil) — ‪português(Brasil)‬"), PT_PT("pt-PT",
                "Portuguese (Portugal) — ‪português(Portugal)‬"), RO("ro", "Romanian — ‪română‬"), RU(
                "ru", "Russian — ‪русский‬"), SR("sr", "Serbian — ‪Српски‬"), SK("sk",
                "Slovak — ‪slovenčina‬"), SL("sl", "Slovenian — ‪slovenščina‬"), ES_419("es-419",
                "Spanish (Latin America) — ‪español(Latinoamérica)‬"), ES("es",
                "Spanish (Spain) — ‪español (España)‬"), SW("sw", "Swahili — ‪Kiswahili‬"), SV(
                "sv", "Swedish — ‪svenska‬"), TA("ta", "Tamil — ‪தமிழ்‬"), TE("te",
                "Telugu — ‪తెలుగు‬"), TH("th", "Thai — ‪ไทย‬"), TR("tr", "Turkish — ‪Türkçe‬"), UK(
                "uk", "Ukrainian — ‪українська‬"), UR("ur", "Urdu — ‫اردو‬"), VI("vi",
                "Vietnamese — ‪Tiếng Việt‬"), ZU("zu", "Zulu — ‪isiZulu‬");

        private final String code;
        private final String label;

        private PlusOneLanguage(final String code, final String label) {
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

    /**
     * Defines when the +1 tag should be parsed.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum TagParsingMode {
        /**
         * Tags should be parsed on page load (default).
         */
        ONLOAD,
        /**
         * Tags should be parsed explicitly.
         */
        EXPLICIT
    }

    private boolean asynchronous = true;
    private boolean HTML5ValidSyntax = true;
    private int width = 300;
    private PlusOneLanguage language = PlusOneLanguage.EN;
    private TagParsingMode tagParsingMode = TagParsingMode.ONLOAD;

    public GooglePlusOneOptions() {
        super();
    }

    public GooglePlusOneOptions(final boolean asynchronous, final boolean hTML5ValidSyntax, final int width, final PlusOneLanguage language, final TagParsingMode tagParsingMode) {
        super();
        this.asynchronous = asynchronous;
        HTML5ValidSyntax = hTML5ValidSyntax;
        this.width = width;
        this.language = language;
        this.tagParsingMode = tagParsingMode;
    }

    /**
     * @return the language
     */
    public PlusOneLanguage getLanguage() {
        return language;
    }

    /**
     * @return the tagParsingMode
     */
    public TagParsingMode getTagParsingMode() {
        return tagParsingMode;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the asynchronous
     */
    public boolean isAsynchronous() {
        return asynchronous;
    }

    /**
     * @return the hTML5ValidSyntax
     */
    public boolean isHTML5ValidSyntax() {
        return HTML5ValidSyntax;
    }

    /**
     * @param asynchronous the asynchronous to set
     */
    public void setAsynchronous(final boolean asynchronous) {
        this.asynchronous = asynchronous;
    }

    /**
     * @param hTML5ValidSyntax the hTML5ValidSyntax to set
     */
    public void setHTML5ValidSyntax(final boolean hTML5ValidSyntax) {
        HTML5ValidSyntax = hTML5ValidSyntax;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(final PlusOneLanguage language) {
        this.language = language;
    }

    /**
     * @param tagParsingMode the tagParsingMode to set
     */
    public void setTagParsingMode(final TagParsingMode tagParsingMode) {
        this.tagParsingMode = tagParsingMode;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(final int width) {
        this.width = width;
    }

}
