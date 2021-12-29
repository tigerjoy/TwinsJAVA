import java.util.Scanner;
class KrishnaMurthyQ32
{
  int factorial(int num)
  {
    int factorial = 1;
    for (int i = num; i >= 1; i--)
    {
      factorial *= i;
    }
    return factorial;
  }
  boolean isKrishnaMurthy(int num)
  {
    int sum = 0, temp = num;
    while (num != 0)
    {
      int dig = num % 10;
      sum += factorial(dig);
      num /= 10;
    }
    if ( sum == temp)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the number: ");
    int num = sc.nextInt();
    KrishnaMurthyQ32 obj = new KrishnaMurthyQ32();
    if (obj.isKrishnaMurthy(num) == true)
    {
      System.out.println (num + " is a Krishna Murthy number ");
    }
    else
    {
      System.out.println (num + " is not a Krishna Murthy number ");
    }
  }
}