import java.util.Scanner;
class GreatestSmallest
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = sc.nextInt();
    System.out.println("Enter the third number: ");
    int num3 = sc.nextInt();
    // Finds the largest number
    if ((num1>=num2) && (num1>=num3))
    {
      System.out.println(num1 + " is largest");
    }
    else if ((num2>=num1) && (num2>=num3))
    {
      System.out.println(num2 + " is largest");
    }
    else 
    {
      System.out.println( num3 + " is the largest");
    }
    // Finds the smallest number
    if ((num1<=num2) && (num1<=num3))
    {
      System.out.println(num1 + " is smallest");
    }
    else if ((num2<=num1) && (num2<=num3))
    {
      System.out.println(num2 + " is smallest");
    }
    else 
    {
      System.out.println( num3 + " is the smallest");
    }
  }
}