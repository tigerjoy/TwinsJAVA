import java.util.Scanner;
class Triangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of a triangle");
        double side1 = sc.nextDouble();
        System.out.println("Enter the second side of a triangle");
        double side2 = sc.nextDouble();
        System.out.println("Enter the third side of a triangle");
        double side3 = sc.nextDouble();
        double triangle = side1 + side2 + side3;
        System.out.println("Perimeter of a Triangle is " +triangle);
    }
}
        