import java.util.Scanner;
class DisariumQ28
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
  boolean isDisarium(int num)
  {
    int sum = 0, temp = num;
    int n = countDigits(num);
    while (num != 0)
    {
      int dig = num % 10;
      sum += (int)(Math.pow(dig,n));
      n--;
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
    DisariumQ28 obj = new DisariumQ28();
    if (obj.isDisarium(num) == true)
    {
      System.out.println (num + " is a Disarium number ");
    }
    else
    {
      System.out.println (num + " is not a Disarium number ");
    }
  }
}