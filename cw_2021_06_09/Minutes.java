import java.util.Scanner;
class Minutes
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    // named constant 
    final int MINUTES_IN_A_DAY = 24 * 60;
    final int MINUTES_IN_AN_HOUR = 60;
    System.out.println("Enter the number of minutes: ");
    int minutes = sc.nextInt();
    //int days = minutes/1440;
    int days = minutes/MINUTES_IN_A_DAY; 
    minutes = minutes%MINUTES_IN_A_DAY;
    int hours = minutes/MINUTES_IN_AN_HOUR;
    minutes = minutes%MINUTES_IN_AN_HOUR;
    System.out.println ( days + " days " + hours + " hours " + minutes + " minutes ");
  }
}