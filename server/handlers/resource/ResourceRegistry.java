/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package server.handlers.resource;
import java.util.*;

/**
 * Resource Registry
 * Stores all of the content types supported by this web server.
 *
 * The singleton design pattern is implemented to ensure that only one
 * instance of this class is instantiated.
 *
 * Created: 2002.05.24
 * @author Peter Brandt-Erichsen
 */
public class ResourceRegistry {

	// singleton reference to this class
	private static ResourceRegistry singleton = null;

   // stores the media type mappings
   HashMap registry = null;


	// constructor is private to guarantee a singleton instance
	//
   private ResourceRegistry() {
      init();
   }

	/**
	 * Returns a reference to this singleton class
	 */
	public static ResourceRegistry getReference() {
		if(singleton==null) singleton = new ResourceRegistry();
		return singleton;
	}

   /**
    * Returns the content type associated with the specified file extension.
    *
    * The specified resource identifier will have the format:
    *    /index.html
    *
    * This is parsed to get
    *    .html
    *
    * And the associated content type will be returned:
    *    text/html
    */
   public String getContentType(String resourceIdentifier) {

      // sanity checks
      if(registry==null) {
         throw new IllegalStateException(this.getClass().getName() + ".getContentType(): the registry is null");
      }
      if(resourceIdentifier==null) {
         return null;
      }

      // return the content type associated with the file extension
      int index = resourceIdentifier.lastIndexOf(".");

      // error check for malformed resource identifiers
      if(index < 0) {
         return null;
      }
      else {
         return null;
      }
   }

   // Initializes this registry with the supported media-type mappings
   //
   private void init() {

      registry = new HashMap(128);

   }

}// end class
