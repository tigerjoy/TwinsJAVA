import java.util.Scanner;
class Roots
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter c");
        int c=sc.nextInt();
        int d=(b*b)-(4*a*c);
        if(d>=0)
        {
            System.out.println("Roots are real");
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}