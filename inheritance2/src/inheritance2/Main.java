package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Logger [] loggers = {new FileLogger(),new DatabaseLogger()};
		
		customerManager.add(loggers);
	}

}
