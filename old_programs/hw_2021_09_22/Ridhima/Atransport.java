// Scored - 8 points
import java.util.Scanner;
class Atransport
{
    String name;
    int w;
    int charge;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();
        System.out.print("Enter Parcel Weight : ");
        w = sc.nextInt();
    }
    void calculate()
    {
        if (w <= 10)
        {
            charge = w * 25;
        }
        else if (w <= 30)
        {
            charge = 250 + ((w - 10) * 20);
        }
        else
        {
            charge = 250 + 400 + ((w - 30) * 10);
        }  
        // OBSERVATION #1
        // What is the result of charge * 5 / 100; if charge is
        // 25?  
        charge += charge * 5.0 / 100.0;
    }
    void print() 
    {
        System.out.println("Name\tWeight\tBill amount");
        System.out.println("----\t------\t-----------");
        System.out.println(name + "\t" + w + "\t" + charge);
    }
    public static void main(String args[]) 
    {
        Atransport obj = new Atransport();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
