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
        // in.useDelimiter(System.lineSeparator());

        // keep track of log in attempts
        int loginAttempts = 3;
        boolean loginProgram = true;


       //  // File file = new File("passwords.txt");
       //  File file = new File("test2.txt");
       //
       //  boolean fvar = file.createNewFile();
	     // if (fvar){
	     //      System.out.println("File has been created successfully");
	     // }
	     // else{
	     //      System.out.println("File already present at the specified location");
	     // }

       // scanning file

       newFileOpen();

       // checkUserName();
       // System.our.println("To Log in ")
       String userDecision;
       while (loginProgram)
       {
         System.out.println("If you want to try again to log in type: 1");
         System.out.println("If you want to register as a new user type : 2");
         System.out.println("If you want to exit type: 3");
         userDecision = in.nextLine();

         if(userDecision.equals("1") && loginAttempts > 0)
         {
           checkUserName();
           loginAttempts --;
           System.out.printf("You have %d log in attempts left\n", loginAttempts );
         }

         else if ( userDecision.equals("2"))
         {
           // registerNewUser();
           registerNewUser();
           // break;
         }
         else if ( userDecision.equals("3"))
         {
           System.out.println("Goodbye");
           System.exit(0);

         }
         else
         {
           System.out.println("Invalid Input Please Try again");
         }

         if( loginAttempts <= 0)
         {
           System.out.println("You have exceeded the mamixum amount of log in attempts");
           System.out.println("Goodbye");
           System.exit(0);
         }
         // System.out.println("test");
         // userDecision = in.next();
       }


       // if(userDecision.equals("register")
       // {
       //   System.out.println("register class here");
       // }

        in.close();

        // newFileOpen();


    }

private static  void newFileOpen () throws IOException
{

    // File file = new File("passwords.txt");
      File file = new File("test2.txt");

      boolean fvar = file.createNewFile();
      if (fvar){
          System.out.println("File has been created successfully");
      }
      else{
          System.out.println("File already present at the specified location");
      }

}

private static void registerNewUser() throws IOException
{
  Scanner in = new Scanner(System.in);
  File file = new File("test2.txt");
  FileWriter writer = new FileWriter(file, true);

  System.out.println("Enter in the username");
  String userName = in.nextLine();
  // String userName = "test";
  System.out.printf("Your username is %s\n", userName);


  System.out.println("Enter in your password");
  String userPassword = in.nextLine();
  // String userPassword = "aboulhosn";

  System.out.printf("Your password is %s\n", userPassword);

  String systemInput = userName + " " + userPassword;
  System.out.printf("%s\n", systemInput);





  try{
      writer.write(systemInput);
      writer.write("\n");

     }
     catch(Exception e)
     {System.out.println(e);}
     System.out.println("new user Created");

     writer.close();

}

private static void  checkUserName () throws IOException
{
  Scanner scanner = new Scanner(new File("test2.txt"));
  Scanner scan = new Scanner(System.in);
  System.out.println("What is your username");
  String userName = scan.nextLine();
  //
  System.out.println("What is your password");
  String userPassword = scan.nextLine();
  int lineNum = 1;
  boolean  currentUser = false;

   while (scanner.hasNextLine())
   {
     String [] userPair  = scanner.nextLine().split(" ");
     String userSplit = userPair[0];
     String passSplit = userPair[1];





     if (userSplit.equals(userName) && passSplit.equals(userPassword))
     {
       System.out.printf("name from file at line %d is : %s\n",lineNum, userSplit);
       System.out.printf("password from file at line %d is : %s\n",lineNum, passSplit);
       currentUser = true;

       break;
       // System.out.println("You ")
     }
     lineNum ++;
   }

    if(currentUser)
    {
      System.out.println("You have logged in");
      System.out.println("Welcome !");
      System.exit(0);

    }
    else
    {
      System.out.println("Password does not match");
    }

     // scanner.close();
     // scan.close();
   }

}
