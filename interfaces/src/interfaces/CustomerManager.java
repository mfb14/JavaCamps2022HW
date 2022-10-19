	package interfaces;

public class CustomerManager {
	
	private Logger [] loggers;
	/**
	 * @param logger
	 */
	public CustomerManager(Logger [] logger) {
	
		this.loggers = logger;
	}

	public void add(Customer customer) {
		System.out.println("Müşteri eklendi:" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		
		
		/*******************************************
		 * Yanlış kodlama
		 *DatabaseLogger databaseLogger = new DatabaseLogger();
		 *databaseLogger.log(customer.getFirstName() + " Veritabanına loglandı");
		 ******************************************** 
		 **/
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi:" + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

}
