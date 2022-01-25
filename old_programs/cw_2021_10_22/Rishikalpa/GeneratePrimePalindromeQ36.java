import java.util.Scanner;
class GeneratePrimePalindromeQ36
{
  boolean isPrime(int num)
  {
    int factorCount=0;
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
  int reverse (int num)
  {
    int rev=0;
    while(num!=0)
    {
      int digit=num%10;
      rev=rev*10+digit;
      num/=10;
    }
    return rev;
  }
  boolean isPalindrome(int num)
  {
    int rev=reverse(num);
    if(num==rev)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  boolean isPrimePalindrome(int num)
  {
    if(isPalindrome(num) && isPrime(num))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower bound ");
    int lb = sc.nextInt();
    System.out.println("Enter the upper bound ");
    int ub = sc.nextInt();
    GeneratePrimePalindromeQ36 obj = new GeneratePrimePalindromeQ36();
    System.out.println("The Prime Palindrome Numbers in a range are ");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isPrimePalindrome(i)==true)
      {
        System.out.print(i+ ",");
      }
    }
  }
}