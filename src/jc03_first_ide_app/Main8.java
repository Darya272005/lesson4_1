package jc03_first_ide_app;

public class Main8 {

	public static void main(String[] args) {

		char symbol = 'd';

		int charCode = (int) symbol;
		int previousCharCode = charCode - 1;
		int nextCharCode = charCode + 1;

		char previousSymbol = (char) previousCharCode;
		char nextSymbol = (char) nextCharCode;

		System.out.println("Порядковый номер символа '" + symbol + "': " + charCode);
		System.out.println("Предыдущий символ: '" + previousSymbol + "'");
		System.out.println("Следующий символ: '" + nextSymbol + "'");

	}

}
