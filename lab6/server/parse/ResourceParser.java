/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package server.parse;
import java.io.*;
import java.net.*;

import server.error.*;
import server.handlers.resource.*;
import server.parse.*;
import util.*;


/**
 * Resource Parser
 * Parses an HTTP Request Header for its resource identifier.
 *
 * Typical HTTP-Request Header format:
 *   GET /index.html HTTP/1.0
 *   Accept: image/gif, image/x-xbitmap, image/jpeg, image/pjpeg
 *   Referer: http://bucky.dyndns.org/
 *   Accept-Language: en-ca
 *   User-Agent: Mozilla/4.0 (compatible; MSIE 5.01; Windows NT 5.0)
 *   Host: bucky.dyndns.org
 *   Connection: Keep-Alive
 *
 * Target:
 *    GET /index.html HTTP/1.0
 *
 * Extract:
 *    /index.html
 *
 * Created: 2002.05.18
 * @author Peter Brandt-Erichsen
 */
public class ResourceParser {

   public ResourceParser() {}


   /**
    * Parses the HTTP header, see class level documentation for a full
    * description.
    *
    * @param clientSocket is a reference to the client socket.
    */
   public void parse(Socket clientSocket) throws Exception {

      // input stream

      // retrieve the HTTP request header from the input stream

      // parse the resource identifier
      String resourceIdentifier = null;

      // error check the resource identifier

      // default resource request
      if(resourceIdentifier.equals("/")) {

      }

      // general resource request
      else {

      }
   }


   // Parses an HTTP request header for the resource identifier.
   //
   // Typical format: GET /index.html HTTP/1.0
   //
   // Returns: /index.html
   //
   private String parseResourceIdentifier(String request) {
      return null;
   }

}// end class
