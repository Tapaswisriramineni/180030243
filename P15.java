import java.util.*;
import java.lang.*;
class P15
   {
      public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           if(n<=1)
           System.out.println("Not a prime");
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
