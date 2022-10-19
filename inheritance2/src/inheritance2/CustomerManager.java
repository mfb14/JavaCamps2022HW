package inheritance2;
//İş yapan sınıflar (somut sınıflar) newlemek uygun değildir.
public class CustomerManager{
	//Müşteri ekleme kodları
	public void add(Logger [] logger) {
		System.out.println("Müşteri eklendi");
		
		for (Logger logger2 : logger) {
			logger2.log();
		}
		
	}
}
