package interfaceAbstractCoffee.concretes;

import interfaceAbstractCoffee.abstracts.BaseCustomerManager;
import interfaceAbstractCoffee.abstracts.CustomerCheckService;
import interfaceAbstractCoffee.abstracts.PersonCheckService;
import interfaceAbstractCoffee.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private PersonCheckService customerCheckService;
	public StarbucksCustomerManager(PersonCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer){
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");			
		}
	}

	
}
