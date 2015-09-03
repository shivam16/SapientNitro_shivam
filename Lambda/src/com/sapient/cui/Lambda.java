package 
/**
 * 
 */

/**
 * @author spra26
 *
 */

interface Test{
	public void testing();
}

class Execution{
	public void call(Test test){
		test.testing();
	}
}

public class Lambda {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution exec = new Execution();
		exec.call(()-> {System.out.println("testing1");});
		exec.call(()-> {System.out.println("testing2");});
		exec.call(()-> {System.out.println("testing3");});

	}

}
