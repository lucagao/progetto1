import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
      Scanner in = new Scanner(System.in);
      
      // get name
      
      System.out.println("Enter username");
      
      // save name
      
      String userName = in.nextLine();
      System.out.println("Username is :" + userName );
      
      in.close();
    }
}