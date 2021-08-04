import java.util.Scanner;
class Circle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        double circle = (22.0*2.0*radius)/7.0;
        System.out.println("Perimeter of a circle is " +circle);
    }
}