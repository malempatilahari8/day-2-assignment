import java.util.Scanner;

public class replace
{
     public static void main(String args[])
     {
          Scanner s = new Scanner(System.in);
          String s1 = s.nextLine();
          char[] s2 = s1.toCharArray();
          
          for (int i = 1; i < s2.length - 1; i += 2)
          {
            char temp = s2[i];
            s2[i] = s2[i + 1];
            s2[i + 1] = temp;
          
          }
    System.out.println(s2);
    }
}