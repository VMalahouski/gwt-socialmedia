
package com.tinesoft.gwt.socialmedia.client.util;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

public final class DOMUtils {

    /**
     * Returns a {@link NodeList} of all the {@link Element Elements} with a given class name, in
     * the given parent element.
     * 
     * Try first the implementation of DOM's <code>getElementsByClassName</code>. If not present try
     * to use XPATH. If xpath is not supported searches DOM structure.
     * 
     * @param className the name of the class to match on (1 or many class names, space-separated)
     * @return a list containing all the matched elements
     */
    public static JsArray<Element> getElementsByClassName(String className) {
        return getElementsByClassName(className, null, null);
    }

    /**
     * Returns a {@link NodeList} of all the {@link Element Elements} with a given class name, in
     * the given parent element.
     * 
     * Try first the implementation of DOM's <code>getElementsByClassName</code>. If not present try
     * to use XPATH. If xpath is not supported searches DOM structure.
     * 
     * @param className the name of the class to match on (1 or many class names, space-separated)
     * @param tagName the tag name of the elements to match.
     * @return a list containing all the matched elements
     */
    public static JsArray<Element> getElementsByClassName(String className, String tagName) {
        return getElementsByClassName(className, tagName, null);
    }

    /**
     * Returns a {@link NodeList} of all the {@link Element Elements} with a given class name, in
     * the given parent element.
     * 
     * Try first the implementation of DOM's <code>getElementsByClassName</code>. If not present try
     * to use XPATH. If xpath is not supported searches DOM structure.
     * 
     * @param className the name of the class to match on (1 or many class names, space-separated)
     * @param tagName (optional) the tag name of the elements to match.
     * @param parentElement (optional) the parent element to look amongst its children for matches.
     * @return a list containing all the matched elements
     */
    public static native JsArray<Element> getElementsByClassName(String className, String tagName, Element parentElement)
    /*-{
		//native impl.
		if ($doc.getElementsByClassName) {
			getElementsByClassName = function(className, tagName, parentElement) {
				parentElement = parentElement || $doc;
				var elements = parentElement.getElementsByClassName(className), nodeName = (tagName) ? new RegExp(
						"\\b" + tagName + "\\b", "i")
						: null, returnElements = [], current;
				for ( var i = 0, il = elements.length; i < il; i += 1) {
					current = elements[i];
					if (!nodeName || nodeName.test(current.nodeName)) {
						returnElements.push(current);
					}
				}
				alert("elements=" + elements.length);
				return returnElements;
			};
		}
		//xpath impl.
		else if ($doc.evaluate) {
			getElementsByClassName = function(className, tagName, parentElement) {
				tagName = tagName || "*";
				parentElement = parentElement || $doc;
				var classes = className.split(" "), classesToCheck = "", xhtmlNamespace = "http://www.w3.org/1999/xhtml", namespaceResolver = ($doc.$docElement.namespaceURI === xhtmlNamespace) ? xhtmlNamespace
						: null, returnElements = [], elements, node;
				for ( var j = 0, jl = classes.length; j < jl; j += 1) {
					classesToCheck += "[contains(concat(' ', @class, ' '), ' "
							+ classes[j] + " ')]";
				}
				try {
					elements = $doc.evaluate(".//" + tagName + classesToCheck,
							parentElement, namespaceResolver, 0, null);
				} catch (e) {
					elements = $doc.evaluate(".//" + tagName + classesToCheck,
							parentElement, null, 0, null);
				}
				while ((node = elements.iterateNext())) {
					returnElements.push(node);
				}

				return returnElements;
			};
		}
		//DOM impl.
		else {
			getElementsByClassName = function(className, tagName, parentElement) {
				tagName = tagName || "*";
				parentElement = parentElement || $doc;
				var classes = className.split(" "), classesToCheck = [], elements = (tagName === "*" && parentElement.all) ? parentElement.all
						: parentElement.getElementsBytagNameName(tagName), current, returnElements = [], match;
				for ( var k = 0, kl = classes.length; k < kl; k += 1) {
					classesToCheck.push(new RegExp("(^|\\s)" + classes[k]
							+ "(\\s|$)"));
				}
				for ( var l = 0, ll = elements.length; l < ll; l += 1) {
					current = elements[l];
					match = false;
					for ( var m = 0, ml = classesToCheck.length; m < ml; m += 1) {
						match = classesToCheck[m].test(current.className);
						if (!match) {
							break;
						}
					}
					if (match) {
						returnElements.push(current);
					}
				}

				return returnElements;
			};
		}
		return getElementsByClassName(className, tagName, parentElement);
    }-*/;

    /**
     * Utility class. No public constructor.
     */
    private DOMUtils() {

    }
}
