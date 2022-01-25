import java.util.Scanner;
class Discount
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of the laptop: ");
    int laptopPrice = sc.nextInt();
    System.out.print("Enter the price of the printer: ");
    int printerPrice = sc.nextInt();

    double laptopDiscount = laptopPrice*(15/100.0);
    double printerDiscount = printerPrice*(10/100.0);

    System.out.println("The discount on laptop is "+ laptopDiscount);
    System.out.println("The discount on printer is "+ printerDiscount);
  }
}