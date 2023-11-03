package jc03_first_ide_app;

public class Main5 {

	public static void main(String[] args) {

		double angleInRadians = Math.PI / 3.0; 

		
		double degrees = Math.toDegrees(angleInRadians);

		
		double minutes = (degrees - (int) degrees) * 60.0;

		
		double seconds = (minutes - (int) minutes) * 60.0;

		System.out.println("Угол в градусах: " + (int) degrees);
		System.out.println("Угол в минутах: " + (int) minutes);
		System.out.println("Угол в секундах: " + seconds);

	}

}

