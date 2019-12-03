import java.util.*;
import java.lang.*;
class P17
   {
      public static void main(String args[])
        {
           int n=Integer.parseInt(args[0]);
           
           if(n<=1)
           System.out.println("Neither prime nor composite");
           else
             {
                int flag=0;
              if(n==2)
               {
                System.out.println("prime");
               }               
              else
                {
                 for(int i=2;i<=Math.sqrt(n);i++)
                   {
                     if(n%i==0)
                       {
                         System.out.println("Not a prime");
                         flag=1;
                         break;
                        }
                     }
                    if(flag==0)
                      System.out.println("prime");
                   }
                  }
               }
           }
