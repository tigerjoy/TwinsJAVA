import java.util.Scanner;
class Rectangle
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the length: "); 
    double length= sc.nextDouble();
    System.out.print("Enter the breadth: "); 
    double breadth= sc.nextDouble();

    double area= length*breadth;
    double perimeter= 2*(length+breadth);
    double diagonal= Math.sqrt(length*length+ breadth*breadth);

    System.out.println("The area is " +area);
    System.out.println("The perimeter is "+perimeter);
    System.out.println("The diagonal is "+diagonal);
  }
}