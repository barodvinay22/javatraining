import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Exception in thread "main" java.io.NotSerializableException: StudentMarkerSayan
//this exception will come if we just write objectOutputStream.writeObject(studentMarkerSayan);
// to solve this use public class StudentMarkerSayan implements java.io.Serializable
//Integer extends Number and Number implements java.io.Serializable ; hence objectOutputStream.writeObject(number) has no issue
public class ObjectSavingFileSayan {
    public static void main (String[] args) throws IOException {
//        Integer number=10;
        StudentMarkerSayan studentMarkerSayan = new StudentMarkerSayan(1 , "sayan" , "111");
        FileOutputStream fileOutputStream = new FileOutputStream("savingobject.text");
//    FileOutputStream creates the file if not present
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//    ObjectOutputStream opens the file and write the object
//        objectOutputStream.writeObject(number);
        objectOutputStream.writeObject(studentMarkerSayan);
        objectOutputStream.close();
//    close objectOutputStream ;  while writing the object if some problem happens then file will not be closed  properly;
//    and memory leackage will happen and file will be corrupted
        fileOutputStream.close();
//    close fileOutputStream

    }
}
