import java.util.Scanner;
class Days
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the number of days");
     int days = sc.nextInt();
     int years = days/365; //(Quotient)
     days = days%365;      // (Remainder)
     int months = days/30; //(Quotient)
     days = days%30;       // (Remainder)
     System.out.println(years + " years "+ months + " months " + days + " days ");  
  }
}