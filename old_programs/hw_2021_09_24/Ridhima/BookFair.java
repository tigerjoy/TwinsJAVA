// Scored - 8 points
import java.util.Scanner;
class BookFair
{
    String bname;
    double price;
    
    BookFair() 
    {
        bname = "";
        price = 0.0;
    }
    
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the book: ");
        bname = sc.nextLine();
        System.out.print("Enter price of the book: ");
        price = sc.nextDouble();
    }
    
    void calculate() 
    {
       double disc;
       if (price <= 1000)
       {
          disc = price * 0.02;
       }
       else if (price <= 3000)
       {
          disc = price * 0.1;
       }
       else
       {
          disc = price * 0.15;
          // price -= disc;
       }
       price -= disc;
    } 
    
    void display() 
    {
        System.out.println("Book Name: " + bname);
        System.out.println("Price after discount: " + price);
    }
    
    public static void main (String args[]) 
    {
       BookFair obj = new BookFair();
       obj.input();
       obj.calculate();
       obj.display();
    }
}