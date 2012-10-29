
package com.tinesoft.gwt.socialmedia.client.twitter.share;

import com.tinesoft.gwt.socialmedia.client.twitter.TwitterOptions;

/**
 * Class defining the options for the Twitter 'Share' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterShareButtonOptions extends TwitterOptions {

    /**
     * Defines the position of the count box.
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum CountBoxPosition {
        NONE, VERTICAL, HORIZONTAL
    }

    private String urlToShare = "http://www.tinesoft.com";
    private String tweetText = "";
    private boolean displayAccount = true;
    private String viaAccount = "";
    private String relatedAccounts = "";
    private String hashtags = "";
    private CountBoxPosition countBoxPosition = CountBoxPosition.HORIZONTAL;

    public TwitterShareButtonOptions() {
        super();
        setButtonText("Tweet");
    }

    public TwitterShareButtonOptions(final String urlToFollow, final String tweetText, final boolean displayAccount, final String viaAccount, final String relatedAccounts, final String hashtags, final CountBoxPosition countBoxPosition, final TwitterLanguage language, final boolean largeButton, final boolean unsubscribeFromPersonalization, final String buttonText) {
        super(language, largeButton, unsubscribeFromPersonalization, buttonText);
        this.urlToShare = urlToFollow;
        this.tweetText = tweetText;
        this.displayAccount = displayAccount;
        this.viaAccount = viaAccount;
        this.relatedAccounts = relatedAccounts;
        this.hashtags = hashtags;
        this.countBoxPosition = countBoxPosition;
    }

    /**
     * @return the countBoxPosition
     */
    public CountBoxPosition getCountBoxPosition() {
        return countBoxPosition;
    }

    /**
     * @return the hashtags
     */
    public String getHashtags() {
        return hashtags;
    }

    /**
     * @return the relatedAccounts
     */
    public String getRelatedAccounts() {
        return relatedAccounts;
    }

    /**
     * @return the tweetText
     */
    public String getTweetText() {
        return tweetText;
    }

    /**
     * @return the urlToShare
     */
    public String getUrlToShare() {
        return urlToShare;
    }

    /**
     * @return the viaAccount
     */
    public String getViaAccount() {
        return viaAccount;
    }

    /**
     * @return the displayAccount
     */
    public boolean isDisplayAccount() {
        return displayAccount;
    }

    /**
     * @param countBoxPosition the countBoxPosition to set
     */
    public void setCountBoxPosition(final CountBoxPosition countBoxPosition) {
        this.countBoxPosition = countBoxPosition;
    }

    /**
     * @param displayAccount the displayAccount to set
     */
    public void setDisplayAccount(final boolean displayAccount) {
        this.displayAccount = displayAccount;
    }

    /**
     * @param hashtags the hashtags to set
     */
    public void setHashtags(final String hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * @param relatedAccounts the relatedAccounts to set
     */
    public void setRelatedAccounts(final String relatedAccounts) {
        this.relatedAccounts = relatedAccounts;
    }

    /**
     * @param tweetText the tweetText to set
     */
    public void setTweetText(final String tweetText) {
        this.tweetText = tweetText;
    }

    /**
     * @param urlToShare the urlToShare to set
     */
    public void setUrlToShare(final String urlToFollow) {
        this.urlToShare = urlToFollow;
    }

    /**
     * @param viaAccount the viaAccount to set
     */
    public void setViaAccount(final String viaAccount) {
        this.viaAccount = viaAccount;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TwitterFollowButtonOptions [urlToShare=" + urlToShare + ", tweetText=" + tweetText
               + ", displayAccount=" + displayAccount + ", viaAccount=" + viaAccount
               + ", relatedAccounts=" + relatedAccounts + ", hashtags=" + hashtags
               + ", countBoxPosition=" + countBoxPosition + ", language=" + getLanguage()
               + ", isLargeButton=" + isLargeButton() + ", isUnsubscribeFromPersonalization="
               + isUnsubscribeFromPersonalization() + "]";
    }

}
