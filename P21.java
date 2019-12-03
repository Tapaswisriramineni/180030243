import java.util.*;
class P21
   {
       public static void main(String args[])
        {
          
          int n=Integer.parseInt(args[0]);
          int t=n;
          int d,s=0;
          while(n>0)
            {
             d=n%10;
             s=s*10+d;
             n=n/10;
            }
         if(t==s)
           System.out.println("Palindrome");
          else
            System.out.println("Not a Palindrome"); 
          
      
        }
   }

             