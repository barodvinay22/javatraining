//package pr2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class User implements java.io.Serializable {
    private Integer userid;
    private String username;
    private String address;
    private transient String password;

    public User(Integer id,String name,String address,String passwd)
    {
        this.userid = id;
        this.username = name;
        this.address = address;
        this.password = passwd;
    }
    public String toString()
    {
        return "User(id : " + userid + " , name : " + username +" , address : " + address + " , passwd : " + password + ")";
    }

    public static void main(String[] args) throws IOException
    {
        //Integer number=10;
        try {
            User user1 = new User(1, "Dexter", "XYZ", "password");
            FileOutputStream fout = new FileOutputStream("userdetails.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            objout.writeObject(user1);
            objout.close();
            fout.close();
            System.out.println(user1);

            //now the same user
            FileInputStream fin = new FileInputStream("userdetails.txt");
            ObjectInputStream objin = new ObjectInputStream(fin);
            User user2 = (User) objin.readObject();
            System.out.println(user2);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("I/O Error");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }
    }
}

