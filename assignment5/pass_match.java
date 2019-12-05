import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

class passwordMatch
{




    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[]) throws IOException, NoSuchAlgorithmException
    {
        Scanner in = new Scanner(System.in);
        // in.useDelimiter(System.lineSeparator());

        // keep track of log in attempts
        int loginAttempts = 3;
        boolean loginProgram = true;

       // File file = newFileOpen("test2.txt");
       File file = newFileOpen("passwords.txt");

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
           checkUserLogin(file);
           loginAttempts --;
           System.out.printf("You have %d log in attempts left\n", loginAttempts );
         }

         else if ( userDecision.equals("2"))
         {
           // registerNewUser();
           registerNewUser(file);
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


        in.close();



    }

private static  File newFileOpen (String textFile) throws IOException
{

    // File file = new File("passwords.txt");
      File file = new File(textFile);

      boolean fvar = file.createNewFile();
      if (fvar){
          System.out.println("File has been created successfully");
      }
      else{
          System.out.println("File already present at the specified location");
      }

      return file;

}


private static boolean checkNamePassword(String user,String password, File file) throws IOException, NoSuchAlgorithmException
{
  Scanner scanner = new Scanner(file);
  boolean validCombo = true;

  String userMatch = namePasswordMatch(file, user,  password);

  if (userMatch.equals("2"))
  {
    System.out.println("User name is taken already. Please Try again");
    validCombo =  false;
    // break;
  }
  else
  {
    System.out.println()
  }

  while (scanner.hasNextLine())
  {
    // String [] userPair  = scanner.nextLine().split(" ");
    // String userSplit = userPair[0];
    // String passSplit = userPair[1];
    // String [] combo = saltProcess(user,password);
    // String userName = generate256Hash(combo[0]);
    // System.out.println("current login :" + userSplit);
    // System.out.println("hashed user choice : " + userName);



    if(password.length() <= 7)
    {
      System.out.println("Password length must be more than 8 characters");
      validCombo = false;
    }
    // String multiplenumber = "[\\d]{4,}";
    String multiplenumber = ".*[\\d]{4}.*";
    boolean numberMatch = Pattern.matches(multiplenumber, password);
    if(numberMatch)
    {
      System.out.println("Too many consecutive Numbers");
      return false;
    }
    String multipleLetter = ".*[a-zA-Z]{4}.*";
    boolean letterMatch = Pattern.matches(multipleLetter, password);
    if(letterMatch)
    {
      System.out.println("Too many consecutive Letters");
      validCombo =  false;
    }

    String numberLetter = ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";
    boolean containNumLetter = !Pattern.matches(numberLetter, password);
    if(containNumLetter)
    {
      System.out.println("Password must contain both Numbers and Letters");
      validCombo =  false;
    }
    if(validCombo = false)
    {
      return false;
    }
  }
  return true;
  // System.out.println("name and password is valid: " + validCombo);
  // return false;
    // if (validCombo)
    // {
    //   // System.out.println("test for true name");
    //   return true;
    // }
    // else
    // {
    //   // System.out.println("test for false name");
    //   return false;
    // }
}


private static void registerNewUser(File file) throws IOException, NoSuchAlgorithmException
{
  Scanner in = new Scanner(System.in);
  // File file = new File("test2.txt");
  FileWriter writer = new FileWriter(file, true);

  System.out.println("Enter in the username");
  String userName = in.nextLine();
  // String userName = "test";
  System.out.printf("Your username is %s\n", userName);


  System.out.println("Enter in your password");
  String userPassword = in.nextLine();
  // String userPassword = "abc123cha";
  // String userPassword = "aboulhosn";

  System.out.printf("Your password is %s\n", userPassword);
  String salt;
// String systemInput = userName + " " + userPassword;

// boolean validNamePair = checkNamePassword(userName,userPassword, file);

    if(checkNamePassword(userName,userPassword, file))
    // if(validNamePair)
    {
      String [] combo = saltProcess(,userPassword);
      salt = combo[0];
      userPassword = combo[1];
      // userName = generate256Hash(userName);
      userPassword = generate256Hash(userPassword);
      String systemInput = userName + " " + userPassword + " " + salt

      try{
          writer.write(systemInput);
          writer.write("\n");
         }
         catch(Exception e)
         {System.out.println(e);}
         System.out.println("New user Created\n");
         System.out.println("--------------------");
         // System.out.printf("%s\n", systemInput);


         writer.close();
    }
    else
    {
      System.out.println("New user not Created\n");
      System.out.println("--------------------");
    }

}


