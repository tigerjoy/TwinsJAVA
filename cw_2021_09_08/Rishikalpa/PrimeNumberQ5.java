import java.util.Scanner;
class PrimeNumberQ5
{
  // Tool
  boolean isPrime(int num)
  {
    int factorCount= 0;
    for(int i=1;i<=num;i++)
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
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    PrimeNumberQ5 obj= new PrimeNumberQ5();
    if(obj.isPrime(num)==true)
    {
      System.out.println(num + " is a prime number");
    }
    else
    {
      System.out.println(num + " not a prime number");
    }
    
  }
}