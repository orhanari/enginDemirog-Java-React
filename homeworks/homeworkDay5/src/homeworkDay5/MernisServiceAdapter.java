package homeworkDay5;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{

	boolean getCheck = false;
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy clientCheck = new KPSPublicSoapProxy();
		try {
			getCheck = clientCheck.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), Integer.parseInt(customer.getYearOfBirth()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getCheck;
	}

}
