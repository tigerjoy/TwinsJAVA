import java.util.Scanner;
class ElectricityBill
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the name");
    String name = sc.nextLine();
    System.out.println("Enter the consumer number");
    int consumerNumber = sc.nextInt();
    System.out.println("Enter the units consumed");
    int units = sc.nextInt();
    double amount;
    if(units>=0 && units<=100)
    {
      amount=units*5.5;
    }
    else if(units>=101 && units<=300)
    {
      amount=(100*5.5)+((units-100)*6.50);
    }
    else if(units>=301 && units<=600)
    {
      amount=(100*5.5)+(200*6.5)+((units-300)*7.5);
    }
    else
    {
      amount=(100*5.5)+(200*6.5)+(300*7.5)+((units-600)*8.5);
    }
    System.out.println("\t\t\t\t\t\tMoney Recipt");
    System.out.println("Consumer Number: "+ consumerNumber);
    System.out.println("Consumers Name: "+ name);
    System.out.println("Units consumed: "+ units);
    System.out.println("Amount to be paid: "+ amount);
  }
}