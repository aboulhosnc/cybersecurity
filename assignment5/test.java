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

class test
{



  public static void main(String args[]) throws NoSuchAlgorithmException
  {
    Scanner in = new Scanner(System.in);

// int n = 20;
// System.out.println(RandomString.getAlphaNumericString(n));


  // System.out.println("test");
  String test = testClass("String", 5);

  System.out.println(test);
  // String user = "chady";
  // String password = "Aboulhosn";
  // String password2 = "aboulhosn";
  // System.out.println(user);
  // System.out.println(password);
  // System.out.println(password2);
  // String [] combo = saltProcess(user,password);
  // user = combo[0];
  // password = combo[1];
  // System.out.println(user);
  // System.out.println(password);

  // String password = "SHA-256";

  // String password1 = generate256Hash(password);
  // String password3 = generate256Hash(password2);

  // String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
  //         StringBuilder salt = new StringBuilder();
  //         Random rnd = new Random();
  //         while (salt.length() < 18) { // length of the random string.
  //             int index = (int) (rnd.nextFloat() * SALTCHARS.length());
  //             salt.append(SALTCHARS.charAt(index));
  //         }
  //         String saltStr = salt.toString();
  //         System.out.println ("Random salt String is : " + saltStr);
  //
  //       // print SHA-256 Message Digest
  //       System.out.println("password Aboulhosn is : " + password1);
  //       System.out.println("password aboulhosn is : " + password3);
        // System.out.println(sha256);

// System.out.println("\n" + password + " : " + toHexString(getSHA(password)));





  // String text    = "12abu123";
  // String text    =
  //       "This is the text to be searched " +
  //       "for occurrences of the http:// pattern.";

        // String regex = ".*http://.*";
        String test1 = ".*[a-zA-Z][\\d]{4}.*";
        String test2 = ".*[\\d]{4}.*";
        String test3 = ".*[a-zA-Z]{4}.*";
        String test4 = ".*[a-z]{4}.*";
        String test5 = ".*[A-Z]{4}.*";
        String test6 = ".*[a-zA-Z]{4}[\\d]{4}.*";
        String test7 = ".*([a-zA-Z]|[\\d]){4}.*";
        String test8 = ".*[a-zA-Z][\\d].*";
        String test9 = ".*([a-zA-Z]+[\\d]+).*";
        String test10= ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";
        String test11= ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";


        // System.out.println(testConsecutive);
        // reverses string
        // for(int i = testConsecutive.length() - 1; i >= 0; i--)
    		// {
    		// 	testReverseConsecutive = testReverseConsecutive + testConsecutive.charAt(i);
    		// }
        // System.out.println(testReverseConsecutive);



        // String consecutiveNum = "7890123456789";

        while(true)
        {
          System.out.println("What combination do you want to test ?");
          String text = in.nextLine();

          // patternMatch(text);
          int textLength = text.length() - 4;

          for(int y = 0; y <= textLength; y++)
          {
            System.out.println(text.substring(y,y+4));
            System.out.println(y);
          }

          // boolean matches1 = Pattern.matches(test1, text);
          // boolean matches2 = Pattern.matches(test2, text);
          // boolean matches3 = Pattern.matches(test3, text);
          // boolean matches4 = Pattern.matches(test4, text);
          // boolean matches5 = Pattern.matches(test5, text);
          // boolean matches6 = Pattern.matches(test6, text);
          // boolean matches7 = Pattern.matches(test7, text);
          // boolean matches8 = Pattern.matches(test8, text);
          // boolean matches9 = Pattern.matches(test9, text);
          // boolean matches10 = Pattern.matches(test10, text);
          // boolean matches11 = !(Pattern.matches(test11, text));
          //
          // boolean matches11 = !(Pattern.matches(test11, text));





          // System.out.println("test1 combination of digits and letters = " + matches1);
          // System.out.println("test2 only digits= " + matches2);
          // System.out.println("test3 a-z capitals and LowerCase= " + matches3);
          // System.out.println("test4 a-z lowercase Only= " + matches4);
          // System.out.println("test5 a-z capital Only= " + matches5);
          // System.out.println("test6 combination of digits and letters with number count indivudally = " + matches6);
          // System.out.println("test7 combination of numbers and letters or operator = " + matches7);
          // System.out.println("test8 for numbers and letters = " + matches8);
          // System.out.println("test9 for numbers and letters with plus sign = " + matches9);
          // System.out.println("test10 for numbers and letters with lookahead = " + matches10);
          // System.out.println("test11 for numbers and letters with lookahead negation= " + matches11);
        }


  }
// true if it matches
// false if it does not match
private static boolean patternMatch (String value)
{

  String testConsecutive = "XYZABCDEFGHIJKLMNOPQRSTUVWXYZABCxyzabcdefghijklmnopqrstuvwxyzabc8901234567890123" +
                            "iopqwertyuiopqwejklasdfghjklasdbnmzxcvbnmzxcIOPQWERTYUIOPQWEJKLASDFGHJKLASDBNMZXCVBNMZXC";

  String testReverseConsecutive = "CXZMNBVCXZMNBDSALKJHGFDSALKJEWQPOIUYTREWQPOIcxzmnbvcxzmnbdsalkjhgfdsalkjewqpoiuytrewqpoi" +
                                  "CBAZYXWVUTSRQPONMLKJIHGFEDCBAZYXcbazyxwvutsrqponmlkjihgfedcbazyx3210987654321098";

  System.out.println("length of consequitive is : " + testConsecutive.length());
  System.out.println("length of reverse consequtive is : " + testReverseConsecutive.length());
  System.out.println(testConsecutive);
  System.out.println(testReverseConsecutive);
  int testNum = testConsecutive.length() - 4;
  String test12;
  String test13;
  boolean matches12;
  boolean matches13;
  int textLength;
  String text = "";
if(text.length()  <= 4)
{
  textLength = text.length();
}
else
{
  textLength = text.length() - 4;
}

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
          System.out.println("test12 only consecutive = " + matches12);
          System.out.println("test13 only reverse = " + matches13);
          System.out.println("test12 is : " + test12);
          return true;

        }
        if(matches13)
        {
          System.out.println("test12 only consecutive everything = " + matches12);
          System.out.println("test13 only reverse everything = " + matches13);
          System.out.println("test13 is : " + test13);
          return true;
        }

      }

  }
System.out.println("did not match reverse or foward");
return false;
}
  public static String  testClass (String value, int num)
  {
    // System.out.println(value);
    // System.out.println(num + 10);
    return "return Value";
  }
}
