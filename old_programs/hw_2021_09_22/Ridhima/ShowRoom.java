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
        name = "";// empty string
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        name = sc.nextLine();
        System.out.print("Enter customer mobile no : ");
        mobno = sc.nextLong();
        System.out.print("Enter cost : ");
        cost = sc.nextDouble();
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
        System.out.println("Customer Name : " + name);
        System.out.println("Mobile Number : " + mobno);
        System.out.println("Amount to be paid after discount : " + amount);
    }
    public static void main(String args[]) 
    {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}