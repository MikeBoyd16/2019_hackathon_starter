/**
 * Client object that contains methods to handle connects, disconnects, and messages for one client.
 * <p>
 * @author Michael Boyd
 * @since 2019-04-27
 */
package com.shasta.client;
import com.shasta.threaded.ClientRunnable;
import java.net.Socket;

public class Client extends ClientRunnable
{
    public Client(Socket clientSocket)
    {
        super(clientSocket);
        System.out.println(getClientSocket().getLocalAddress() +
                ": New Connection. Port: " + getClientSocket().getPort());
    }

    /**
     * Called when a client connects
     */
    @Override
    public void handleConnect()
    {
        //TODO IMPLEMENT
    }

    /**
     * Called when a client disconnects
     */
    @Override
    public void handleDisconnect()
    {
        //TODO IMPLEMENT
    }

    /**
     * Handle client input
     * @param str The message to handle
     */
    @Override
    protected void handleMessage(String str)
    {
        //TODO IMPLEMENT
    }
}
