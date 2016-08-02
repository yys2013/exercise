package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcServer extends Remote{

    
    public int add(int a, int b) throws RemoteException;
    
}
