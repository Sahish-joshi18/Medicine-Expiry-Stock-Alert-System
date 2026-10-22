import java.io.*;import java.util.*;
public class FileManager {
 private static final String FILE="data/medicines.dat";
 @SuppressWarnings("unchecked") public static ArrayList<Medicine> load(){File f=new File(FILE);if(!f.exists())return new ArrayList<>();try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f))){return (ArrayList<Medicine>)in.readObject();}catch(Exception e){return new ArrayList<>();}}
 public static void save(ArrayList<Medicine> data)throws IOException{File d=new File("data");if(!d.exists())d.mkdirs();try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(FILE))){out.writeObject(data);}}
}
