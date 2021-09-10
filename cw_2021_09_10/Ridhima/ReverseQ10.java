import java.util.Scanner;
class ReverseQ10
{
  // Tool
  int reverse(int num)
  {
    int rev = 0;
    while (num != 0)
    {
      int dig = num % 10;
      rev = rev * 10 + dig;
      num /= 10;
    }
    return rev;
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    ReverseQ10 obj = new ReverseQ10();
    System.out.println ("The reversed number is " + obj.reverse(num));
  }
}