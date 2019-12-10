import java.util.*;
class Person
   {
    String name;
    int id;
    String gender;
    void details(String name,int id,String gender)
        {
         this.name=name;
         this.id=id;
         this.gender=gender;
    }
}
class Student extends Person
    {
       int age;
        void d1(int age)
          {
          this.age=age;
        }
     }
class Teacher extends Person
    {
      double salary;
      String subject;
      void d2(double salary,String subject)
        {
          this.salary=salary;
          this.subject=subject;
        }
       void display1()
            {
             System.out.println("The teacher details:");
             System.out.println("The name of teacher:"+name);
             System.out.println("The id of teacher:"+id);
             System.out.println("The gender of teacher:"+gender);
             System.out.println("The salary of teacher:"+salary);
             System.out.println("The subject of teacher:"+subject);
             }
    }
class Collegestudent extends Student
        {
          int year;
          String branch;
          void d3(int year,String branch)
             {
              this.year=year;
              this.branch=branch;
             }
         void display()
            {
             System.out.println("The student details:");
             System.out.println("The name of student:"+name);
             System.out.println("The id of student:"+id);
             System.out.println("The gender of student:"+gender);
             System.out.println("The age of student:"+age);
             System.out.println("The year of student:"+year);
             System.out.println("The branch of student:"+branch);
             }

        }
class P41
     {
         public static void main(String args[])
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter student name:");
                 String s=sc.next();
                 System.out.println("Enter student id:");
                 int i=sc.nextInt();
                 System.out.println("Enter gender of student:");
                 String g=sc.next();
                 System.out.println("Enter the year of student:");
                 int y=sc.nextInt();
                 System.out.println("Enter the branch of student:");
                 String b=sc.next();
                 System.out.println("Enter age of student:");
                 int a=sc.nextInt();
                 System.out.println("Enter teacher name:");
                 String s1=sc.next();
                 System.out.println("Enter teacher id:");
                 int i1=sc.nextInt();
                 System.out.println("Enter gender of teacher:");
                 String g1=sc.next();
                 System.out.println("Enter salary of teacher:");
                 double salary=sc.nextDouble();
                 System.out.println("Enter subject of teacher:");
                 String subject=sc.next();
                 Collegestudent cg=new Collegestudent();
                 cg.details(s,i,g);
                 cg.d1(a);
                 cg.d3(y,b);
                 cg.display();
                 Teacher t=new Teacher();
                 t.details(s1,i1,g1);
                 t.d2(salary,subject);
                 t.display1();
               }
           }
                 