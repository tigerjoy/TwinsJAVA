import java.util.Scanner;
class DigitCountQ8
{
  // Tool
  int countDigits(int num)
  {
    int count=0;
    while(num!=0)
    {
      int digit = num%10;
      count++;
      num/=10;
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    DigitCountQ8 obj = new DigitCountQ8();
    System.out.println("The number of digits are " + obj.countDigits(num));
  }
}