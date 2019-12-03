import java.util.*;
class P6
  {
   public static void main(String args[])
     {
       
      if(args.length!=0)
        {
           for(int i=0;i<args.length-1;i++)
            {
             System.out.print(args[i]+",");
            }
            System.out.print(args[args.length-1]);
        }
      
      
      else
         System.out.println("No values");
     }
  }

