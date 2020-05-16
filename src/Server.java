import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    
    private DatagramSocket serverSocket;
    
    private String ip;
    
    private int port;
    	
    public Server(String ip, int port) throws SocketException, IOException{
        this.ip = ip;
        this.port = port;
        // socket used to send
        serverSocket = new DatagramSocket();
    }
    
    public void send() throws IOException{
        // make datagram packet
        byte[] message = ("Multicasting...From the server").getBytes();
        DatagramPacket packet = new DatagramPacket(message, message.length, 
            InetAddress.getByName(ip), port);
        // send packet
        serverSocket.send(packet);
    }
    
    public void close(){
        serverSocket.close();
    }
}