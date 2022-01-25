import java.util.Scanner;
class TwinPrimeQ42
{
  boolean isPrime(int num)
  {
    int factorCount= 0;
    for(int i=1; i<=num; i++)
    {
      if(num%i==0)
      {
        factorCount++;
      }
    }
    if(factorCount==2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  void displayTwinPrime(int lb,int ub)
  {
    for(int first=lb;first<=ub-2;first++)
    {
      int second=first+2;
      // (3,5);(5, 7)
      if(isPrime(first) && isPrime(second))
      {
        System.out.print("("+ first + "," + second + ")");
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the lower bound ");
    int lb = sc.nextInt();
    System.out.println("Enter the upper bound ");
    int ub = sc.nextInt();
    TwinPrimeQ42 obj = new TwinPrimeQ42();
    System.out.println("The twin prime numbers in a range are");
    obj.displayTwinPrime(lb, ub);
  }
}