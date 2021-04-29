package sharedsummerhouse.shared.network;

import sharedsummerhouse.client.model.Municipality;
import sharedsummerhouse.client.model.MunicipalityList;
import sharedsummerhouse.client.model.RegionalAdmin;
import sharedsummerhouse.shared.network.ClientCallback;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RMIServer extends Remote
{
  void addMunicipality(Municipality municipality) throws RemoteException;
  void addRegionalAdmin(RegionalAdmin regionalAdmin) throws RemoteException;
  void registerClient(ClientCallback clientCallback) throws RemoteException;
  void unregisterClient(ClientCallback clientCallback) throws RemoteException;
  ArrayList<MunicipalityList> getMunicipalities() throws RemoteException;
  Municipality getMunicipality() throws RemoteException;
}
