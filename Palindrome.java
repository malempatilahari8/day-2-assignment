import java.util.Scanner;

public class Palindrome
{
     public static void main(String args[])
     {
        String s1, s2 = "";
      Scanner sc = new Scanner(System.in);
 
      s1 = sc.nextLine();
 
      int length = s1.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         s2 = s2 + s1.charAt(i);
 
      if (s1.equals(s2))
         System.out.println(s1+" is a palindrome");
      else
         System.out.println(s1+" is not a palindrome");
    }
}