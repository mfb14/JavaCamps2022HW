package WeekOne;

public class recapDemo {

	public static void main(String[] args) {
		
		double[] list = { 4.9, 6.8, 4.3, 5.6 ,-3.8, 7.9};
		double total = 0;
		double max = list[0];
		for (double number : list) {
			 max = max<number?number:max;
			 total = total+number;
			
		}
		System.out.println("Sum = " + total);
		System.out.println("Biggest Number = " + max);

	}

}
