// Scored - 5 points
import java.util.Scanner;
class GenerateEmirpQ24
{
  boolean isPrime (int num)
  {
    int factorCount = 0;
    for (int i = 1; i<= num; i++)
    {
      if (num % i == 0)
      {
        factorCount ++;
      }
    }
    if (factorCount == 2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  int reverse (int num)
  {
    int rev = 0;
    while (num != 0)
    {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num /= 10;
    }
    return rev;
  }
  boolean isEmirp(int num)
  {
    int rev = reverse(num);
    if (isPrime(num) && isPrime(rev))
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
    System.out.println ("Enter lb: ");
    int lb = sc.nextInt();
     System.out.println ("Enter ub: ");
    int ub = sc.nextInt();
    GenerateEmirpQ24 obj = new GenerateEmirpQ24();
    System.out.println ("The Emirp numbers in range are ");
    for(int i = lb; i<= ub; i++)
    {
      if (obj.isEmirp(i) == true)
      {
        System.out.print (i + ",");
      }
    }
  }
}