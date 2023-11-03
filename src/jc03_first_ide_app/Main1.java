package jc03_first_ide_app;

public class Main1 {

	public static void main(String[] args) {
		double number;
		
		number=123.456;
		
		String numberString=Double.toString(number);
		
		String [] parts=numberString.split("\\.");
		
		String newNumberString=parts[1]+ "." + parts[0];
		
		double newNumber=Double.parseDouble(newNumberString);
		
		System.out.println("Число с переставленными частями:"+ newNumber);

	}

}
