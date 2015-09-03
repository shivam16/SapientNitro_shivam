package mainpack;

public class Harbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harbour bostonHarbour= new Harbour();
		RiverBarge barge= new RiverBarge();
		SeaPlane sPlane= new SeaPlane();
		
		bostonHarbour.givePermissionToDock(barge);
		bostonHarbour.givePermissionToDock(sPlane);
		}
		private void givePermissionToDock(Sailer s) {
		s.dock();
		}
}
