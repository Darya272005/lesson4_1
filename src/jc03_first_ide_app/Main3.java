package jc03_first_ide_app;

public class Main3 {

	public static void main(String[] args) {

		double a = 3.5;
		double b = 4.2;
		double angleY = Math.toRadians(30);

		double area = (1.0 / 2.0) * a * b * Math.sin(angleY);

		System.out.println("Площадь треугольника: " + area);

	}

}
