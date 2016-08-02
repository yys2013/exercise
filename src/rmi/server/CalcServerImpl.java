package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServerImpl extends UnicastRemoteObject implements CalcServer {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected CalcServerImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        int result = a + b;
        return result;
    }

}
