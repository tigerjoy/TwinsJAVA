import java.util.Scanner;
class LeapYear
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    // Checking if year is centennial
    if(year%100==0)
    {
      System.out.println("Centennial Year");
      // 2000 is a leap year
      // year " is a leap year"
      if(year%400==0)
      {
        System.out.println(year+ " is a leap year");
      }
      // 1900 is not a leap year
      else
      {
        System.out.println(year+ " is not a leap year");
      }
    }
    // Year is not centennial
    else
    {
      System.out.println("not a centennial year");
      if(year%4==0)
      {
        System.out.println(year+ " is a leap year");
      }
      else
      {
        System.out.println(year+ " is not a leap year"); 
      }
    }
  }
}