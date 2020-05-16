import java.io.IOException;

public class Main {
	public static void main(String[] args) {
	    try {
	        final String ip = "239.255.80.84";
	        final int port = 8082;
	        Server server = new Server(ip, port);
	        server.send();
	        server.close();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
	}
}
