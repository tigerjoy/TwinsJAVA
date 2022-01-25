import java.util.Scanner;
class Triangle
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first side: ");
    double a = sc.nextDouble();
    System.out.println("Enter the second side: ");
    double b = sc.nextDouble();
    System.out.println("Enter the third side: ");
    double c = sc.nextDouble();
    // If a triangle is possible
    if((a+b>c)&&(b+c>a)&&(c+a>b))
    {
      // Check if it is a eqilateral triangle
      if ((a==b) &&(b==c))
      {
        System.out.println("It is an Equilateral Triangle ");
      }
      // Check if it is a isoceles triangle
      else if ((a==b) || (a==c) || (c==b))
      {
        System.out.println("It is an Isosceles Triangle ");
      }
      else
      {
        System.out.println("It is a Scalene Triangle ");
      }
    }
    // Trinagle is not possible
    else 
    {
      System.out.println("Triangle is not possible ");
    }
  }
}