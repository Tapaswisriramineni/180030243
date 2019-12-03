import java.util.*;
class P22
   {
    public static void main(String args[])
      { 
         int c=5,i=2;
         while(c>0)
           {
            if(i%2==0&&i%3==0&&i%5==0)
            {
              System.out.println(i);
              c--;
             }
            i++;
            }
          
      }
  }