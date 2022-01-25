import java.util.Scanner;
class SumOfDigitsQ9
{
  // Tool
  int sumOfDigits(int num)
  {
    int sum = 0;
    while( num != 0)
    {
      int dig = num % 10;
      sum = sum + dig;
      num = num / 10;
    }
    return sum;
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the number ");
    int num = sc.nextInt();
    SumOfDigitsQ9 obj = new SumOfDigitsQ9();
    int sum = obj.sumOfDigits(num);
    System.out.println ("The sum of the digits are " + sum);
  }
}