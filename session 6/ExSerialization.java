import java.io.*;
import java.util.*;
 
public class ExSerialization
{
  public static void main(String[] argv)
  {
    // saveObject();
    readObject();
  }
  public static void readObject()
  {
    try(ObjectInputStream infile = 
          new ObjectInputStream(
            new FileInputStream("object.dat")))
    {
      Square sq = (Square)infile.readObject();
      sq.setLength(99);
      System.out.println(sq);
 
      System.out.println(infile.readObject());
      System.out.println(infile.readObject());
 
    }
    catch(IOException | ClassNotFoundException e)
    {
      System.out.println(e);
    }    
  }
  public static void saveObject()
  {
    try(ObjectOutputStream outfile = 
          new ObjectOutputStream(
            new FileOutputStream("object.dat")))
    {
      outfile.writeObject(new Square(1));
      outfile.writeObject(new Square(11));
      outfile.writeObject(new Square(111));
      System.out.println("End of saveObject");
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }
}