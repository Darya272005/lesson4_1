package jc03_first_ide_app;

public class Main11 {

	public static void main(String[] args) {

		int number = 1234;

		int evenProduct = 1;
		int oddProduct = 1;

		while (number != 0) {
			int digit = number % 10;

			if (digit % 2 == 0) {
				evenProduct *= digit;
			} else {
				oddProduct *= digit;
			}

			number /= 10;
		}

		double quotient = (double) oddProduct / evenProduct;

		System.out.println("Частное произведений четных и нечетных цифр: " + quotient);

	}

}
