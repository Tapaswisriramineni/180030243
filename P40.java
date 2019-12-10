import java.util.*;
     class P40
         {
         public static void main(String args[])
           {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter name:");
             String n=sc.next();
             System.out.println("Enter salary:");
             double s=sc.nextDouble();
             System.out.println("Enter year of joining:");
             int y=sc.nextInt();
              System.out.println("Enter the national insurance number:");
              String i=sc.next();
              Employee e=new Employee(s,y,i,n);
              
              System.out.println("The name of employee:"+e.getName());
         
              System.out.println("The salary of employee:"+e.getSalary());
              System.out.println("The year of joining of employee:"+e.getYear());
              System.out.println("The national insurance number:"+e.getNational_insurance());
            }
       }