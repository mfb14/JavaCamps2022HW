package CreditManagement.business;

import CreditManagement.entities.Customer;

public class CustomerManager {

	private Customer customer;
	private CreditManager creditManager;
	
	public CustomerManager(Customer customer, CreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	

		public void save() {
			System.out.println("Customer Saved");
		}
		public void delete () {
			System.out.println("Customer Deleted");
		}
		public void giveCredit () {
			creditManager.calculate();
			System.out.println("Credit Given");
			creditManager.save();
		}
}
