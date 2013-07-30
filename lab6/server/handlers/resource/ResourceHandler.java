/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package server.handlers.resource;
import java.io.*;
import java.net.*;
import java.util.*;

import server.error.*;
import util.*;

/**
 * Resource Handler
 * Handles resource requests.
 *
 * Created: 2002.05.23
 * @author Peter Brandt-Erichsen
 */
public class ResourceHandler {


   public ResourceHandler() {}


   /**
    * Streams the contents of the specified resource back to the client.
    *
    * @param clientSocket is the socket connection received from the client
    * @param resourceIdentifier specifies the requested resource
    */
   public void handleRequest(Socket clientSocket, String resourceIdentifier) throws IOException {

      // sanity checks
      if(clientSocket==null) {
         throw new IllegalArgumentException("the client socket is null");
      }
      if(resourceIdentifier==null) {
         throw new IllegalArgumentException("the resource identifier is null");
      }

      // streams
      BufferedOutputStream output = null;
      BufferedInputStream input = null;

      // locate the requested resource
      File file = null;

      // instantiate the streams

      // retrieve the content type

      // if content type not found, display a file not found error to the user

      // construct the HTTP response header

      // output the HTTP header to the client

      // load the requested resource into memory

      // send the resource contents to the client as a stream of bytes

      // flush the output stream

      // close resources
   }

}// end class
