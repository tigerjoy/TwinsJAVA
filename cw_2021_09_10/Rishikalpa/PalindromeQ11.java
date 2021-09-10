import java.util.Scanner;
class PalindromeQ11
{
  int reverse(int num)
  {
    int rev = 0;
    while(num!=0)
    {
      int digit = num%10;
      rev = rev * 10+digit;
      num/=10;
    }
    return rev;
  }
  boolean isPalindrome(int num)
  {
    int rev = reverse(num);
    if(num==rev)
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
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    PalindromeQ11 obj = new PalindromeQ11();
    if(obj.isPalindrome(num)==true)
    {
      System.out.println(num + " is a palindrome number ");
    }
    else
    {
      System.out.println(num+ " is not a palindrome number ");
    }

  } 
}
