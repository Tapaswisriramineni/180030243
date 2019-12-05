import java.util.*;
import java.lang.*;
class Calculator
    {
       public static int powerInt(int num1,int num2)
           {
             double k=Math.pow(num1,num2);
             return (int)k;
           }
       public static double powerDouble(double num1,double num2)
            {
               double k=Math.pow(num1,num2);
               return k;
             }
         }
 class P36
      {
        public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println("power of integers:"+Calculator.powerInt(n,k));
            double p=sc.nextDouble();
            double q=sc.nextDouble();
            System.out.println("power of double:"+Calculator.powerDouble(p,q));
           }
        } 