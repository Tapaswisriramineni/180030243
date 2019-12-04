import java.util.*;
class P31
   {
    public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a[]=new int[n];
           int h[]=new int[100];
           for(int i=0;i<n;i++)
             {
             a[i]=sc.nextInt();
             }
           for(int i=0;i<n;i++)
             {
               h[a[i]]++;
             }
          int max=h[0],t=0;
           for(int i=0;i<100;i++)
             {
               if(max<=h[i])
                {
                  max=h[i];
                  t=i; 
                 }
               }
            System.out.println(t);
      } 
  }