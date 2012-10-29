
package com.tinesoft.gwt.socialmedia.showcase.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;

/**
 * Client bundle for the application css and image resources.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public interface ShowcaseResources extends ClientBundle {

    interface Style extends CssResource {

        String left();

        String right();

        String title();

        String clear();

        String content();

        String container();

        String button();

        String selectedButton();

        String notSelectable();

        String inline();

        String middle();
    }

    /**
     * @return css bundle.
     */
    @Source({ "Style.css" })
    @NotStrict
    Style css();

    /**
     * 
     * @return search image resource.
     */
    @Source("images/search.png")
    ImageResource searchIcon();

    /**
     * 
     * @return edit image resource.
     */
    @Source("images/edit.png")
    ImageResource editIcon();

    /**
     * 
     * @return delete image resource.
     */
    @Source("images/delete.png")
    ImageResource deleteIcon();

    /**
     * 
     * @return google +1 image resource.
     */
    @Source("images/google-plusone.png")
    ImageResource googlePlusOneIcon();

}
