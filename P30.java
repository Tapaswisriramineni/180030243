import java.util.*;
class P30
   {
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
       for(int i=0;i<n;i++)
         {
          for(int j=0;j<n;j++)
            {
           if(i!=j)
            {
             if(a[i]==a[j])
               a[j]=-1;
             }
          }
        }
       for(int i=0;i<n;i++)
         {
          if(a[i]!=-1)
             System.out.println(a[i]);
          }
     }
}