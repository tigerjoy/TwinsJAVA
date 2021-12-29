import java.util.Scanner;
class HarshadQ25
{
  int sumOfDigits(int num)
  {
    int sum = 0;
    while (num != 0)
    {
      int digit = num % 10;
      sum = sum + digit;
      num /= 10;
    }
    return sum;
  }
  boolean isHarshad(int num)
  {
    int sum = sumOfDigits(num);
    if (num % sum == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the number: ");
    int num = sc.nextInt();
    HarshadQ25 obj = new HarshadQ25();
    if (obj.isHarshad(num) == true)
    {
      System.out.println (num + " is a Harshad number ");
    }
    else
    {
      System.out.println (num + " is not a Harshad number ");
    }
  }
}