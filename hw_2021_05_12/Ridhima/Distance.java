import java.util.Scanner;
class Distance
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Speed: ");
        double speed = sc.nextInt();
        System.out.println("Enter the Time: ");
        double time = sc.nextInt();
        double distance = speed*time;
        System.out.println("The Distance is " +distance);
    }
}