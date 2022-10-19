package interfaces;

/* #Bu tarz	 sıklıkla kullandığımız araç görevi görecek sınıflarımızı
 * sık sık new'lemek istemeyiz onun yerine onu static yaparız
 * 
 * #Staticleri sürekli hemen her yerde kullandığımız operasyoonlar için kullanırız
 * */

public class Utils {
	public static void runLoggers(Logger [] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
		
		
	}

}
