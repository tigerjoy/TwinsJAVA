import java.util.Scanner;
class Interest
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print ("Enter the principal: ");
    int principal= sc.nextInt();
    System.out.print ("Enter the rate: ");
    double rate= sc.nextDouble();
    System.out.print ("Enter the time: ");
    double time= sc.nextDouble();

    double si= (principal*rate*time)/100.0;
    double amount= principal*Math.pow(1.0+rate/100.0,time);
    double ci= amount-principal;

    System.out.println("The Simple Interest is "+ si);
    System.out.println("The Compound Interest is "+ ci);
    System.out.println("The Difference is "+ (si-ci));
  }
}