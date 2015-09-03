/**
 * 
 */
package mainpack;

/**
 * @author spra26
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Apple ap;
		//System.out.println("Here is all Apple constants");
		
		//use values
		
	//	Apple allapples[]=Apple.values();
	//	for(Apple a: allapples)
		//	System.out.println(a);
		//
		//use valueof
		
		//ap=Apple.valueOf("Winesap");
	//	System.out.println("ap contains " +ap);
		
		System.out.println("Winesap costs "+ Apple.Winesap.getPrice()+" cents.\n");
		
		System.out.println("All apple prices: ");
		for(Apple a: Apple.values())
			System.out.println(a+ " costs " + a.getPrice() + " cents ");
		
	}

}


enum Apple{
	Jonathan(10), Goldendel(9), Reddel(12), Winesap(15), Cortland(8);
	private int price;
	Apple(int p){ price=p;}
	int getPrice(){return price;}
}

