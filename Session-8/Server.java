// A Java program for a Server
import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 * The type Server.
 */
public class Server
{
    //initialize socket and input stream
    private Socket		 socket = null;
    private ServerSocket server = null;
    private DataInputStream in	 = null;
    private ObjectOutputStream out	 = null;

    ArrayList<Message> messages = new ArrayList<>();


    /**
     * Instantiates a new Server.
     *
     * @param port the port
     */
// constructor with port
    public Server(int port)
    {
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            socket = server.accept();
            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            out = new ObjectOutputStream(socket.getOutputStream());

            String line = "";

            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                try
                {
                    line = in.readUTF();
                    if (!line.equals("Send")) {
                        messages.add(new Message(line));
                    }
                    if (line.equals("Send")){
                        out.writeObject(messages);
                    }

                }
                catch(IOException i)
                {
                    System.out.println(i);
                }

            }
            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }


    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
