
package com.tinesoft.gwt.socialmedia.showcase.client.core.presenter;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.tinesoft.gwt.socialmedia.client.google.plusone.GooglePlusOneButtonEvent;
import com.tinesoft.gwt.socialmedia.showcase.client.core.handler.HomePageUiHandlers;
import com.tinesoft.gwt.socialmedia.showcase.client.place.NameTokens;
import com.tinesoft.gwt.socialmedia.showcase.client.util.GWTNotification;

/**
 * Home page presenter.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> implements HomePageUiHandlers {

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    public interface MyView extends View, HasUiHandlers<HomePageUiHandlers> {
    }

    private final PlaceManager placeManager;

    @Inject
    public HomePagePresenter(final EventBus eventBus, final MyView view, final MyProxy proxy, final PlaceManager placeManager) {
        super(eventBus, view, proxy);
        getView().setUiHandlers(this);
        this.placeManager = placeManager;

        eventBus.addHandler(GooglePlusOneButtonEvent.getType(), this);
    }

    @Override
    public void onButtonClicked(final GooglePlusOneButtonEvent event) {
        if (event.isButtonStateOn()) {
            GWTNotification.tray("You have +1'd the URL '" + event.getHref() + "'");
        } else {
            GWTNotification.tray("You have un+1'd the URL '" + event.getHref() + "'");
        }

    }

    @Override
    public void onGooglePlusOneShowcaseClicked() {

    }

    @Override
    protected void revealInParent() {
        RevealContentEvent.fire(this, MainPagePresenter.TYPE_CONTENT_SLOT, this);
    }

}
