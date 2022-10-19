package WeekOne;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);		
		int perfectNumber = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i < perfectNumber; i++) {
			total = perfectNumber%i==0?total+i:total;
		}
		String message = total==perfectNumber?" is Perfect number.":" is not perfect number.";
		System.out.println(perfectNumber+message);

	}

}
