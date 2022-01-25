import java.util.Scanner;
class AutomorphicNumberQ30
{
  int countDigits(int num)
  {
    int count = 0;
    while(num!=0)
    {
      count++;
      num/=10;
    }
    return count;
  }
  boolean isAutomorphicNumber(int num)
  {
    int square= num*num;
    int index = countDigits(num);
    int lastDigits= square%(int)(Math.pow(10,index));
    if(lastDigits==num)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    AutomorphicNumberQ30 obj = new AutomorphicNumberQ30();
    if(obj.isAutomorphicNumber(num)==true)
    {
      System.out.println(num+ " is a Automorphic number ");
    }
    else
    {
       System.out.println(num+ " is not a  Automorphic number ");
    }
  }
}