public class Sample implements Cloneable {
    private int[] data = new int[5];
    private Square sq;
	
	public Sample clone() {
		try {
			Sample temp = (Sample) super.clone(); // clone will always return object, so you must cast
			temp.sq = new Square(sq.getLength());
			temp.data = java.util.Arrays.copyOf(data, data.length);
			return temp;
		} catch(CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		
		return null
	}

    public Sample(int value) {
        sq = new Square(value);
    }

    public void change(int value) {
        for (int i = 0; i < data.length; i++)
            data[i] = value;
        sq.setLength(value);
    }

    public void debug() {
        System.out.print("Array: ");
        for (int value : data)
            System.out.print(value + " ");
        System.out.println("\n" + sq);
    }
}