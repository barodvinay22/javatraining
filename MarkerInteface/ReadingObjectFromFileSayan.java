import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjectFromFileSayan {
    public static void main(String[] args)  {
//        try with resources
//        create file inside the try
//        first handle FileNotFoundException inside catch ; this is child exception
//        then handle IOException ; this is parent exception
//        if you handle parent exception then child expection will be unreachable
//        readObject() is for reading the object
//        typecast to Integer ; as input is integer
//        FileInputStream thows FileNotFoundException
//        ObjectInputStream throws IOException
//        readObject() throws ClassNotFoundException
        try(FileInputStream fileIn = new FileInputStream("savingobject.text");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);){
//            Integer number = (Integer) objectIn.readObject();
//            System.out.println(number);
            StudentMarkerSayan obj = (StudentMarkerSayan) objectIn.readObject();
            System.out.println(obj);

        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("File not found");

        }catch(IOException e){
            System.out.println("I/O error");
        }catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        }

    }
}
