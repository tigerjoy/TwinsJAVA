import java.util.Scanner;
class Speed
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Distance: ");
        double distance = sc.nextInt();
        System.out.println("Enter the Time: ");
        double time = sc.nextInt();
        double speed = distance/time;
        System.out.println("The Speed is " +speed);
    }
}