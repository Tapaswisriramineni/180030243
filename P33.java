import java.util.*;
class P33
   {
     public static void main(String args[])
       {
         if(args.length<4)
           System.out.println("Please enter 4 integer numbers");
         else
          {
            int k[][]=new int[2][2];
           int p=0;
               for(int i=0;i<2;i++)
                 {
                  for(int j=0;j<2;j++)
                    {

                     k[i][j]=Integer.parseInt(args[p]);
                     p++;
                     }
                 }
                  
             for(int i=0;i<2;i++)
                {
                  for(int j=0;j<2;j++)
                   {

                    System.out.print(k[i][j]+" ");
                    }
                    System.out.println();
                 }
           }
         }
        } 