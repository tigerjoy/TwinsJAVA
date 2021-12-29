// Scored - 10 points
import java.util.Scanner; 
class Library
{
    String title;
    String author;
    int acc_num;
    
    Library()
    {
        title = "";// empty string
        author = "";//empty string
        acc_num = 12;
    }
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the book : ");
        title = sc.nextLine();
        System.out.print("Enter the author of the book : ");
        author = sc.nextLine();
        System.out.print("Enter accession number : ");
        acc_num = sc.nextInt();
    }
    
    void compute() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late : ");
        int days = sc.nextInt();
        int fine = days * 2;
        System.out.println("Fine = Rs." + fine);
    }
    
    void display() 
    {
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num + "\t\t" + title + "\t" + author);
    }
    public static void main (String [] args) 
    {
        Library obj = new Library();
        obj.input();
        obj.display();
        obj.compute();
    }
}