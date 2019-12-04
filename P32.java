import java.util.*;
class P32
   {
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int s=0,k=-1,p=-1;
     for(int i=0;i<n;i++)
         {
          for(int j=i+1;j<n;j++)
           {
           if(a[i]==6)
            { 
              if(a[j]==7)
               {
                 k=i;
                 p=j;
                 break;
               } 
             }
            } 
           }
        if(k!=-1&&p!=-1)
        {
       for(int x=k;x<=p;x++)
          {
            a[x]=0;
           }
          }
         for(int i=0;i<n;i++)
            s=s+a[i];
        System.out.println(s);
      }
   }  
             