import java.io.*;

// Serializable User class
class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String address;
    private transient String password; // transient means it will not be serialized

    public User(int id, String name, String address, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", address=" + address + ", password=" + password + "]";
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        String filename = "user.ser";

// Create user object
        User user1 = new User(101, "Alice", "New York", "mySecret123");

// -------- Serialization --------
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(user1);
            System.out.println("User object has been serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

// -------- Deserialization --------
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            User savedUser = (User) in.readObject();
            System.out.println("User object deserialized:");
            System.out.println(savedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}