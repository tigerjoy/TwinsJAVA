import java.util.Scanner;
class EvenOdd
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
    int rem = num%2;
    //if (rem==0)
    if(num % 2 == 0)
    {
      System.out.println("The number is Even ");
    }
    else
    {
      System.out.println("The number is Odd ");
    }
  }
}
