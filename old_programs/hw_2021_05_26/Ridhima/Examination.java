import java.util.Scanner;
class Examination
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the mark: ");
        double mark = sc.nextDouble();
        // NEW:
        System.out.print("Enter your name:");
        // OLD
        //String Ridhima_Ghosh = sc.nextLine();
        // NEW
        String name = sc.nextLine();
        System.out.println("Name: " + name);
        if (mark>=80)
        {
            System.out.println("Grade: Distinction ");
        }
        else if ((mark>=60) && (mark<80))
        {
            System.out.println("Grade: First Division ");
        }
        else if ((mark>=45) && (mark<60))
        {
            System.out.println("Grade: Second Division ");
        }
        else if ((mark>=40) && (mark<45))
        {
            System.out.println("Grade: Pass ");
        }
        else if (mark<40)
        {
            System.out.println("Fail ");
        }
        else
        {
            System.out.println("Invalid Grade Number ");
        }
    }
}