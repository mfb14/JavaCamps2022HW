package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger [] loggers = {new FileLogger(),new SmsLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer furkan = new Customer(1,"Furkan","Bilen");
		customerManager.add(furkan);
		
	}

}
