import java.util.Scanner;
class DigitQ7
{
  // Tool
  void printDigit(int num)
  {
    while(num != 0)
    {
      int dig = num % 10;
      System.out.println(dig);
      num = num / 10;
    }
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    DigitQ7 obj = new DigitQ7();
    System.out.println("The digits of the number are ");
    obj.printDigit(num);
  }
}