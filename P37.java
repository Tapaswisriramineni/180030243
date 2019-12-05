import java.util.*;
class Patient
   {
     String name;
     double height;
     double weight;
     void details(String n,double h,double w)
       {
         this.name=n;
         this.height=h;
         this.weight=w;
       }
     double BMI()
       {
         double k;
           k=weight/Math.pow(height,2);
           return k*703;
        }
     }
class Patients
     {
       public static void main(String args[])
         {
           Patient p=new Patient();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter patient name:");
           String n=sc.next();
           System.out.println("Enter patient height:");
           int h=sc.nextInt();
           System.out.println("Enter patient weight:");
           int w=sc.nextInt();
           p.details(n,h,w);
           System.out.println("The BMI of patient:"+p.BMI());
          }
      }