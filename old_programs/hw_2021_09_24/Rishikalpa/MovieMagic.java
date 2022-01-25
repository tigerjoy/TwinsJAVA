// Scored - 9 points
import java.util.Scanner;
class MovieMagic
{
    int year;
    String title;
    float rating;
    
    MovieMagic() 
    {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    
    void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title of Movie: ");
        title = sc.nextLine();
        System.out.print("Enter Year of Movie: ");
        year = sc.nextInt();
        System.out.print("Enter Rating of Movie: ");
        rating = sc.nextFloat();
    }
    
    void display() 
    {
        String message = "Invalid Rating";
        if (rating <= 2.0f)
        {
            message = "Flop";
        }
        else if (rating <= 3.4f)
        {
            message = "Semi-Hit";
        }
        else if (rating <= 4.4f)
        {
            message = "Hit";
        }
        else if (rating <= 5.0f)
        {
            message = "Super-Hit";
        }   
            System.out.println(title);
            System.out.println(message);
    }
    
    public static void main (String args[]) 
    {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}