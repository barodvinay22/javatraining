package AssignmentSep19;

import java.io.*;

public class UserMain {
    public static void main(String[] args) {
        // Create a record for new user
        User user1 = new User(1, "Amit Sharma", "MG Road, Pune", "pass123");
        // Save the user object to file

        try {
            FileOutputStream fileOut = new FileOutputStream("userfile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user1);
            out.close();
            fileOut.close();
            System.out.println("User object saved to file.");
        } catch (IOException e) {
            System.out.println("Something went wrong while saving.");
        }

        // Read the user object back from file
        User loadedUser=null;
        try {
            FileInputStream fileIn = new FileInputStream("userfile.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            loadedUser = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException e) {
            System.out.println("Something went wrong while loading.");
        } catch (ClassNotFoundException e) {
            System.out.println("User class not found.");
        }

        // Show the loaded user data
        System.out.println("\nLoaded User Details:");
        if (loadedUser != null) {
            loadedUser.printUser();  // password will be null
        }
    }
}
