package jc03_first_ide_app;

public class Main7 {

	public static void main(String[] args) {

		int t = 10;
		int p = 3;
		int q = 15;
		int r = 20;

		int newHours = (t + p) % 24;
		int newMinutes = (q + ((t + p) / 24) * 60) % 60;
		int newSeconds = (r + ((t + p) / 24) * 3600) % 60;

		System.out.println("Время через " + p + " часов, " + q + " минут и " + r + " секунд будет: " + newHours + ":"
				+ newMinutes + ":" + newSeconds);

	}

}
