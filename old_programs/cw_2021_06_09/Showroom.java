import java.util.Scanner;
class Showroom
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Total Cost: ");
    int totalCost = sc.nextInt();
    double discount = 0;
    if (totalCost <= 2000)
    {
      discount = totalCost * (5/100.0);
      System.out.println("You have got a Wall Clock ");
    }
    else if (totalCost <= 5000)
    {
      discount = totalCost * (10/100.0);
      System.out.println("You have got a School Bag ");
    }
    else if (totalCost <= 10000)
    {
      discount = totalCost * (15/100.0);
      System.out.println("You have got a Electric Iron ");
    }
    else if (totalCost > 10000)
    {
      discount = totalCost * (20/100.0);
      System.out.println("You have got a Wrist Watch ");
    }
    double amount = totalCost - discount;
    System.out.println ("Amount to be paid after the discount " +amount);
    System.out.println ("Discount is " +discount);
  }
}