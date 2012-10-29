
package com.tinesoft.gwt.socialmedia.showcase.client.gin;

import com.gwtplatform.dispatch.shared.SecurityCookie;
import com.gwtplatform.mvp.client.annotations.GaAccount;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.googleanalytics.GoogleAnalyticsNavigationTracker;
import com.tinesoft.gwt.socialmedia.client.gin.SocialMediaModule;
import com.tinesoft.gwt.socialmedia.showcase.client.core.presenter.ErrorPagePresenter;
import com.tinesoft.gwt.socialmedia.showcase.client.core.presenter.HomePagePresenter;
import com.tinesoft.gwt.socialmedia.showcase.client.core.presenter.MainPagePresenter;
import com.tinesoft.gwt.socialmedia.showcase.client.core.view.ErrorPageView;
import com.tinesoft.gwt.socialmedia.showcase.client.core.view.HomePageView;
import com.tinesoft.gwt.socialmedia.showcase.client.core.view.MainPageView;
import com.tinesoft.gwt.socialmedia.showcase.client.place.ClientPlaceManager;
import com.tinesoft.gwt.socialmedia.showcase.client.place.DefaultPlace;
import com.tinesoft.gwt.socialmedia.showcase.client.place.ErrorPlace;
import com.tinesoft.gwt.socialmedia.showcase.client.place.NameTokens;
import com.tinesoft.gwt.socialmedia.showcase.shared.Config;

/**
 * Client GIN-jector module.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public class ClientModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new DefaultModule(ClientPlaceManager.class));

        install(new SocialMediaModule());

        // protect against XSRF attacks
        bindConstant().annotatedWith(SecurityCookie.class).to(Config.SECURITY_COOKIE_NAME);

        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.error);

        // Google Analytics
        // bind(GoogleAnalytics.class).to(GoogleAnalyticsImpl.class).in(Singleton.class);
        bindConstant().annotatedWith(GaAccount.class).to(Config.GOOGLE_ANALYTICS_TRACKING_ID);
        bind(GoogleAnalyticsNavigationTracker.class).asEagerSingleton();

        // ========== //
        // Presenters //
        // ========== //

        // core module
        bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class, MainPageView.class,
                      MainPagePresenter.MyProxy.class);
        bindPresenter(ErrorPagePresenter.class, ErrorPagePresenter.MyView.class,
                      ErrorPageView.class, ErrorPagePresenter.MyProxy.class);

        bindPresenter(HomePagePresenter.class, HomePagePresenter.MyView.class, HomePageView.class,
                      HomePagePresenter.MyProxy.class);

    }
}
