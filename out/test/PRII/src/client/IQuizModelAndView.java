package client;

import java.io.IOException;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IQuizModelAndView extends Remote {
    void init() throws RemoteException, IOException;
}
