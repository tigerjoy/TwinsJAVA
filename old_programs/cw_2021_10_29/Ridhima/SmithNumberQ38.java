import java.util.Scanner;
class SmithNumberQ38
{
  boolean isComposite (int num)
  {
    int factorCount = 0;
    for (int i = 1; i <= num; i ++)
    {
      if (num % i == 0)
      {
        factorCount ++;
      }
    }
    if (factorCount > 2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  int sumOfDigits (int num)
  {
    int sum = 0;
    while (num != 0)
    {
      int digit = num % 10;
      sum += digit;
      num /= 10;
    }
    return sum;
  }
  int sumOfPrimeFactorization (int num)
  {
    int fact = 2;
    int sum = 0;
    while (num != 1)
    {
      if (num % fact == 0)
      {
        num /= fact;
        sum += sumOfDigits (fact);
      }
      else
      {
        fact ++;
      }
    }
    return sum;
  }
  boolean isSmith (int num)
  {
    if (isComposite (num) && (sumOfDigits(num) == sumOfPrimeFactorization(num)))
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
    SmithNumberQ38 obj = new SmithNumberQ38();
    if (obj.isSmith (num) == true)
    {
      System.out.println (num + " is a Smith number");
    }
    else
    {
      System.out.println (num + " is not a Smith number");
    }
  }
}