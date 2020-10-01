public class GenericItemTest
{
  public static void main(String[] argv)
  {
    GenericItem<String> item1 = new GenericItem<>("Generic Type");
    System.out.println(item1.get());             // Generic Type
    System.out.println(item1.get().getClass());  // java.lang.String
    System.out.println(item1.getClass());        // GenericItem
 
    GenericItem<Double> item2 = new GenericItem<>(1.234);
    System.out.println(item2.get());             // 1.234
    System.out.println(item2.get().getClass());  // java.lang.Double
    System.out.println(item2.getClass());        // GenericItem
  }
}