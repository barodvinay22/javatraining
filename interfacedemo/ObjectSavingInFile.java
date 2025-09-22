package interfacedemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSavingInFile {
    public static void main(String[] args) throws IOException {
        //Integer number=10;
        Student student=new Student(1,"vinay","XYZ");
        FileOutputStream fileOutStream=new FileOutputStream("savingobject.txt");
        ObjectOutputStream objectOutStream=new ObjectOutputStream(fileOutStream);
        objectOutStream.writeObject(student);
        objectOutStream.close();
        fileOutStream.close();
    }
}