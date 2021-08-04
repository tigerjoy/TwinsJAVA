import java.util.Scanner;
class CheckCharacter
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the character : ");
    char ch = sc.nextLine().charAt(0);
    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
    {
      System.out.println (ch + " is a Letter ");
    }
    else if ((ch >= '0' && ch <= '9'))
    {
      System.out.println (ch + "is a Digit ");
    }
    else if ((ch >= 'A' && ch <= 'Z'))
    {
      System.out.println (ch + " is a Uppercase letter ");
    }
    else if ((ch >= 'a' && ch <= 'z'))
    {
      System.out.println (ch + " is a Lowercase letter ");
    }
    else
    {
      System.out.println (ch + " is a special character ");
    }
  }
}