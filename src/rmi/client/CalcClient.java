package rmi.client;

import java.rmi.Naming;

import rmi.server.CalcServer;

public class CalcClient {

    public static void main(String[] args) throws Exception {
        
        CalcServer calcServer = (CalcServer)Naming.lookup("rmi://localhost:9998/calc");
        int iResult = calcServer.add(8, 9);
        System.out.println(iResult);
        System.out.println("rmi add ok !");
    }

}
