import java.util.Iterator;

public class BufferedDataTest {
	public static void main(String[] args) {
		BufferedData bd = new BufferedData();
		Iterator<Integer> e = bd.getIterator();
		
		while (e.hasNext()) 
			System.out.println(e.next());
	}
}