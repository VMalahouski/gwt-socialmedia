
package com.tinesoft.gwt.socialmedia.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.tinesoft.gwt.socialmedia.client.facebook.like.FacebookLikeButton;
import com.tinesoft.gwt.socialmedia.client.facebook.like.FacebookLikeButtonImpl;
import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButton;
import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonImpl;
import com.tinesoft.gwt.socialmedia.client.google.share.GoogleShareButton;
import com.tinesoft.gwt.socialmedia.client.google.share.GoogleShareButtonImpl;
import com.tinesoft.gwt.socialmedia.client.linkedin.share.LinkedInShareButton;
import com.tinesoft.gwt.socialmedia.client.linkedin.share.LinkedInShareButtonImpl;
import com.tinesoft.gwt.socialmedia.client.twitter.follow.TwitterFollowButton;
import com.tinesoft.gwt.socialmedia.client.twitter.follow.TwitterFollowButtonImpl;
import com.tinesoft.gwt.socialmedia.client.twitter.share.TwitterShareButton;
import com.tinesoft.gwt.socialmedia.client.twitter.share.TwitterShareButtonImpl;

/**
 * Module with default GWT Social Media bindings. You can use <b>
 * {@code install(new SocialMediaModule());}</b> instead of manually binding the different classes
 * to their default implementation.
 * 
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 * @version $Id$
 */
public class SocialMediaModule extends AbstractGinModule {

    @Override
    protected void configure() {

        bind(GoogleShareButton.class).to(GoogleShareButtonImpl.class).asEagerSingleton();
        bind(GooglePlusOneButton.class).to(GooglePlusOneButtonImpl.class).asEagerSingleton();

        bind(FacebookLikeButton.class).to(FacebookLikeButtonImpl.class).asEagerSingleton();

        bind(TwitterShareButton.class).to(TwitterShareButtonImpl.class).asEagerSingleton();
        bind(TwitterFollowButton.class).to(TwitterFollowButtonImpl.class).asEagerSingleton();

        bind(LinkedInShareButton.class).to(LinkedInShareButtonImpl.class).asEagerSingleton();

    }

}
