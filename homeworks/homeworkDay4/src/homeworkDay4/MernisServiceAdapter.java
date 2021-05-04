package homeworkDay4;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{
	
	boolean checkTC = false;
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			checkTC = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), Integer.parseInt(customer.getYearOfBirth()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return checkTC;
	}

}
