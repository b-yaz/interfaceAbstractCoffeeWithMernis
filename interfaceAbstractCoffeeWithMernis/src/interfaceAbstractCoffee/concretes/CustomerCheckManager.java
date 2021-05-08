package interfaceAbstractCoffee.concretes;

import interfaceAbstractCoffee.abstracts.CustomerCheckService;
import interfaceAbstractCoffee.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}
	
	
}
