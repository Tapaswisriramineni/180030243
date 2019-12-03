import java.util.*;
class P7
  {
   public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
    //String a=sc.next();
     char a1=sc.next().charAt(0);
     //String b=sc.next();
    char b1=sc.next().charAt(0);
         if(Character.compare(a1,b1)>0)
          System.out.println(b1+","+a1);
       else
          System.out.println(a1+","+b1);
          
         
      
       
     }
  }
