package jc03_first_ide_app;

public class Main2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = 2;
		b = 3;
		c = 1;

		double discriminant = Math.pow(b, 2) - 4 * a * c;

		double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

		System.out.println("Корень 1: " + root1);
		System.out.println("Корень 2: " + root2);

	}

}
