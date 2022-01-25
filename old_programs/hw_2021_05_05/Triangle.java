import java.util.Scanner;
class Triangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perpendicular of right angled triangle: ");
        double perpendicular = sc.nextDouble();
        System.out.println("Enter the base of right angled triangle: ");
        double base = sc.nextDouble();
        double hypotenuse = Math.sqrt((perpendicular*perpendicular)+(base*base));
        double area = (1.0/2.0)*perpendicular*base;
        double perimeter = (base+hypotenuse);
        System.out.println("Hypotenuse of right angled triangle is " +hypotenuse);
        System.out.println("Area of right angled triangle is " +area);
        System.out.println("Perimeter of right angled triangle is " +perimeter);
    }
}
   
        