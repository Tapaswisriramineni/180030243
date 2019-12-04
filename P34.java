import java.util.*;
class P34
   {
     public static void main(String args[])
       {
         if(args.length<9)
           System.out.println("Please enter 9 integer numbers");
         else
          {
            int k[][]=new int[3][3];
           int p=0;
               for(int i=0;i<3;i++)
                 {
                  for(int j=0;j<3;j++)
                    {

                     k[i][j]=Integer.parseInt(args[p]);
                     p++;
                     }
                 }
             System.out.println("The given array is:");
             int max=k[0][0];
             for(int i=0;i<3;i++)
                {
                  for(int j=0;j<3;j++)
                   {
                     if(k[i][j]>=max)
                      max=k[i][j];
                    System.out.print(k[i][j]+" ");
                    }
                    System.out.println();
                 }
               System.out.println("The biggest number in the given array is:"+max);
           }
         }
        } 