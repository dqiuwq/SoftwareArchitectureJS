public class ExSerialization {
	public static void main(String[] args) {
        saveObject();
        readObject();
    }

    public static void readObject() {
        try(ObjectInputStream infile = new ObjectInputStream(new FileInputStream("List.dat"))) {
            ArrayList<String> textList = (ArrayList<String>) infile.readObject();
            for (String s : textList)
                System.out.println(s);
            System.out.println("Read completed.");
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static void saveObject() {
        try(ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream("List.dat"))) {
            ArrayList<String> textList = new ArrayList<>();
            textList.add(new String("Hello"));
            textList.add(new String("World"));
            outfile.writeObject(textList);
            System.out.println("Write completed.");
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}