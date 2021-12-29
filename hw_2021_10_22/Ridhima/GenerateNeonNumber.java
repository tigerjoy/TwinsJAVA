import java.util.Scanner;
class GenerateNeonNumber
{
  int sumOfDigits (int num)
  {
    int sum = 0;
    while (num!= 0)
    {
      int dig = num % 10;
      sum = sum + dig;
      num /= 10;
    }
    return sum;
  }
  boolean isNeon (int num)
  {
    int square = num * num;
    int sumDigSq = sumOfDigits(square);
    if (num == sumDigSq)
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
    GenerateNeonNumber obj = new GenerateNeonNumber();
    System.out.println ("The Neon numbers in range are ");
    for(int i = lb; i<= ub; i++)
    {
      if (obj.isNeon(i) == true)
      {
        System.out.print (i + ",");
      }
    }
  }
}