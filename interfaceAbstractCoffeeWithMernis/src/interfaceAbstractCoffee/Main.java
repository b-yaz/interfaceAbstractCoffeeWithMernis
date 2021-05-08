package interfaceAbstractCoffee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import interfaceAbstractCoffee.abstracts.BaseCustomerManager;
import interfaceAbstractCoffee.adapters.MernisServiceAdapter;
import interfaceAbstractCoffee.concretes.StarbucksCustomerManager;
import interfaceAbstractCoffee.entities.Customer;

public class Main {

	public static void main(String[] args) throws ParseException {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Kenan");
		customer.setLastName("Kulaz");
		customer.setNationalityId("11111111111");
		customer.setDateOfBirth(new SimpleDateFormat("dd.MM.yyyy").parse("05.03.1982"));
		
		
		customerManager.save(customer);
		
	}

}
