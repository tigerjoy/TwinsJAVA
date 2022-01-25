import java.util.Scanner;
class Employee
{
    // Variable - camelCase
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary");
        int basic = sc.nextInt();
        double dearnessAllowance = basic*(25.0/100.0);
        double houseRentAllowance = basic*(15.0/100.0);
        double providentFund = basic*(8.33/100.0);
        double netPay = dearnessAllowance + houseRentAllowance + basic;
        double gross = netPay - providentFund;
        System.out.println("The Net pay is " +netPay);
        System.out.println("The Gross is " +gross);
    }
}