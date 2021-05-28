// A Java program for a Client
import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 * The type Client.
 */
public class Client
{
    // initialize socket and input output streams
    private Socket socket		 = null;
    private DataInputStream input = null;
    private DataOutputStream out	 = null;

    ObjectInputStream objectInput = null;

    // constructor to put ip address and port

    /**
     * Instantiates a new Client.
     *
     * @param address the address of server
     * @param port    the port
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    public Client(String address, int port) throws IOException, ClassNotFoundException {
        // establish a connection
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // takes input from terminal
            input = new DataInputStream(System.in);

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());

            objectInput = new ObjectInputStream(socket.getInputStream()); //Error Line!

        }
        catch(UnknownHostException u)
        {
            System.out.println(u);
        }
        catch(IOException i)
        {
            System.out.println(i);
        }

        // string to read message from input
        String line = "";

        // keep reading until "Over" is input
        while (!line.equals("Over"))
        {

            try
            {
                line = input.readLine();
                out.writeUTF(line);
            }
            catch(IOException i)
            {
                System.out.println(i);
            }
            if (line.equals("Send")){
                ArrayList<Message> messages= (ArrayList<Message>) objectInput.readObject();
                messages.forEach((msg) -> System.out.println(msg.getText()));
            }

        }

        // close the connection
        try
        {
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }


    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Client client = new Client("127.0.0.1", 5000);
    }
}
