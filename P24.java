import java.util.*;
class P24
  {
   public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
          int a[]=new int[n];
         for(int i=0;i<n;i++)
             {
               a[i]=sc.nextInt();
               s=s+a[i];
             }
          int avg=s/n;
           System.out.println(s);
           System.out.println(avg);
         }
      }
             
          