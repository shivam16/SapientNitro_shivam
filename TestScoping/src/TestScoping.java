
public class TestScoping {
	public static void main(String[] args) {
		ScopeExample scope = new ScopeExample();
		 scope.firstMethod();
		 }
}

class ScopeExample{
	private int i=1;
	 public void firstMethod() {
	 int i=4, j=5;
	 this.i = i + j;
	 secondMethod(7);
	 }
	 public void secondMethod(int i) {
	int j=8;
	 this.i = i + j;
	 }
}
