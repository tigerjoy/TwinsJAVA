import java.util.Scanner;
class NeonNumberQ40
{
  int sumOfDigits (int num)
  {
    int sum = 0;
    while (num!= 0)
    {
      int dig = num % 10;
      sum = sum + dig;
      num /= 10;
    }
    return sum;
  }
  boolean isNeon (int num)
  {
    int square = num * num;
    int sumDigSq = sumOfDigits(square);
    if (num == sumDigSq)
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
    System.out.println ("Enter the number ");
    int num = sc.nextInt();
    NeonNumberQ40 obj = new NeonNumberQ40();
    if (obj.isNeon(num) == true)
    {
      System.out.println (num + " is a Neon number ");
    }
    else
    {
      System.out.println (num + " is not a Neon number ");
    }
  }
}