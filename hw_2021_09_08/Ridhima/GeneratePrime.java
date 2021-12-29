// Scored - 5 points
import java.util.Scanner;
class GeneratePrime
{
  boolean isPrime(int num)
  {
    int factorCount = 0;
    for (int i = 1; i <= num; i++)
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
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the lower bound ");
    int lb = sc.nextInt();
    System.out.println("Enter the upper bound ");
    int ub = sc.nextInt();
    GeneratePrime obj = new GeneratePrime();
    System.out.println("The Prime numbers are");
    for(int i = lb; i <= ub; i++)
    {
      if( obj.isPrime(i) == true)
      {
        System.out.println( i + ",");
      }
    }
  }
}