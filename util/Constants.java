/*
 * Copyright 2002-2013 Peter Brandt-Erichsen, Brad Zdanivsky, Ardeshir Bagheri, All Rights Reserved.
 */

package util;

/**
 * Shared system constants.
 * 
 * Created: 2002.05.18
 * 
 * @author Peter Brandt-Erichsen
 */
public class Constants {

	// list of server-side resources
	public static final String[] resources = {	
		"/javadoc", "index.html", "linkTest.html", "imageTest.html", "mediaTypes.html",
	 	"images/working.gif", "images/hippie.gif", "images/car.jpg",
		"images/langara_logo.jpg", "images/mosaic.gif", "files/test.txt",
		"files/WebServer.class", "files/webserver.jar",
		"files/WebServer.java" };

	// configuration constants
	public static final int DEFAULT_PORT = 80;
	public static final int DEFAULT_BUFFER_SIZE = 2048;

	// text formatting constants
	public static final String CRLF = "\r\n";

	// web server parameters
	public static final String SERVER_IDENTIFICATION = "";
	public static String SERVER_IDENTIFICATION_FOOTER = null;

	public static final String HTTP_VERSION = "";
	public static final String DEFAULT_DIRECTORY = "";
	public static final String DEFAULT_RESOURCE_IDENTIFIER = "";
	public static final String ADMIN_EMAIL = "";

	/** Constructs the server's footer identification string */
	public static void setFooterIdentification(String footer) {}

}// end class
