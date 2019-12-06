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
import java.util.Random;

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
         
         // For testing
         userDecision = in.nextLine();
        //  userDecision = "2";

         if(userDecision.equals("1") && loginAttempts > 0)
         {
           System.out.println("--------------------");
           System.out.println("You have chosen to login");
           System.out.println("--------------------");
           checkUserLogin(file);
           loginAttempts --;
           System.out.printf("You have %d log in attempts left\n", loginAttempts );
         }

         else if ( userDecision.equals("2"))
         {
           // registerNewUser();
           System.out.println("--------------------");
           System.out.println("You have chosen to Register as a New User");
           System.out.println("--------------------");
           registerNewUser(file);
           // break;
         }
         else if ( userDecision.equals("3"))
         {
          System.out.println("--------------------");
          System.out.println("You have chosen to Exit");
          System.out.println("--------------------");
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
  // System.out.println(" 0 : Valid combo is :" + validCombo);

  while (scanner.hasNextLine())
  {
    String [] userPair  = scanner.nextLine().split(" ");
    String userSplit = userPair[0];
  
    if (user.equals(userSplit))
    {
      System.out.println("User name is taken already. Please Try again");
      // System.out.println(" 1 : Valid combo is :" + validCombo);
      validCombo =  false;
      break;
    }
  }
  if(password.length() <= 7)
  {
    System.out.println("Password length must be more than 8 characters");
    // System.out.println(" 2 : Valid combo is :" + validCombo);
    validCombo = false;
  }
  // String multiplenumber = "[\\d]{4,}";
  if(patternMatch(password))
  {
    validCombo = false;
  }
  if(commonPasswordMatch (password))
  {
    validCombo = false;
  }

  String repeatNumber = ".*([0-9])\\1{3}.*";
  boolean containRepeatNumber = Pattern.matches(repeatNumber, password);

  if( containRepeatNumber)
  {
    System.out.println("Too many repeated Numbers ");
    validCombo = false;
  }
  String repeatLetter = ".*([a-zA-Z])\\1{3}.*";
  boolean containRepeatLetter = Pattern.matches(repeatLetter, password);

  if(containRepeatLetter)
  {
    System.out.println("Too many repeated Letters ");
    validCombo = false;
  }

  String numberLetter = ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";
  boolean containNumLetter = !Pattern.matches(numberLetter, password);
  if(containNumLetter)
  {
    System.out.println("Password must contain both Numbers and Letters");
    // System.out.println(" 5 : Valid combo is :" + validCombo);
    validCombo =  false;
  }
    if(!validCombo)
    {
      // System.out.println("6: Test for false valid combo:");
      // System.out.println("Valid combo is inside while loop :" + validCombo);
      return false;
      // break;
    }
    else
    {
      return true;
    }
  
 
  

}
public static boolean  commonPasswordMatch (String password)
{
  // System.out.println(value);
  // System.out.println(num + 10);
  String commonPasswords = "123456 password 12345678 1234 pussy 12345 dragon qwerty 696969 mustang letmein baseball master michael football shadow monkey" +
    " abc123 pass fuckme 6969 jordan harley ranger iwantu jennifer hunter fuck 2000 " +
    "test batman trustno1 thomas tigger robert access love buster 1234567 soccer hockey killer george sexy andrew charlie superman asshole fuckyou dallas jessica panties" +
    " pepper 1111 austin william daniel golfer summer heather hammer yankees joshua maggie biteme enter ashley thunder cowboy silver richard fucker orange merlin michelle" +
    " corvette bigdog cheese matthew 121212 patrick martin freedom ginger blowjob nicole sparky yellow camaro secret dick falcon taylor 111111 131313 123123 bitch hello scooter" +
    " please porsche guitar chelsea black diamond nascar jackson cameron 654321 computer amanda wizard xxxxxxxx money phoenix mickey bailey knight iceman tigers purple andrea horny" +
    " dakota aaaaaa player sunshine morgan starwars boomer cowboys edward charles girls booboo coffee xxxxxx bulldog ncc1701 rabbit peanut john johnny gandalf spanky winter brandy" +
    " compaq carlos tennis james mike brandon fender anthony blowme ferrari cookie chicken maverick chicago joseph diablo sexsex hardcore 666666 willie welcome chris panther yamaha" + 
    "justin banana driver marine angels fishing david maddog hooters wilson butthead dennis fucking captain bigdick chester smokey xavier steven viking snoopy blue eagles winner samantha" +
    " house miller flower jack firebird butter united turtle steelers tiffany zxcvbn tomcat golf bond007 bear tiger doctor gateway gators angel junior thx1138 porno badboy debbie" +
    " spider melissa booger 1212 flyers fish porn matrix teens scooby jason walter cumshot boston braves yankee lover barney victor tucker princess mercedes 5150 doggie zzzzzz" +
    " gunner horney bubba 2112 fred johnson xxxxx tits member boobs donald bigdaddy bronco penis voyager rangers birdie trouble white topgun bigtits bitches green super qazwsx magic" +
    " lakers rachel slayer scott 2222 asdf video london 7777 marlboro srinivas internet action carter jasper monster teresa jeremy 11111111 bill crystal peter pussies cock beer" +
    " rocket theman oliver prince beach amateur 7777777 muffin redsox star testing shannon murphy frank hannah dave eagle1 11111 mother nathan raiders steve forever angela viper" +
    " ou812 jake lovers suckit gregory buddy whatever young nicholas lucky helpme jackie monica midnight college baby cunt brian mark startrek sierra leather 232323 4444 beavis" +
    " bigcock happy sophie ladies naughty giants booty blonde fucked golden 0 fire sandra pookie packers einstein dolphins chevy winston warrior sammy slut 8675309 zxcvbnm nipples" +
    " power victoria asdfgh vagina toyota travis hotdog paris rock xxxx extreme redskins erotic dirty ford freddy arsenal access14 wolf nipple iloveyou alex florida eric legend movie" +
    " success rosebud jaguar great cool cooper 1313 scorpio mountain madison 987654 brazil lauren japan naked squirt stars apple alexis aaaa bonnie peaches jasmine kevin matt qwertyui" +
    " danielle beaver 4321 4128 runner swimming dolphin gordon casper stupid shit saturn gemini apples august 3333 canada blazer cumming hunting kitty rainbow 112233 arthur cream calvin" +
    " shaved surfer samson kelly paul mine king racing 5555 eagle hentai newyork little redwings smith sticky cocacola animal broncos private skippy marvin blondes enjoy girl apollo" +
    " parker qwert time sydney women voodoo magnum juice abgrtyu 777777 dreams maxwell music rush2112 russia scorpion rebecca tester mistress phantom billy 6666 albert";
    
    int testNum = commonPasswords.length();
    int numLength = password.length();
    boolean commonPaswordMatch;
    for (String word : commonPasswords.split(" "))
    {
      commonPaswordMatch = Pattern.matches(password, word);
      // System.out.println(word);
      if(commonPaswordMatch)
      {
        System.out.println("Password is a too common. Please try another one");
        return true;
      }
    }
  return false;
  // return
}
private static boolean patternMatch (String value)
{

  String testConsecutive = "XYZABCDEFGHIJKLMNOPQRSTUVWXYZABCxyzabcdefghijklmnopqrstuvwxyzabc8901234567890123" +
                            "iopqwertyuiopqwejklasdfghjklasdbnmzxcvbnmzxcIOPQWERTYUIOPQWEJKLASDFGHJKLASDBNMZXCVBNMZXC";

  String testReverseConsecutive = "CXZMNBVCXZMNBDSALKJHGFDSALKJEWQPOIUYTREWQPOIcxzmnbvcxzmnbdsalkjhgfdsalkjewqpoiuytrewqpoi" +
                                  "CBAZYXWVUTSRQPONMLKJIHGFEDCBAZYXcbazyxwvutsrqponmlkjihgfedcbazyx3210987654321098";

  // System.out.println("length of consequitive is : " + testConsecutive.length());
  // System.out.println("length of reverse consequtive is : " + testReverseConsecutive.length());
  // System.out.println(testConsecutive);
  // System.out.println(testReverseConsecutive);
  int testNum = testConsecutive.length() - 4;
  String test12;
  String test13;
  boolean matches12;
  boolean matches13;
  int textLength = value.length() - 4;
  String text = "";
// if(text.length()  <= 4)
// {
//   textLength = text.length();
// }
// else
// {
//   textLength = text.length() - 4;
// }

for(int y = 0; y <= textLength; y++)
  {
    text = value.substring(y,y+4);
    for (int x = 0; x <= testNum; x++)
      {
        test12 = testConsecutive.substring(x,x+4);
        test13 = testReverseConsecutive.substring(x,x+4);

        // System.out.println(test12);
        // SYstem.out.println(test13);

         matches12 = Pattern.matches(test12, text);
         matches13 = Pattern.matches(test13,text);
        if(matches12)
        {
          // System.out.println("test12 only consecutive = " + matches12);
          // System.out.println("test13 only reverse = " + matches13);
          System.out.println(test12 + " is a consecutive sequence of letters or numbers which is not allowed");
          return true;

        }
        if(matches13)
        {
          // System.out.println("test12 only consecutive everything = " + matches12);
          // System.out.println("test13 only reverse everything = " + matches13);
          System.out.println(test13 + " is a reverse consecutive sequence of letters or numbers which is not allowed");
          return true;
        }

      }

  }
// System.out.println("did not match reverse or foward");
return false;
}

