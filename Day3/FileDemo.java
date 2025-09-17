import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       File file = new File("/Users/vbarood/Documents/Java training /GitRepo/javatraining/Day3/test.txt");
        FileReader fileReader=null;
        try{
            fileReader = new FileReader(file);
             int a=1/0;
            while(fileReader.read()!=-1){
                System.out.println(fileReader.read());
            }

        }finally {
            fileReader.close();
        }



    }
}