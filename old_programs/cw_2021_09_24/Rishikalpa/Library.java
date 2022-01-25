// Scored - 10 points
import java.util.Scanner;
class Library
{
   String tittle;
   String author;
   int acc_num;

   void input()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the book tittle ");
    tittle = sc.nextLine();
    System.out.println("Enter author ");
    author = sc.nextLine();
    System.out.println("Enter accession number ");
    acc_num = sc.nextInt();
  }
  void compute()
  {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the numbr of days late: ");
      int days = sc.nextInt();
      int fine = days*2;
      System.out.println("Fine = Rs." + fine);
  }
  void display()
  {
     System.out.println("Accession Number \t Tittle \t Author");
     System.out.println(acc_num + "\t\t" + tittle + "\t" + author);
   }
   public static void main(String args[])
   {
     Library obj = new Library();
     obj.input();
     obj.compute();
     obj.display();
   }
}