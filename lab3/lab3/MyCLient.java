//GOALS
// 1. to show client code that connects to the server and sends it a message
//
package lab3;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyCLient {

	public static void main(String[] args) throws UnknownHostException,
			IOException, InterruptedException {

		// 1. CONNECT TO THE SERVER AT PORT 4444 
		Socket socket = new Socket("localhost", 4444);

    // WAIT A WHILE FOR SERVER TO GET READY TO RECEIVE!
    Thread.sleep(1000);
		
		// 2. WRITE A MESSAGE TO THE SOCKET TO SEND TO THE SERVER
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.print("Client socket Local Address: " + socket.getLocalAddress() + ":" + socket.getLocalPort());
		out.println("  Client socket Remote Address: " + socket.getRemoteSocketAddress());
		out.flush(); // forces data from buffer to be sent to server
		out.println("Second message.");
		out.flush();
		
		// client dies here

	}
}
