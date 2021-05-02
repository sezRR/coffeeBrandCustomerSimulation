import java.util.Calendar;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(2005, 8, 9);
		
		customerManager.save(new Customer(1, "Sezer", "Tetik", dateOfBirth, "11555362086"));
	}

}
