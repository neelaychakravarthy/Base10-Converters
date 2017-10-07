package hexaDecimalTranslator;

import java.util.Scanner;

public class HexaDecimalTranslatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HexaDecimalTranslator hdt = new HexaDecimalTranslator();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Give me a number : ");
		
		int input = s.nextInt();
		
		hdt.translate(input);
	}

}
