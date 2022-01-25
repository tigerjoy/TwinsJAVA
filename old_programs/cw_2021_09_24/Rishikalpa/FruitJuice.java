// Scored - 8 points
import java.util.Scanner;
class FruitJuice
{
   String flavor;
   String pack_type;
   int product_code;
   int pack_size;
   int product_price;

   FruitJuice()
   {
     flavor = "";//empty String
     pack_type= "";//empty String
     product_code=0;
     pack_size=0;
     product_price=0;
   }
   void input()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the flavor ");
     flavor = sc.nextLine();
     System.out.println("Enter the pack type ");
     pack_type = sc.nextLine();
     System.out.println("Enter the product code ");
     product_code = sc.nextInt();
     System.out.println("Enter the pack size ");
     pack_size = sc.nextInt();
     System.out.println("Enter the product price ");
     product_price = sc.nextInt();
   }
   // OBSERVATION #1
  // You were asked ot reduce product_price
  // by 10. Where was it mentioned that you
  // needed to calculate discount at 10%?
   void discount()
   {
      //  double discount = product_price*10.0/100.0;
      product_price -= 10;
    }
   void display()
   {
     System.out.println("Flavor = " + flavor);
     System.out.println("Pack Type = "+ pack_type);
     System.out.println("Product code = " + product_code);
     System.out.println("Pack Size = " + pack_size);
     System.out.println("Product price" + product_price);
   }
   public static void main(String args[])
   {
     FruitJuice obj = new FruitJuice();
     obj.input();
     obj.discount();
     obj.display();
   }
}