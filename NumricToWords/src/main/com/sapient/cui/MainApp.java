/**
 * 
 */
package main.com.sapient.cui;
import java.util.Scanner;

/**
 * @author spra26
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		String amountInWords = "";
		AmountToWords amountToWords = new AmountToWords();
		
		try {
		 amountInWords = amountToWords.convertAmountToWords(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Amount is:" + amountInWords);
		
		

	}

}
