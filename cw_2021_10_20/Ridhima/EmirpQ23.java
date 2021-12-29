import java.util.Scanner;
class EmirpQ23
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
    System.out.println ("Enter the number: ");
    int num = sc.nextInt();
    EmirpQ23 obj = new EmirpQ23();
    if (obj.isEmirp(num) == true)
    {
      System.out.println (num + " is a Emirp number ");
    }
    else
    {
      System.out.println (num + " is not a Emirp number ");
    }
  }
}