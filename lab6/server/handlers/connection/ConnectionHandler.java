/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package server.handlers.connection;
import java.io.*;
import java.net.*;

import server.error.*;
import server.parse.*;
import util.*;

/**
 * Developing a Simple Web Server.
 *
 * Connection Handler
 * Handles client connection requests.
 *
 * Created: 2002.05.18
 * @author Peter Brandt-Erichsen
 */
public class ConnectionHandler {


   /**
    * Constructs the connection handler
    *
    * @param parser is the reference to the Resource Parser
    */
   public ConnectionHandler(ResourceParser parser) {
   }

   /**
    * Handles a connection request from the client.
    *
    * @param clientSocket is a reference to the client socket.
    */
   public void handleConnection(Socket clientSocket) {

      // sanity checks
      if(clientSocket==null) {
         throw new IllegalArgumentException("the client socket is null");
      }


   }

}// end class
