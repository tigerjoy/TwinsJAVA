import java.util.Scanner;
class Marks
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks of physics: ");
    int physics = sc.nextInt();
    System.out.print("Enter the marks of chemistry: ");
    int chemistry = sc.nextInt();
    System.out.print("Enter the marks of biology: ");
    int biology = sc.nextInt();

    int total = physics + chemistry + biology;
    double average = total/3.0;

    System.out.println("Total marks "+ total);
    System.out.println("Average marks "+ average);
  }
}