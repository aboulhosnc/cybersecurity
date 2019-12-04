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


class test
{

  // public static byte[] getSHA(String input) throws NoSuchAlgorithmException
  //     {
  //         // Static getInstance method is called with hashing SHA
  //         MessageDigest md = MessageDigest.getInstance("SHA-256");
  //
  //         // digest() method called
  //         // to calculate message digest of an input
  //         // and return array of byte
  //         return md.digest(input.getBytes(StandardCharsets.UTF_8));
  //     }
  //
  //     public static String toHexString(byte[] hash)
  //     {
  //         // Convert byte array into signum representation
  //         BigInteger number = new BigInteger(1, hash);
  //
  //         // Convert message digest into hex value
  //         StringBuilder hexString = new StringBuilder(number.toString(16));
  //
  //         // Pad with leading zeros
  //         while (hexString.length() < 32)
  //         {
  //             hexString.insert(0, '0');
  //         }
  //
  //         return hexString.toString();
  //     }

  public static void main(String args[]) throws NoSuchAlgorithmException
  {
    Scanner in = new Scanner(System.in);

  // System.out.println("test");
  String test = testClass("String", 5);

  System.out.println(test);
  String user = "chady";
  String password = "Aboulhosn";
  String password2 = "aboulhosn";
  System.out.println(user);
  System.out.println(password);
  System.out.println(password2);
  String [] combo = saltProcess(user,password);
  user = combo[0];
  password = combo[1];
  System.out.println(user);
  System.out.println(password);

  // String password = "SHA-256";

  String password1 = generate256Hash(password);
  String password3 = generate256Hash(password2);



        // print SHA-256 Message Digest
        System.out.println("password Aboulhosn is : " + password1);
        System.out.println("password aboulhosn is : " + password3);
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


        // while(true)
        // {
        //   System.out.println("What combination do you want to test ?");
        //   String text = in.nextLine();
        //   boolean matches1 = Pattern.matches(test1, text);
        //   boolean matches2 = Pattern.matches(test2, text);
        //   boolean matches3 = Pattern.matches(test3, text);
        //   boolean matches4 = Pattern.matches(test4, text);
        //   boolean matches5 = Pattern.matches(test5, text);
        //   boolean matches6 = Pattern.matches(test6, text);
        //   boolean matches7 = Pattern.matches(test7, text);
        //   boolean matches8 = Pattern.matches(test8, text);
        //   boolean matches9 = Pattern.matches(test9, text);
        //   boolean matches10 = Pattern.matches(test10, text);
        //   boolean matches11 = !(Pattern.matches(test11, text));
        //
        //
        //
        //
        //   System.out.println("test1 combination of digits and letters = " + matches1);
        //   System.out.println("test2 only digits= " + matches2);
        //   System.out.println("test3 a-z capitals and LowerCase= " + matches3);
        //   System.out.println("test4 a-z lowercase Only= " + matches4);
        //   System.out.println("test5 a-z capital Only= " + matches5);
        //   System.out.println("test6 combination of digits and letters with number count indivudally = " + matches6);
        //   System.out.println("test7 combination of numbers and letters or operator = " + matches7);
        //   System.out.println("test8 for numbers and letters = " + matches8);
        //   System.out.println("test9 for numbers and letters with plus sign = " + matches9);
        //   System.out.println("test10 for numbers and letters with lookahead = " + matches10);
        //   System.out.println("test11 for numbers and letters with lookahead negation= " + matches11);
        // }


  }
private static String generate256Hash (String value) throws NoSuchAlgorithmException
{
  MessageDigest md = MessageDigest.getInstance("SHA-256");
  byte[] digest = md.digest(value.getBytes(StandardCharsets.UTF_8));
  String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
  return sha256;
}
  private static String[] saltProcess(String user, String password)
  {
    String [] combo = new  String [2];
    String saltOriginal = "q1C7XNnAa8ptgEhq3xeC";
    String saltpassWord = "62iJMBZnurFEWz58Y2KA";
    combo[0] = saltOriginal + user;
    combo[1] = saltpassWord + password + combo[0];

    // return (user, password);
    return combo;

  }

  public static String  testClass (String value, int num)
  {
    // System.out.println(value);
    // System.out.println(num + 10);
    return "return Value";
  }
}
