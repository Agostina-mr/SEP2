package sharedsummerhouse.client.network;

import sharedsummerhouse.client.model.Municipality;
import sharedsummerhouse.client.model.MunicipalityList;
import sharedsummerhouse.client.model.RegionalAdmin;
import sharedsummerhouse.shared.network.ClientCallback;

import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class RMIClient implements Client, ClientCallback
{



  @Override public void addMunicipality(Municipality municipality)
  {

  }

  @Override public void addRegionalAdmin(RegionalAdmin regionalAdmin)
  {

  }

  @Override public void unregisterClient()
  {

  }

  @Override public ArrayList<MunicipalityList> getMunicipalities()
  {
    return null;
  }

  @Override public Municipality getMunicipality()
  {
    return null;
  }

  @Override public void startClient()
  {

  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {

  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {

  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {

  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {

  }

  @Override public void updateMunicipalities() throws RemoteException
  {

  }

  @Override public void updateMunicipality() throws RemoteException
  {

  }
}
