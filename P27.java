import java.util.*;
class P27
   {
    public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
         for(int i=0;i<n;i++)
           System.out.print(Character.toString(a[i])+" ");
       }
     }