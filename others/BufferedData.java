import java.util.Iterator;

public class BufferedData {
	private int[] data = {1, 2, 3, 4, -1, -1, -1};
	private int count = 4;
	
	public int[] getData() {
		// this exposes your implementation and clients will 
		// have direct access to the data array.
		return data;
	}
	
	public Iterator<Integer> getIterator() {
		// anomynous/inner class
		// creating an instance of a class without a name
		// allows java to pass this instance with fix functions around
		Iterator<Integer> itr = new Iterator<Integer>() {
			int index = 0;
			public boolean hasNext() {
				if (count == 0 || index >= count)
					return false;
				else
					return true;
			}
			
			public Integer next() {
				return data[index++];
			}
			
			public void remove() {}
		};
		
		return itr;
	}
}