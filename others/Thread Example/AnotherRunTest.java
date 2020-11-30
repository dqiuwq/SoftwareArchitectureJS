public class AnotherRunTest {
	
	public static void main(String[] args) {
		AnotherRun ar = AnotherRun("TestRun");
		Thread thread = new Thread(ar);
		ar.start();
	}
}