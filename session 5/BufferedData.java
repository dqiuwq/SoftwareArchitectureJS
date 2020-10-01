import java.util.Iterator;
public class BufferedData
{
  private int[] data = {12, 145, 1, 4, -1, -1, -1, -1};
  private int   count = 4;
  // Methods to add values, change values ....
 
  public Iterator<Integer> getIterator()
  {
    Iterator<Integer> itor = 
        new Iterator<Integer>()
        {
            int idx = 0;
            public boolean hasNext()
            {
              if (count == 0 || idx >= count)
                 return false;
              else
                 return true;
            }
            public Integer next()
            {
              return data[idx++];
            }
            public void remove()
            {}
        };
    return itor;
  }
}