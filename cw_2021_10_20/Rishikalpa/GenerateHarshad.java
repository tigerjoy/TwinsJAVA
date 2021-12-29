import java.util.Scanner;
class GenerateHarshad
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
    System.out.println("Enter lb: ");
    int lb = sc.nextInt();
    System.out.println("Enter ub: ");
    int ub = sc.nextInt();
    GenerateHarshad obj = new GenerateHarshad();
    // The harshad numbers in range are
    System.out.println("The harshad numbers in range are ");
    for(int i=lb;i<=ub;i++)
    {
      if(obj.isHarshadNumber(i)==true)
      {
        System.out.print(i + ",");
      }
    }
  }
}