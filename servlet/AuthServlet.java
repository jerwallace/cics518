package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.servlet.*;
import javax.servlet.http.*;

public class AuthServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String PASSWORD = "nosleep"; // Obviously a very, very bad idea!

	// count uses 
	public static int i = 0;
	public static int j = 0;

	/** */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(this.getClass().getName() + " [" + i++ + "]<br />");

		String pw = request.getParameter("password");
		if(pw==null){
			out.println("no password given <br />");
		} else {
			if(login("root", pw)) out.println("logged in, correct password <br />");
			else out.println("login failure : " + pw + "<br />");
		} 
		
		out.close();
	}

	/** test against constant
	 *
	 * TODO: Read a user and password combination from a file formated as follows:
	 * 
	 * salt 5d681df2-2e8b-432d-93f2-25c2fec8aa1a
	 * admin 36450b9fca954e93771816b01008807d
	 * your_name 36450b9fca954e93771816b0100880aa
	 * 
	 * of course if you choose SHA-256 the hashes are larger like:
	 * admin d13477f0b3b80d3b5d0c689768396560f2d73c4325efb3a0bacf233ecb6c31a0
	 * 
	 */
	public boolean login(final String user, final String pass) {
		
		// TODO: add lookup for user's hash in a file instead!
		
		String key = getHash(PASSWORD); 
		String hashed = getHash(pass);
		if(key.equals(hashed)) return true;
			
		return false;
	}

	/** get a hashed or hex string */
	public static String getHash(final String password) {
		
		 MessageDigest md;
		 try {
			md = MessageDigest.getInstance("SHA-256"); // "MD5"); 
		 } catch (NoSuchAlgorithmException e) {
			return null;
		 }
	     
		 md.update(password.getBytes());
	     byte byteData[] = md.digest();
	 
	     StringBuffer sb = new StringBuffer();
	     for (int i = 0; i < byteData.length; i++) 
        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
 
        System.out.println(j++ + " password: " + password + "\n hashed: " + sb.toString());
	 
		return sb.toString();
	}

	/** basic test, not used by Jetty */ 
	public static void main(String[] args) throws Exception {
		
		// TODO: generate the salt once, and save to disk 
		String uuid = UUID.randomUUID().toString();
		System.out.println("uuid = " + uuid);

		// is more hashing better security? 
		String pw1 = AuthServlet.getHash(AuthServlet.getHash("password" + uuid) + uuid);
		String pw2 = AuthServlet.getHash(AuthServlet.getHash("passworD" + uuid) + uuid);

		if (!pw1.equals(pw2)) {
			System.out.println("the passwords do not match");
		} else {
			System.out.println("the passwords match");
		}
	}
}
