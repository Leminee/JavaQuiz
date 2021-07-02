package client;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

public class ClientRMI {

    private static final String URL = "rmi://localhost:1099/quiz";

    public static void main(String[] args) {
        try {
            IQuizModelAndView stub;
            stub = (IQuizModelAndView) Naming.lookup(URL);
            stub.init();
        } catch (NotBoundException | IOException remoteException ){
            remoteException.printStackTrace();
        }
    }
}
