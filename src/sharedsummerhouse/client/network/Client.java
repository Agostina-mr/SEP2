package sharedsummerhouse.client.network;

import sharedsummerhouse.client.model.Municipality;
import sharedsummerhouse.client.model.MunicipalityList;
import sharedsummerhouse.client.model.RegionalAdmin;
import sharedsummerhouse.shared.util.PropertyChangeSubject;

import java.util.ArrayList;

public interface Client extends PropertyChangeSubject
{
  void addMunicipality(Municipality municipality);
  void addRegionalAdmin(RegionalAdmin regionalAdmin);
  void unregisterClient();
  ArrayList<MunicipalityList> getMunicipalities();
  Municipality getMunicipality();
  void startClient();
}
