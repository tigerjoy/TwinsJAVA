// Scored - 10 points
import java.util.Scanner;
class ParkingLot
{
    int vno;
    int hours;
    double bill;
    
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        vno = sc.nextInt();
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
    }
    
    void calculate() 
    {
        if (hours <= 1)
        {
            bill = 3;
        }
        else
        {
            bill = 3 + (hours - 1) * 1.5;
        }
    }
    
    void display() 
    {
        System.out.println("Vehicle number: " + vno);
        System.out.println("Hours: " + hours);
        System.out.println("Bill: " + bill);
    }
    
    public static void main (String args[]) 
    {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}