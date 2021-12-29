// Scored - 5 points
import java.util.Scanner;
class GenerateArmStrongQ2
{
  int countDigits(int num)
  {
    int count = 0;
    while (num != 0)
    {
      count ++;
      num /= 10;
    }
    return count;
  }
  boolean isArmStrong(int num)
  {
    int sum = 0, temp = num;
    int n = countDigits(num);
    while (num != 0)
    {
      int dig = num % 10;
      sum += (int)(Math.pow(dig,n));
      num /= 10;
    }
    if (sum == temp)
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
    GenerateArmStrongQ2 obj = new GenerateArmStrongQ2();
    System.out.println ("The Arm Strong numbers in range are ");
    for(int i = lb; i<= ub; i++)
    {
      if (obj.isArmStrong(i) == true)
      {
        System.out.print (i + ",");
      }
    }
  }
}