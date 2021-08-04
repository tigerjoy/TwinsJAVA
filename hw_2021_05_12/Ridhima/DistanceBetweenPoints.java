import java.util.Scanner;
class DistanceBetweenPoints
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 point: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 point: ");
        int y2 = sc.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        // Nice, :-)
        System.out.println("Distance between"+"("+x1+","+y1+")"+"("+x2+","+y2+") " + distance);
    }
}