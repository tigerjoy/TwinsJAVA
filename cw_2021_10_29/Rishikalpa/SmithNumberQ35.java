import java.util.Scanner;
class SmithNumberQ35
{
  int sumOfDigits(int num)
  {
    int sum=0;
    while(num!=0)
    {
      int digit=num%10;
      sum= sum+digit;
      num=num/10;
    }
    return sum;
  }
  boolean isComposite(int num)
  {
    int factorCount=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factorCount++;
      }
    }
    if(factorCount>2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  int sumOfPrimeFactorization(int num)
  {
    int fact=2;
    int sum=0;
    while(num!=1)
    {
      if(num%fact==0)
      {
        num=num/fact;
        sum+=sumOfDigits(fact);
      }
      else
      {
        fact++;
      }
    }
    return sum;
  }
  boolean isSmith(int num)
  {
    if(isComposite(num) && (sumOfDigits(num)== sumOfPrimeFactorization(num)))
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    SmithNumberQ35 obj= new SmithNumberQ35();
    if(obj.isSmith(num)==true)
    {
      System.out.println(num+ " is a smith number");
    }
    else
    {
        System.out.println(num+ " is not a smith number");
    }
  }
}