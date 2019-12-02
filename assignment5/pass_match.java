import java.util.Scanner;
import java.io.*;
import java.io.IOException;

class passwordMatch
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(System.in);
        
        File file = new File("passwords.txt");

        boolean fvar = file.createNewFile();
	     if (fvar){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
        
        
        FileWriter writer = new FileWriter(file);
        
        System.out.println("Enter in the username");
        // String userName = in.nextLine();
        String userName = "test";
        System.out.printf("Your username is %s\n", userName);
        
        
        System.out.println("Enter in your password");
        // String userPassword = in.nextLine();
        String userPassword = "aboulhosn";
        
        System.out.printf("Your password is %s\n", userPassword);

        String systemInput = userName + " " + userPassword;
        System.out.printf("%s\n", systemInput);


        try{    
            writer.write(systemInput);
            writer.write("test");
            writer.close();
              
           }
           catch(Exception e)
           {System.out.println(e);}    
           System.out.println("Success...");    
         
        
       
        
        
        
        
        in.close();

        // newFileOpen();


    }


// private static void newFileOpen ()
// {
//   System.out.println("Test for class");
// }

// private static void new










}
