import java.util.Scanner;
class Time
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Distance: ");
        double distance = sc.nextInt();
        System.out.println("Enter the Speed: ");
        double speed = sc.nextInt();
        double time = distance/speed;
        System.out.println("The Time is is " +time);
    }
}