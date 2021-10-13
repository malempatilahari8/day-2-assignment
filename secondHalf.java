import java.util.Scanner;

public class secondHalf
{
     public static void main(String args[])
     {
          Scanner s = new Scanner(System.in);
          String s1 = s.nextLine();
          String s2=new String();
          
          for(int i=s1.length()/2;i<s1.length();i++)
          {
               char c=s1.charAt(i);
               s2=s2+c;
              
          }
          System.out.println(s2);
    }
}