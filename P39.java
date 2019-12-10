import java.util.*;
class Animal
    {
       void eat()
          {
            System.out.println("The animals eats");
          }
       void sleep()
          {
            System.out.println("The animals sleep");
          }
     }
class Bird extends Animal
       {
         void eat()
            {
              System.out.println("The bird eats");
             }
         void sleep()
            {
             System.out.println("The bird sleeps");
             }
        void fly()
            {
             System.out.println("The birds fly");
             }
          }
class P39
     {
      public static void main(String args[])
             {
               Animal a=new Animal();
               a.eat();
               a.sleep();
               Bird b=new Bird();
               b.eat();
               b.sleep();
               b.fly();
              }
         } 