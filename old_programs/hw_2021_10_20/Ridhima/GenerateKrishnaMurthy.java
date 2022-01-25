// Scored - 5 points
import java.util.Scanner;
class GenerateKrishnaMurthy
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
    System.out.println ("Enter lb: ");
    int lb = sc.nextInt();
     System.out.println ("Enter ub: ");
    int ub = sc.nextInt();
    GenerateKrishnaMurthy obj = new GenerateKrishnaMurthy();
    System.out.println ("The Krishna Murthy numbers in range are ");
    for(int i = lb; i<= ub; i++)
    {
      if (obj.isKrishnaMurthy(i) == true)
      {
        System.out.print (i + ",");
      }
    }
  }
}