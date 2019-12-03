import java.util.*;
class P18
   {
       public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int t=n;
          int d,s=0;
          for(;n>0;)
            {
             d=n%10;
             s=s+d;
             n=n/10;
            }
            System.out.println(t+"->"+s);
        }
   }

             