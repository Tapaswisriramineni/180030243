import java.util.*;
class P8
   {
      public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          char chr=sc.next().charAt(0);
          if(Character.isLetter(chr))
              System.out.println("Alphabet");
          else if(Character.isDigit(chr))
              System.out.println("Digit");
          else
              System.out.println("Special character");
       }
   }