import java.util.Scanner;
class GenerateAutomorphicNumber
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
  boolean isAutomorphic (int num)
  {
    int square = num * num;
    int index = countDigits(num);
    int lastDigits = square % (int)(Math.pow(10,index));
    if (lastDigits == num)
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
    GenerateAutomorphicNumber obj = new GenerateAutomorphicNumber();
    System.out.println ("The Automorphic numbers in range are ");
    for(int i = lb; i<= ub; i++)
    {
      if (obj.isAutomorphic(i) == true)
      {
        System.out.print (i + ",");
      }
    }
  }
}