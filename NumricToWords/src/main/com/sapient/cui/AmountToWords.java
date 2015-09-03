/**
 * 
 */
package main.com.sapient.cui;
/**
 * @author spra26
 *
 */
public class AmountToWords {
	
	
	
	private static final String[] largeNames = {
		"",
		" thousand",
		" million",
		" billion",
		" trillion",
		" quadrillion",
		" quintillion"
	};

	private static final String[] tensNames = {
		"",
		" ten",
		" twenty",
		" thirty",
		" forty",
		" fifty",
		" sixty",
		" seventy",
		" eighty",
		" ninety"
	};

	private static final String[] unitNames = {
		"",
		" one",
		" two",
		" three",
		" four",
		" five",
		" six",
		" seven",
		" eight",
		" nine",
		" ten",
		" eleven",
		" twelve",
		" thirteen",
		" fourteen",
		" fifteen",
		" sixteen",
		" seventeen",
		" eighteen",
		" nineteen"
	};

	public boolean isValidAmount(int amount){
		if(amount<0){
			return false;
		}

		return true;
	}


	public String convertLessThanThousand(int tempAmount) {
		String current;

		if (tempAmount % 100 < 20){
			current = unitNames[tempAmount % 100];
			tempAmount /= 100;
		}
		else {
			current = unitNames[tempAmount % 10];
			tempAmount /= 10;

			current = tensNames[tempAmount % 10] + current;
			tempAmount /= 10;
		}
		if (tempAmount == 0) return current;
		return unitNames[tempAmount] + " hundred" + current;
	}

	public String convertAmountToWords(int amount) throws Exception{
		if(amount==0){
			return "Zero";
		}
    
		String currentWord= "";
		int place=0;
		if(isValidAmount(amount)){
			do{

				int tempAmount= amount%1000;
				if(tempAmount != 0){
					currentWord = convertLessThanThousand(tempAmount) + largeNames[place] + currentWord;
				}
				place++;
				amount /= 1000;

			}while(amount!=0);
		}
		else{
			throw new Exception();
		
		}
		return currentWord;
	}


}
