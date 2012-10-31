
package com.tinesoft.gwt.socialmedia.showcase.client.core.view;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.tinesoft.gwt.socialmedia.client.ui.FacebookLikeButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.GooglePlusOneButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.GoogleShareButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.LinkedInFollowButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.LinkedInRecommendButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.LinkedInShareButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.TwitterFollowButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.TwitterShareButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.ViadeoSendButtonTag;
import com.tinesoft.gwt.socialmedia.client.ui.ViadeoShareButtonTag;
import com.tinesoft.gwt.socialmedia.showcase.client.core.handler.HomePageUiHandlers;
import com.tinesoft.gwt.socialmedia.showcase.client.core.presenter.HomePagePresenter;
import com.tinesoft.gwt.socialmedia.showcase.client.resources.ShowcaseResources;

/**
 * Home page view.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public class HomePageView extends ViewWithUiHandlers<HomePageUiHandlers> implements HomePagePresenter.MyView {

    public interface Binder extends UiBinder<Widget, HomePageView> {
    }

    private final Widget widget;

    final ShowcaseResources res;

    @UiField(provided = true)
    GooglePlusOneButtonTag plusOneButtonTag;

    @UiField(provided = true)
    GoogleShareButtonTag shareButtonTag;

    @UiField(provided = true)
    FacebookLikeButtonTag fbLikeButtonTag;

    @UiField(provided = true)
    TwitterShareButtonTag twitterShareButtonTag;

    @UiField(provided = true)
    TwitterFollowButtonTag twitterFollowButtonTag;

    @UiField(provided = true)
    LinkedInShareButtonTag linkedInShareButtonTag;

    @UiField(provided = true)
    LinkedInFollowButtonTag linkedInFollowButtonTag;

    @UiField(provided = true)
    LinkedInRecommendButtonTag linkedInRecommendButtonTag;

    @UiField(provided = true)
    ViadeoShareButtonTag viadeoShareButtonTag;

    @UiField(provided = true)
    ViadeoSendButtonTag viadeoSendButtonTag;

    @Inject
    public HomePageView(final Binder binder, final ShowcaseResources resources, final ViadeoSendButtonTag viadeoSendButtonTag, final ViadeoShareButtonTag viadeoShareButtonTag, final GooglePlusOneButtonTag plusOneButtonTag, final GoogleShareButtonTag shareButtonTag, final FacebookLikeButtonTag fbLikeButtonTag, final TwitterShareButtonTag twitterShareButtonTag, final TwitterFollowButtonTag twitterFollowButtonTag, final LinkedInShareButtonTag linkedInShareButtonTag, final LinkedInFollowButtonTag linkedInFollowButtonTag, final LinkedInRecommendButtonTag linkedInRecommendButtonTag) {
        this.plusOneButtonTag = plusOneButtonTag;
        this.shareButtonTag = shareButtonTag;
        this.fbLikeButtonTag = fbLikeButtonTag;
        this.twitterShareButtonTag = twitterShareButtonTag;
        this.twitterFollowButtonTag = twitterFollowButtonTag;
        this.linkedInShareButtonTag = linkedInShareButtonTag;
        this.linkedInFollowButtonTag = linkedInFollowButtonTag;
        this.linkedInRecommendButtonTag = linkedInRecommendButtonTag;
        this.viadeoShareButtonTag = viadeoShareButtonTag;
        this.viadeoSendButtonTag = viadeoSendButtonTag;

        widget = binder.createAndBindUi(this);
        res = resources;
        initialize();
    }

    @Override
    public Widget asWidget() {
        return widget;
    }

    private void initialize() {

    }

}