private static String namePasswordMatch(File file, String userName, String userPassword) throws IOException, NoSuchAlgorithmException
{
  Scanner scanner = new Scanner(file);
  int lineNum = 1;

  // String [] combo = saltProcess(userPassword);
  // userName = combo[0];
  userPassword = combo[1];
  // userName = generate256Hash(userName);
  userPassword = generate256Hash(userPassword);

  while (scanner.hasNextLine())
  {
    String [] userPair  = scanner.nextLine().split(" ");
    String userSplit = userPair[0];
    String passSplit = userPair[1];
    String saltSplit = userPair[2];

    if(userSplit.equals(userName) && passSplit.equals(userPassword))
    {
      System.out.printf("name from file at line %d is : %s\n",lineNum, userSplit);
      System.out.printf("password from file at line %d is : %s\n",lineNum, passSplit);
      System.out.println("--------------------");
      return "1";
    }
    else if(userSplit.equals(userName) )
    {
      return "2";
    }

    lineNum ++;
  }
  return "3";

}

private static void  checkUserLogin (File file) throws IOException, NoSuchAlgorithmException
{
  // Scanner scanner = new Scanner(new File("test2.txt"));
  Scanner scanner = new Scanner(file);
  Scanner scan = new Scanner(System.in);
  System.out.println("What is your username");
  String userName = scan.nextLine();
  //
  System.out.println("What is your password");
  String userPassword = scan.nextLine();

  // String [] combo = saltProcess(userName,userPassword);
  // userName = combo[0];
  // userPassword = combo[1];
  // userName = generate256Hash(userName);
  // userPassword = generate256Hash(userPassword);



  int lineNum = 1;
  // boolean  currentUser = false;

  String guessMatch = namePasswordMatch(file, userName, userPassword);

   // while (scanner.hasNextLine())
   // {
   //   String [] userPair  = scanner.nextLine().split(" ");
   //   String userSplit = userPair[0];
   //   String passSplit = userPair[1];
   //
   //
   //   if (userSplit.equals(userName) && passSplit.equals(userPassword))
   //   {
   //     System.out.printf("name from file at line %d is : %s\n",lineNum, userSplit);
   //     System.out.printf("password from file at line %d is : %s\n",lineNum, passSplit);
   //     System.out.println("--------------------");
   //     currentUser = true;
   //
   //     // break;
   //     // System.out.println("You ")
   //   }
   //   lineNum++
   //
   // }

    if(guessMatch.equals("1"))
    {
      System.out.println("You have logged in");
      System.out.println("Welcome !");
      System.exit(0);

    }
    else
    {
      System.out.println("UserName and Password does not match");
      System.out.println(userName);
      System.out.println(userPassword);
    }

}

private static String generate256Hash (String value) throws NoSuchAlgorithmException
{
 MessageDigest md = MessageDigest.getInstance("SHA-256");
 byte[] digest = md.digest(value.getBytes(StandardCharsets.UTF_8));
 String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
 return sha256;
}

 private static String[] saltProcess( String password)
 {
   String [] combo = new  String [2];
   String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
           StringBuilder salt = new StringBuilder();
           Random rnd = new Random();
           while (salt.length() < 18) { // length of the random string.
               int index = (int) (rnd.nextFloat() * SALTCHARS.length());
               salt.append(SALTCHARS.charAt(index));
           }
           String saltStr = salt.toString();
           // System.out.println ("Random salt String is : " + saltStr);
   // String saltOriginal = "q1C7XNnAa8ptgEhq3xeC";
   // String saltpassWord = "62iJMBZnurFEWz58Y2KA";
   combo[0] = saltStr;
   combo[1] = password + combo[0];

   // return (user, password);
   return combo;

 }

}
