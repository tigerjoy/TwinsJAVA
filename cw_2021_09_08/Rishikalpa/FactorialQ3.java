import java.util.Scanner;
class FactorialQ3
{
  // Tool
  int factorial(int num)
  {
    int factorial = 1;
    for(int i= num; i>=1; i--)
    {
      factorial = factorial*i;
    }
    return factorial;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    FactorialQ3 obj = new FactorialQ3();
    int fact= obj.factorial(num);
    // 5! = 120
    System.out.println(num + "!" + "=" + fact );
  }
}