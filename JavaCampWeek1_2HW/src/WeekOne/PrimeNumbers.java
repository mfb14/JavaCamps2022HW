package WeekOne;


import java.util.Scanner;

public class PrimeNumbers {
	static boolean primeNumber(int number) {
		 for (int i = 1; i < number; i++) {
			return number%i==0?true:false;
		}
		 return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		int number = sc.nextInt();
		boolean isRrime = true;
		
		
		
		isRrime = number < 2 ? false:primeNumber(number);
		
		String message = isRrime==true ?"Number is prime":"Number is not prime";
		System.out.println(message);
		sc.close();
		
	}

}
