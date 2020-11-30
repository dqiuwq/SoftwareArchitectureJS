import java.io.*;

public class ExSerialization {
    public static void main(String[] args) {
        saveObject();
        readObject();
    }

    public static void readObject() {
        try(ObjectInputStream infile = new ObjectInputStream(new FileInputStream("filename.dat"))) {
            String a = (String) infile.readObject();
            String b = (String) infile.readObject();
            System.out.printf("%s %s\n", a, b);
            System.out.println("Read completed.");
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static void saveObject() {
        try(ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream("filename.dat"))) {
            outfile.writeObject(new String("Hello"));
            outfile.writeObject(new String("World"));
            System.out.println("Write completed.");
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}