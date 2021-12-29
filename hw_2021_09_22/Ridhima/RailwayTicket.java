// Scored - 8 points
import java.util.Scanner;
class RailwayTicket
{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter coach : ");
        coach = sc.nextLine();
        System.out.print("Enter mobile no : ");
        mobno = sc.nextLong();
        System.out.print("Enter amount : ");
        amt = sc.nextInt();
    }
    // OBSERVATION #1
    // Why did you write "First AC" as "First_AC"?
    // Was it mentioned in the question?
    void update() 
    {
        if(coach.equalsIgnoreCase("First AC"))
        {
            totalamt = amt + 700;
        }
        else if(coach.equalsIgnoreCase("Second AC"))
        {
            totalamt = amt + 500;
        }
        else if(coach.equalsIgnoreCase("Third AC"))
        {
            totalamt = amt + 250;
        }
        else if(coach.equalsIgnoreCase("Sleeper"))
        {
            totalamt = amt;
        }
    }
    void display() 
    {
        System.out.println("Name : " + name);
        System.out.println("Coach : " + coach);
        System.out.println("Total Amount : " + totalamt);
        System.out.println("Mobile Number : " + mobno);
    }
    public static void main(String args[]) 
    {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}