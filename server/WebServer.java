/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package server;
import java.io.*;
import java.net.*;
import java.lang.*;

import server.error.*;
import server.handlers.connection.*;
import server.log.*;
import server.parse.*;
import util.*;

/**
 * Web Server
 *
 * Created: 2002.05.11
 * @author Peter Brandt-Erichsen
 */
public class WebServer {

   // reference to the connection handler
   private ConnectionHandler connectionHandler = null;

   // reference to the HTTP request parser
   private ResourceParser resourceParser = null;

   // reference to the server socket
   private ServerSocket serverSocket = null;

   // tracks the number of client connection requests
   private static int clientRequestCount = 0;

   // server port number
   private int port = -1;

   // stores the output verbosity level
   private int verbosity = 0;

   // ensures proper initialization
   private boolean initialized = false;


   /**
    * Constructs the server
    */
   public WebServer() {}

   /**
    * Sets the port number for the server.
    *
    * @param port is the specified port number
    */
   public void setPort(int port) {
   }

   /**
    * Sets the verbosity for the server.
    *
    * @param verbosity specifies the level of server output to the console
    */
   public void setVerbosity(int verbosity) {
   }

   /**
    * Initialize the web server and all subsystems.
    */
   public void init() {

      try {
         // ensure a valid port number
         if(port < 0) port = Constants.DEFAULT_PORT;


         // store the web server identification footer in util.Constants
         Constants.setFooterIdentification("..." + " on Port ...");


         // instantiate the resource parser
         System.out.println("- instantiating the Resource Parser");


         // instantiate the connection handler
         System.out.println("- instantiating the Connection Handler");


         // server successfully initialized
         initialized = true;

      }
      catch(Exception e) {
         e.printStackTrace();
         System.out.println(this.getClass().getName() + ".init(): failed initializaton, terminate execution.");
         System.exit(1);
      }
   }

   /**
    * Listens for connection requests from the client.
    */
   public void acceptConnections() {

      // ensure valid server initialization
      if(!initialized) {
         throw new IllegalStateException(this.getClass().getName() + ".acceptConnections(): server not properly initialized, terminate execution.");
      }

   }

   // driver
   public static void main(String args[]) {

      // get the parameters from the command line
      int portNumber = Integer.parseInt(args[0]);
      int verbosity = Integer.parseInt(args[1]);

      // error check
      if(portNumber < 0) portNumber = Constants.DEFAULT_PORT;
      if(verbosity < 0) verbosity = 0;

      System.out.println();
      System.out.println("-- so far so good --");
      System.out.println();
   }

}// end class
