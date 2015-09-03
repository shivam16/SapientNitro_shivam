/**
 * 
 */
package mainpack;

/**
 * @author spra26
 *
 */
public class Airport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airport metropolisAirport= new Airport();
		Helocopter copter =new Helocopter();
		SeaPlane sPlane= new SeaPlane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
		
	}
	private void givePermissionToLand(Flyer f){
		f.land();
	}

}
