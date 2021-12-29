// Scored - 8 points
import java.util.Scanner;
class Mobike
{
    String name;
    int bno;
    int phno;
    int days;
    int charge;
    
    // OBSERVATION #1
    // Why did you initialize the data
    // members with random values? 
    // The default constructor always 
    // initializes the data members with 
    // the datatypes default values. Ex.
    // 0 for int, 0.0 for double etc.
    Mobike()
    {
        name = "";// empty string
        bno = 0;
        phno = 0;
        days = 0;
        charge = 0;
    }
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();
        System.out.print("Enter Customer Phone Number : ");
        phno = sc.nextInt();
        System.out.print("Enter Bike Number : ");
        bno = sc.nextInt();
        System.out.print("Enter Number of Days the Bike is taken on Rent : ");
        days = sc.nextInt();
    }
    
    void compute() 
    {
        if (days <= 5)
        {
            charge = days * 500;
        }
        else if (days <= 10)
        {
            charge = (5 * 500) + ((days - 5) * 400);
        }
        else
        {
            charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
        }
    }
    void display() 
    {
        System.out.println("Bike No.\tPhone No.\tName\tNo. of days \tCharge");
        System.out.println(bno + "\t" + phno + "\t" + name + "\t" + days + "\t" + charge);
    }
    public static void main (String [] args) 
    {
        Mobike obj = new Mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}