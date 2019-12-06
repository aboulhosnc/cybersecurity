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
  // String test = testClass("String", 5);

  // System.out.println(test);
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
        // String test1 = ".*[a-zA-Z][\\d]{4}.*";
        // String test2 = ".*[\\d]{4}.*";
        // String test3 = ".*[a-zA-Z]{4}.*";
        // String test4 = ".*[a-z]{4}.*";
        // String test5 = ".*[A-Z]{4}.*";
        // String test6 = ".*[a-zA-Z]{4}[\\d]{4}.*";
        // String test7 = ".*([a-zA-Z]|[\\d]){4}.*";
        // String test8 = ".*[a-zA-Z][\\d].*";
        // String test9 = ".*([a-zA-Z]+[\\d]+).*";
        // String test10= ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";
        // String test11= ".*(?=.*[a-zA-Z])(?=.*[\\d]).*";

        String test14 = "([a-zA-Z])\1{3}";
        String test15 = "([0-9])\1{3}";
        String test16 = ".*(.)\1{3}.*";
        String test17 = ".*(\\w)\\1{3}.*";
        String test18 = ".*(\\d)\\1{3}.*";
        String test19 = ".*([a-zA-Z])\\1{3}.*";




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
          commonPasswords(text);
          // int textLength = text.length() - 4;

          // for(int y = 0; y <= textLength; y++)
          // {
          //   System.out.println(text.substring(y,y+4));
          //   System.out.println(y);
          // }

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
          // boolean matches14 = Pattern.matches(test14, text);
          // boolean matches15 = Pattern.matches(test15, text);
          // boolean matches16 = Pattern.matches(test16, text);
          // boolean matches17 = Pattern.matches(test17, text);
          // boolean matches18 = Pattern.matches(test18, text);
          // boolean matches19 = Pattern.matches(test19, text);

          // System.out.println("test14  repeat Letters = " + matches14);
          // System.out.println("test15  repeat Numbers = " + matches15);
          // System.out.println("test16  repeat any Letter or number = " + matches16);
          // System.out.println("test17  repeat any Letter or number java version = " + matches17);
          // System.out.println("test18  repeat any Number java version = " + matches18);
          // System.out.println("test18  repeat any Letter java version = " + matches19);


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
          // System.out.println("test12 is : " + test12);
          return true;

        }
        if(matches13)
        {
          // System.out.println("test12 only consecutive everything = " + matches12);
          // System.out.println("test13 only reverse everything = " + matches13);
          System.out.println("test13 is : " + test13);
          return true;
        }

      }

  }
// System.out.println("did not match reverse or foward");
return false;
}




  public static boolean  commonPasswords (String password)
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
}
