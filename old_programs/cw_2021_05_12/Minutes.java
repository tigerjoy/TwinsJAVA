import java.util.Scanner;
class Minutes
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of minutes: ");
    int minutes = sc.nextInt();
    int days = minutes/1440;
    minutes = minutes%1440;
    int hours = minutes/60;
    minutes = minutes%60;
    System.out.println ( days + " days " + hours + " hours " + minutes + " minutes ");
  }
}