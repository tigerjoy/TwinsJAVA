import java.util.Scanner;
class Vote
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the age of the user");
    int age= sc.nextInt();
    if(age>=18)
    {
      System.out.println("You're eligible to vote");
    }
    else
    {
      int x= 18-age;
      System.out.println("Come back after " + x+ " years");
    }
  }
}