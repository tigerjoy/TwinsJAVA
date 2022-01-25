import java.util.Scanner;
class SalaryCalculation
{
  String name;
  double basicPay;
  double specialAlw;
  double conveyanceAlw;
  double gross;
  double pf;
  double netSalary;
  double AnnualSal;

  SalaryCalculation()
  {
    name = ""; // empty String 
    basicPay = 10000.0;
    conveyanceAlw = 1000.0;
  } 
  // PF = 8.33% of basic pay
  void SalaryCal()
  {
    specialAlw = (25.0 / 100.0) * basicPay;
    gross = basicPay + specialAlw + conveyanceAlw;
    pf = (8.33/100.0) * basicPay;
    netSalary = gross - pf;
    AnnualSal = 12 * netSalary;
  }
  // Name: 
  // Basic Pay: Rs. 
  void display()
  {
    System.out.println ("Name : " + name);
    System.out.println ("Basic Pay : Rs. " + basicPay);
    System.out.println ("Special Allowance : Rs. " + specialAlw);
    System.out.println ("Conveyance Allowance : Rs. " + conveyanceAlw);
    System.out.println ("Gross Pay: Rs. " + gross);
    System.out.println ("Provident Fund : Rs. " + pf);
    System.out.println ("Net Salary : Rs. " + netSalary);
    System.out.println ("Annual Salary : Rs. " + AnnualSal);
  }
  public static void main (String [] args)
  {
    SalaryCalculation obj = new SalaryCalculation();
    obj.SalaryCal();
    obj.display();
  }
}
