
import java.net.*;
import java.io.*;
 
public class Client
{
    // initialize socket and input output streams
    private Socket socket            = null;
    private DataInputStream  input   = null;
    private DataOutputStream out     = null;
 
    // constructor to put ip address and port
    public Client(String address, int port)
    {
        // establish a connection
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal
            input  = new DataInputStream(System.in);
 
            // sends output to the socket
            out    = new DataOutputStream(socket.getOutputStream());

       ne = input.readLine();
                out.writeUTF(line);
            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }











B
B
B
B
B

A
A
A
A
A
A
A
A
B
B
B
B
B
B
B
B
B
 }
catch(UnkwnHostException u)
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

