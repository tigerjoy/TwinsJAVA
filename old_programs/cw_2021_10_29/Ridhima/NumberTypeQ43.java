import java.util.Scanner;
class NumberTypeQ43
{
  int sumOfProperDivisor (int num)
  {
    int sum = 0;
    for (int i = 1; i <= (num / 2); i++)
    {
      if (num % i == 0)
      {
        sum = sum + i;
      }
    }
    return sum;
  }
  boolean isAbundant (int num)
  {
    if (sumOfProperDivisor (num) > num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  boolean isDeficient (int num)
  {
    if (sumOfProperDivisor (num) < num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  boolean isPerfect (int num)
  {
    if (sumOfProperDivisor (num) == num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the number: ");
    int num = sc.nextInt();
    NumberTypeQ43 obj = new NumberTypeQ43();
    if (obj.isAbundant(num) == true)
    {
      System.out.println (num + " is an Abundant number");
    }
    else if (obj.isDeficient(num) == true)
    {
      System.out.println (num + " is an Deficient number");
    }
    else if (obj.isPerfect(num) == true)
    {
      System.out.println (num + " is an Perfect number");
    }
  }
}