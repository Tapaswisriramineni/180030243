import java.util.*;
class P28
   {
    public static void main(String args[])
      {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
       int min1=a[0],min2=a[0],max1=a[0],max2=a[0];
       for(int i=0;i<n;i++)
         {
          if(max1<=a[i])
          {
           max2=max1;
           max1=a[i];
          }
          else if(a[i]>max2&&a[i]!=max1)
            max2=a[i];
          }
          for(int i=0;i<n;i++)
          {
          if(min1>a[i])
            {
              min2=min1;
              min1=a[i];
            }
           else if(a[i]<min2&&a[i]!=min1)
               min2=a[i];
           }
         
          System.out.println("The first largest number is:"+max1+" the second largest number is:"+max2);
          System.out.println("The first smallest number is:"+min1+" the second smallest number is:"+min2);
         }
      }