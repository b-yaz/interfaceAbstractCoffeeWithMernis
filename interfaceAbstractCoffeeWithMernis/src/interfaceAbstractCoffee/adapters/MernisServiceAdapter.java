package interfaceAbstractCoffee.adapters;

import java.rmi.RemoteException;
import java.util.Calendar;

import interfaceAbstractCoffee.abstracts.PersonCheckService;
import interfaceAbstractCoffee.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(customer.getDateOfBirth());
			
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), cal.get(Calendar.YEAR));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	
}
