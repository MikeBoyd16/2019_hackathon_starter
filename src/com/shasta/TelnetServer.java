/**
 * Multithreaded server that users can telnet into.
 * <p>
 * @author Michael Boyd
 * @since 2019-04-27
 */
package com.shasta;
import com.shasta.threaded.MultiThreadedServer;

public class TelnetServer
{
    /**
     * Port to listen on
     */
    private static final int port = 7777;

    /**
     * Server Object
     */
    private static MultiThreadedServer server;

    /**
     * Entry point for the Telnet Server Program.
     * @param args N/A
     */
    public static void main(String[] args)
    {
        System.out.println(String.format("Starting server on port %d.", port));

        server = new MultiThreadedServer(port);
        Thread main = new Thread(server);
        main.start();
        try
        {
            // Keep the server open indefinitely.
            main.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Stopping Server.");
        server.stop();
    }
}


