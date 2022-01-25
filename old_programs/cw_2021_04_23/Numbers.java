import java.util.Scanner;
class Numbers
{
  public static void main (String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1= sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2= sc.nextInt();
    System.out.println(num1+" complete division "+num2+"="+((double)(num1)/num2));
    System.out.println(num1+"+"+num2+"="+(num1+num2));
    System.out.println(num1+"-"+num2+"="+(num1-num2));
    System.out.println(num1+"*"+num2+"="+(num1*num2));
    System.out.println(num1+" quotient "+num2+"="+(num1/num2));
    System.out.println(num1+"%"+num2+"="+(num1%num2));
  }
}