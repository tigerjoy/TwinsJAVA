import java.util.Scanner;
class Grades
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the mark: ");
        double mark = sc.nextDouble();
        if (mark>90)
        {
            System.out.println("A ");
        }
        else if (mark>80)
        {
            System.out.println("B ");
        }
        else if (mark>70)
        {
            System.out.println("C ");
        }
        else if (mark>60)
        {
            System.out.println("D ");
        }
        else if (mark>50)
        {
            System.out.println("E ");
        }
        else if (mark<50)
        {
            System.out.println("Fail ");
        }
        else 
        {
            System.out.println("Invalid Grade Number ");
        }
    }
}