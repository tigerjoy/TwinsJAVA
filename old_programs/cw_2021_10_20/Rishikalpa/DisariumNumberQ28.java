import java.util.Scanner;
class DisariumNumberQ28
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
  boolean isDisariumNumber(int num)
  {
    int sum=0;
    int temp=num;
    int n= countDigits(num);
    while(num!=0)
    {
      int digit=num%10;
      sum+=(int)(Math.pow(digit,n));
      n--;
      num/=10;
    }
    if(sum==temp)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main (String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int num= sc.nextInt();
    DisariumNumberQ28 obj = new DisariumNumberQ28();
    if(obj.isDisariumNumber(num)==true)
    {
      System.out.println(num+ " is a Disarium number ");
    }
    else
    {
      System.out.println(num+ " is not a Disarium number ");
    }
  }
}