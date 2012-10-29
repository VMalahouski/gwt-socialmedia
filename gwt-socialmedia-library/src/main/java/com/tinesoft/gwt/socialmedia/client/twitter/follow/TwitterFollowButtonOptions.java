
package com.tinesoft.gwt.socialmedia.client.twitter.follow;

import com.tinesoft.gwt.socialmedia.client.twitter.TwitterOptions;

/**
 * Class defining the options for the Twitter 'Share' button.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class TwitterFollowButtonOptions extends TwitterOptions {

    /**
     * Defines the alignement of the button (left or right).
     * 
     * @author Tine Kondo<kondotine@gmail.com>
     * @version $Id$
     */
    public enum ButtonAlignement {
        LEFT, RIGHT
    }

    private String userAccount = "tinesoft";
    private boolean showCount = false;
    private boolean showScreenName = true;
    private int width = 300;
    private ButtonAlignement alignement = ButtonAlignement.LEFT;

    public TwitterFollowButtonOptions() {
        super();
        setButtonText("Follow @tinesoft");
    }

    public TwitterFollowButtonOptions(final String userAccount, final boolean showCount, final boolean showScreenName, final int width, final ButtonAlignement alignement, final TwitterLanguage language, final boolean largeButton, final boolean unsubscribeFromPersonalization, final String buttonText) {
        super(language, largeButton, unsubscribeFromPersonalization, buttonText);

        this.userAccount = userAccount;
        this.showCount = showCount;
        this.showScreenName = showScreenName;
        this.width = width;
        this.alignement = alignement;
    }

    /**
     * @return the alignement
     */
    public ButtonAlignement getAlignement() {
        return alignement;
    }

    /**
     * @return the userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the showCount
     */
    public boolean isShowCount() {
        return showCount;
    }

    /**
     * @return the showScreenName
     */
    public boolean isShowScreenName() {
        return showScreenName;
    }

    /**
     * @param alignement the alignement to set
     */
    public void setAlignement(final ButtonAlignement alignement) {
        this.alignement = alignement;
    }

    /**
     * @param showCount the showCount to set
     */
    public void setShowCount(final boolean showCount) {
        this.showCount = showCount;
    }

    /**
     * @param showScreenName the showScreenName to set
     */
    public void setShowScreenName(final boolean showScreenName) {
        this.showScreenName = showScreenName;
    }

    /**
     * @param userAccount the userAccount to set
     */
    public void setUserAccount(final String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(final int width) {
        this.width = width;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TwitterFollowButtonOptions [userAccount=" + userAccount + ", showCount="
               + showCount + ", showScreenName=" + showScreenName + ", width=" + width
               + ", alignement=" + alignement + ", language=" + getLanguage() + ", isLargeButton="
               + isLargeButton() + ", isUnsubscribeFromPersonalization="
               + isUnsubscribeFromPersonalization() + ", buttonText=" + getButtonText() + "]";
    }

}
