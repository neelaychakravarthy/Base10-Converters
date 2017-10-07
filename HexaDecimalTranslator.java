package hexaDecimalTranslator;

import java.util.ArrayList;
import java.util.HashMap;

public class HexaDecimalTranslator 
{
	public void translate(int input)
	{
		ArrayList<Integer> powers = new ArrayList<Integer>();
		int power;
		int exponent = 0;
		power = (int) Math.pow(16,  exponent);
		
		HashMap<Integer, String> digits = new HashMap<Integer, String>();
		
		digits.put(10, "A");
		digits.put(11,  "B");
		digits.put(12,  "C");
		digits.put(13,  "D");
		digits.put(14,  "E");
		digits.put(15,  "F");
		
		while(power <= input)
		{
			power = (int) Math.pow(16,  exponent);
			if(power <= input)
			{
				powers.add(power);
			}
			exponent++;
		}
		
		int digit;
		
		thisloop : for(int i = powers.size()-1; i >= 0; i--)
		{
			if(powers.get(i) > input)
			{
				System.out.print(0 + " ");
			}
			else
			{
				digit = input/powers.get(i);
				
				for(int key : digits.keySet())
				{
					if(digit == key)
					{
						String newDigit = Integer.toString(digit);
						newDigit = (String) digits.get(digit);
						System.out.print(newDigit + " ");
						input -= powers.get(i) * digit;
						continue thisloop;
					}
				}
				
				System.out.print(digit + " ");
				input -= powers.get(i)*digit;
			}
		}
		
	}
}
