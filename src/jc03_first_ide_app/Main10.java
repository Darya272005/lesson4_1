package jc03_first_ide_app;

public class Main10 {

	public static void main(String[] args) {

		int M = 1234; 
		int N = 7;

		
		double fraction = (double) M / N - (int) (M / N);

		
		int seniorDigit = (int) (fraction * 10) % 10;

		
		int juniorDigit = M % N;

		System.out.println("Старшая цифра дробной части: " + seniorDigit);
		System.out.println("Младшая цифра целой части: " + juniorDigit);

	}

}
