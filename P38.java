import java.util.*;
class Author
   {
     private String name;
     private String email;
     private char gender;
     
     Author(String n,String e,char g)
       {
          this.name=n;
          this.email=e;
          this.gender=g;
          System.out.println("The Name Of Author"+name);
          System.out.println("The Email of Author"+email);
          System.out.println("The Gender of Author"+gender);
 
        }
    }
class Book
     {
        private String name;
        private String author;
        private double price;
        private int qtyInStock;
      
       
        Book(String name,String author)
           {
            this.name=name;
            this.author=author;
            }
        String getName()
           {
             return name;
            }
         String getAuthor()
             {
               return author;
              }
          void setPrice(double price) 
              {
                this.price=price;
               }
         void setQtyInStock(int qtyInStock)
               {
                  this.qtyInStock=qtyInStock;
                }
         double getPrice()
            {
              return price;
             }
         double getQtyInStock()
              {
                return qtyInStock;
               }
      }
class P38
    {
       public static void main(String args[])
          {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Author Name:");
               String n=sc.next();
               System.out.println("Enter Author Email:");
               String e=sc.next();
               System.out.println("Enter gender:");
               char g=sc.next().charAt(0);
               Author a=new Author(n,e,g);
               
               System.out.println("Enter book name:");
               String name=sc.next();
               System.out.println("Enter book price:");
               Double price=sc.nextDouble();
               System.out.println("Enter quantity of stock:");
               int qtyInStock=sc.nextInt();
               Book b=new Book(name,n);
               
               b.setPrice(price);
               b.setQtyInStock(qtyInStock);
               System.out.println("The name of the book:"+b.getName());
               System.out.println("The price of the book:"+b.getPrice());
               System.out.println("The quantity of stock:"+b.getQtyInStock());
               
            }
          }
