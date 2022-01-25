// Scored - 10 points
import java.util.Scanner;
class Mobike
{
   String phno;
   String name;
   int bno;
   int days;
   int charge;
   
   Mobike()
   {
       phno= "";//empty String
       name= "";//empty String
       bno= 0;
       days=0;
       charge=0;
   }
   void input()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter costomer phone number ");
    phno = sc.nextLine();
    System.out.println("Enter the name ");
    name = sc.nextLine();
    System.out.println("Enter bike number ");
    bno = sc.nextInt();
    System.out.println("Enter number of days ");
    days = sc.nextInt();
    System.out.println("Enter the charge ");
    charge = sc.nextInt();
  }
  void compute()
  {
      if(days<=5)
      {
          charge = days*500;
      }
      else if(days<=10)
      {
          charge= (5*500) + ((days - 5)*400);
      }
      else 
      {
          charge = (5*500)+(5*400)+((days-10)*200);
      }
    }
  void display()
  {
     System.out.println("Bike Number \t Phone Number \t Name \t Number of days \t Charge");
     System.out.println(bno + "\t" + phno+ "\t" + name + "\t" + days + "\t" + charge);
   }
   public static void main(String args[])
   {
     Mobike obj = new Mobike();
     obj.input();
     obj.compute();
     obj.display();
   }
}