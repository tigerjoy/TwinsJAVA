// Scored - 10 points
import java.util.Scanner;
class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    ShowRoom()
    {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    void input() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = in.nextLine();
        System.out.print("Enter customer mobile no: ");
        mobno = in.nextLong();
        System.out.print("Enter cost: ");
        cost = in.nextDouble();
    }
    
    void calculate() 
    {
        int disPercent = 0;
        if (cost <= 10000)
        {
            disPercent = 5;
        }
        else if (cost <= 20000)
        {
            disPercent = 10;
        }
        else if (cost <= 35000)
        {
            disPercent = 15;
        }
        else
        {
            disPercent = 20;
        }
        
        dis = cost * disPercent / 100.0;
        amount = cost - dis;
    }
    
    void display() 
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amout after discount: " + amount);
    }
    public static void main(String args[]) 
    {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}