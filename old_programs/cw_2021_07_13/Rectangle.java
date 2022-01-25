import java.util.Scanner;
class Rectangle
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    // Display the menu
    System.out.println("Press 1 to calculate Area ");
    System.out.println("Press 2 to calculate Perimeter ");
    System.out.println("Press 3 to calculate Diagonal ");
    System.out.println("Press 4 to Quit ");
    System.out.println("Enter your choice (1 - 4) ");
    int choice = sc.nextInt();
    System.out.println ("Enter the Length: ");
    double length = sc.nextDouble();
    System.out.println ("Enter the Breadth: ");
    double breadth = sc.nextDouble();
    switch (choice)
    {
      case 1:
      {
        double area = length * breadth;
        System.out.println ("The Area is " + area);
        break;
      }
      case 2:
      {
        double perimeter = (2*(length+breadth));
        System.out.println ("The Perimeter is " + perimeter);
        break;
      }
      case 3:
      {
        double diagonal = Math.sqrt ( (length*length) + (breadth*breadth));
        System.out.println ("The Diagonal is " + diagonal );
        break;
      }
      case 4:
      {
        System.out.println ("Quitting ");
        break;
      }
      default:
      {
        System.out.println ("Wrong Choice");
      }
    }
  }
}