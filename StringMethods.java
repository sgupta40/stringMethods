
/**
 * This class contains a main( ) method only
 * and its purpose it to demonstrate the use
 * of several methods in the String class API
 * 
 * Each student must submit their completed code.
 * 
 * @author your team name 
 * @version todays's date
 */
public class StringMethods
{
    public static void main(String[ ] args)
    {
        String sentence;
        int count;
        
        sentence = new String("The Mississippi originates in Minnesota and flows to Louisiana.");
        System.out.println("The number of characters in the sentence:\n" + sentence + "\nis "+ sentence.length());
        count = 0;
        for(int k = 0; k < sentence.length( ); k++)
        {
            if(sentence.charAt(k) == 'i')
            {
                count++;
            }
        }

        System.out.println("The lowercase i appears " + count + " times.");

      //todo using the String class API methods
      /* 1) Does the sentence contain the string "nat" ? 
       *        System.out.println("Does the sentence contain 'nat' " + sentence.contains("nat"));
       * 2) Does the sentence contain the string "beat" ?
       *        System.out.println("Does the sentence contain 'beat' " + sentence.contains("beat"));
       * 3) Does the sentence end with "ana"?
       *        System.out.println("Does the sentence end with 'ana' " + sentence.endsWith("ana"));
       * 4) Does the sentence end with "ana."?
       *        System.out.println("Does the sentence end with 'ana.' " + sentence.endsWith("ana."));
       * 5) Where is the first occurance of 's' ?
       *        System.out.println("Where is the first occurance of 's'" + sentence.indexOf('s'));
       * 6) Where is the second occurance of 's'?
       *        System.out.println("Where is the second occurance of 's'" + sentence.indexOf('s', sentence.indexOf('s' + 1)));
       * 7) Where is the third occurance of 's'?
       *        System.out.println("Where is the third occurance of 's'" + sentence.indexOf('s', sentence.indexOf('s' + 2)));
       * 8) Where is the last occurace of 's'?
       *        System.out.println("Where is the last occurance of 's'" + sentence.lastIndexOf('s'));
       * 9) Where does the  first occurance of "is" start?
       *        System.out.println("Where is the first occurance of 'is'" + sentence.indexOf("is"));
       * 10)Where does the last occurance of "is" start"?
       *        System.out.println("Where is the last occurance of 'is'" + sentence.lastIndexOf("is"));
       * 11)Replace each occurance of 's' with 'z'.
       *        System.out.println("Replace each occurance of 's' with 'z' " + sentence.replace('s', 'z'));
       * 12) Does step 11 change the original sentence, prove it by printing.
       *        Yes
       * 13) Print the substring of the sentence beginning at character 3 for 6 characters"
       *        System.out.println(sentence.substring(3, 9));
       * 14) Print the entire sentence in upper case.
       *    System.out.println(sentence.toUpperCase());
       * 15) Does step 13 change the original string, prove it by printing
       * yes
       */
      
      System.out.println("Does the sentence contain 'nat' " + sentence.contains("nat"));
      System.out.println("Does the sentence contain 'beat' " + sentence.contains("beat"));
      System.out.println("Does the sentence end with 'ana' " + sentence.endsWith("ana"));
      System.out.println("Does the sentence end with 'ana.' " + sentence.endsWith("ana."));
      System.out.println("Where is the first occurance of 's'" + sentence.indexOf('s'));
      int first = sentence.indexOf('s');
      int second = first+1;
      
      System.out.println("Where is the second occurance of 's'" + sentence.indexOf('s', second));
      int third = sentence.indexOf('s', second+1);
     System.out.println("Where is the third occurance of 's'" + sentence.indexOf('s',third));
     
     System.out.println("Where is the last occurance of 's'" + sentence.lastIndexOf('s'));
      System.out.println("Where is the first occurance of 'is'" + sentence.indexOf("is"));
      System.out.println("Where is the last occurance of 'is'" + sentence.lastIndexOf("is"));
      System.out.println("Replace each occurance of 's' with 'z' " + sentence.replace('s', 'z'));
      System.out.println(sentence.substring(3, 8));
      System.out.println(sentence.toUpperCase());
      
     }
}
