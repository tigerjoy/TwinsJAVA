import java.util.Scanner;
class HarshadNumberQ25
{
  int sumOfDigits(int num)
  {
    int sum=0;
    while(num!=0)
    {
      int digit= num%10;
      sum = sum+digit;
      num/=10;
    }
    return sum;
  }
  boolean isHarshadNumber(int num)
  {
    if(num%sumOfDigits(num)==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    HarshadNumberQ25 obj = new HarshadNumberQ25();
    if(obj.isHarshadNumber(num)==true)
    {
      System.out.println(num+ " is a Harshad Number" );
    }
    else
    {
      System.out.println(num+ " is not a Harshad Number" );
    }
  }
}