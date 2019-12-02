import java.util.Scanner; 
import java.io.*;
import java.io.IOException; 

class passwordMatch
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        
        File file = new File ("password.txt");




        Scanner in = new Scanner(System.in);

            if (file.exists()) 
                System.out.println("Exists"); 
            else
                System.out.println("Does not Exists"); 
        
        System.out.println("Hello, World");


        

        System.out.println("Enter in the username");
        String userName = in.nextLine();
        System.out.printf("Your password is %s\n", userName);
        

        System.out.println("Enter in your password");
        String userPassword = in.nextLine();

        System.out.printf("Your password is %s\n", userPassword);




        

    
        in.close();

        


    }












}
