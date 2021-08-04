import java.util.Scanner;
class AverageMarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        double marks=sc.nextDouble();
        // NEW:
        System.out.print("Enter your name:");
        // OLD
        //String Rishikalpa_Ghosh = sc.nextLine();
        // NEW
        String name = sc.nextLine();
        System.out.println("Name: " + name);
        if(marks>=80)
        {
            System.out.println("Grade: Distinction");
        }
        else if((marks>=60)&&(marks<80))
        {
            System.out.println("Grade: First Division");
        }
        else if((marks>=45)&&(marks<45))
        {
            System.out.println("Grade: Second Division");
        }
        else if((marks>=40)&&(marks<80))
        {
            System.out.println("Grade: Pass");
        }
        else if(marks<40)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid grade number");
        }
    }
}
        
        