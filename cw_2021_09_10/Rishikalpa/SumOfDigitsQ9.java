import java.util.Scanner;
class SumOfDigitsQ9
{
  int sumOfDigit(int num)
  {
    int sum=0;
    while(num!=0)
    {
      int digit = num%10;
      sum= sum+digit;
      num =num/10;
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    SumOfDigitsQ9 obj = new SumOfDigitsQ9();
    //int sum=obj.sumOfDigit(num);
    System.out.println("The sum of all digits is " + obj.sumOfDigit(num));
  }
}