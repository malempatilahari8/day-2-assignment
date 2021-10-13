import java.util.Scanner;

public class Firsthalf
{
     public static void main(String args[])
     {
          System.out.println(Firsthalf("lahari"));
     }
     public static String Firsthalf(String myString)
     {
          int FirsthalfEnd = myString.length()/2;
          String finalResult = myString.substring(0,FirsthalfEnd);
          return finalResult;
     }

     }