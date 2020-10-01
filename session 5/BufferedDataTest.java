import java.util.Iterator;
public class BufferedDataTest
{
  public static void main(String[] argv)
  {
    BufferedData bd = new BufferedData();
    // Add values, make changes to bd
    Iterator<Integer> e = bd.getIterator();
    while (e.hasNext())
        System.out.println(e.next());
  }
}