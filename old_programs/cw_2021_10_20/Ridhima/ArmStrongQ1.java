import java.util.Scanner;
class ArmStrongQ1
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
    System.out.println ("Enter the number: ");
    int num = sc.nextInt();
    ArmStrongQ1 obj = new ArmStrongQ1();
    if (obj.isArmStrong(num) == true)
    {
      System.out.println (num + " is a Arm Strong number ");
    }
    else
    {
      System.out.println (num + " is not a Arm Strong number ");
    }
  }
}