private static void registerNewUser(File file) throws IOException, NoSuchAlgorithmException
{
  Scanner in = new Scanner(System.in);
  // File file = new File("test2.txt");
  FileWriter writer = new FileWriter(file, true);

  System.out.println("Enter in the username");

  String userName = in.nextLine();
  // String userName = "test";
  // for testing
  // String userName = "chad0";
  System.out.printf("Your username is %s\n", userName);


  System.out.println("Enter in your password");
  String userPassword = in.nextLine();
  // String userPassword = "abc123cha";
  // String userPassword = "aboulhosn";

  System.out.printf("Your password is %s\n", userPassword);
  String salt;
// String systemInput = userName + " " + userPassword;

boolean validNamePair = checkNamePassword(userName,userPassword, file);
// System.out.println("valid name pair is : " + validNamePair);
    // if(checkNamePassword(userName,userPassword, file))
    if(validNamePair)
    {
      String [] combo = saltProcess(userPassword);
      salt = combo[0];
      userPassword = combo[1];
      // userName = generate256Hash(userName);
      userPassword = generate256Hash(userPassword);
      String systemInput = userName + " " + userPassword + " " + salt;

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

  

  int lineNum = 1;
  boolean  currentUser = false;

  // String guessMatch = namePasswordMatch(file, userName, userPassword);

   while (scanner.hasNextLine())
   {
     String [] userPair  = scanner.nextLine().split(" ");
     String userSplit = userPair[0];
     String passSplit = userPair[1];
     String saltSplit = userPair[2];


     if (userSplit.equals(userName) && passSplit.equals(generate256Hash(userPassword + saltSplit)))
     {
      //  System.out.printf("name from file at line %d is : %s\n",lineNum, userSplit);
      //  System.out.printf("password from file at line %d is : %s\n",lineNum, passSplit);
       System.out.println("--------------------");
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
