import java.util.*;
class P9
   {
     public static void main(String args[])
        {
          if(args[0]=="female")
            {
               int a=Integer.parseInt(args[1]);
               if(a>=1&&a<=58)
                  System.out.println("8.2%");
               else
                  System.out.println("7.6%");
              }
            else if(args[0]=="male")
              {
                int a=Integer.parseInt(args[1]);
                 if(a>=1&&a<=60)
            System.out.println("9.2%");
             else 
                  System.out.println("8.3%");
            }
}
}