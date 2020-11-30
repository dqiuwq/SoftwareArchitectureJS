public class GenericItemTest {
	public static void main(String[] args) {
		//GenericItemTest.main(null);
		
		GenericItem<String> item1 = new GenericItem<>("Some String value");
		System.out.println(item1.get()); // Some String value
		System.out.println(item1.get().getClass()); // class java.lang.String
		System.out.println(item1.getClass()); // class GenericItem
		
		GenericItem<Double> item2 = new GenericItem<>(12.34);
		System.out.println(item2.get()); // Some String value
		System.out.println(item2.get().getClass()); // class java.lang.String
		System.out.println(item2.getClass()); // class GenericItem
	}
}