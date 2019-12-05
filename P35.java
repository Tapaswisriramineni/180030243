import java.util.*;
class Box
   {   
      double length,breadth,width;
    
      void dimension(double l,double b,double h)
         {
           this.length=l;
            this.breadth=b;
            this.width=h;
         }
      double volume()
          {
             return length*breadth*width;
          }
    }
      class P35
          {
            public static void main(String args[])
        {
          Box x=new Box();
          Scanner sc=new Scanner(System.in);
          double l=sc.nextDouble();
          double b=sc.nextDouble();
          double h=sc.nextDouble();
          x.dimension(l,b,h);
          System.out.println(x.volume());
         }
       }
             
          