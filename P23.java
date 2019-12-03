import java.util.*;
   class P23
     {
       public static void main(String args[])
         {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter the two numbers:");

            int x1=sc.nextInt();
            int x2=sc.nextInt();
           String s;
            
            
            
            do
             {
               System.out.println("1.Add");
             System.out.println("2.Subtract");
               int o=sc.nextInt();
                      if(o==1)
                       System.out.println(x1+x2);
                      else if(o==2)
                       System.out.println(x1-x2);
                      System.out.println("Do You want to continue the program(y/n)");
                       s=sc.next();
                
                }while(s=="y"||s=="Y");
             }
          }