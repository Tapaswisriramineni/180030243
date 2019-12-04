import java.util.*;
class P26
  {
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          {
             a[i]=sc.nextInt();
          }
         int s=sc.nextInt();
         int flag=0,t=0;
       for(int i=0;i<n;i++)
          {
             if(a[i]==s)
              {
                flag=1;
                t=i+1; 
                break;
               }
            }
          if(flag==0)
           System.out.println("-1");
          else
            System.out.println(t);
         }
        }
