// Scored - 5 points
import java.util.Scanner;
class Taximeter

{
   String name;
   int taxino;
   int km;
   int b;
  
   // OBSERVATION #1
   // Is the name of the constructor same as that
   // of the class name?
   Taximeter()
   {
       name="";// empty string
       taxino = 0;
       km=0;
       b=0;
   }

   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name : ");
       name=sc.nextLine();
       System.out.println("Enter the Taxi number : ");
       taxino=sc.nextInt();
       System.out.println("Enter the distance travelled : ");
       km=sc.nextInt();
   }
   // OBSERVATION #2
   // What you've stored in b is the rate and not the Bill
   // amount. If the km travelled is 5, then the bill is
   // 5 * 10 = Rs. 50, and not Rs. 10.
   void calculate()
   {
       if(km<=1)
       {
       b=25;
       }
       if(km>1 && km<=6)
       {
       b=km*10;
       } 
       if(km>6 && km<=12)
       {
       b=km*15;
       }
       if(km>12 && km<=18)
       {
       b=km*20;
       }
       if(km>18)
       {
       b=km*25;
       }
   }
   void display()
   {
       System.out.println("Taxi number  Name  Kilometres travelled  Bill amount  ");
       System.out.println(taxino + "\t" + name + "\t" + km + "\t" + b);
   }
   public static void main(String args[])
   {
      // OBSERVATION #3
      // What is the name of the class?
       Taximeter ob= new Taximeter();
       ob.input();
       ob.calculate();
       ob.display();
   }
}

