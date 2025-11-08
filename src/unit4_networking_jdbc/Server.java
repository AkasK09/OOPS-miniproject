package unit4_networking_jdbc;
import java.io.*; import java.net.*;
public class Server {
    public static void main(String[] args)throws IOException{
        ServerSocket server=new ServerSocket(5000);
        System.out.println("Server started...");
        Socket client=server.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println("Client message: "+br.readLine());
        server.close();
    }
}