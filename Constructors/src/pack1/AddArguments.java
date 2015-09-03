/**
 * 
 */
package pack1;

/**
 * @author spra26
 *
 */
public class AddArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int sum=0;
		for(String arg: args){
			sum += Integer.parseInt(arg);
		}
		System.out.println("Sum= "+sum);
		}catch (NumberFormatException nfe){
			System.err.println("One of the command line arguements is not an integer");
		}
	}

}
