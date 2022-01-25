// Scored - 4.5 points
import java.util.Scanner;
class BubbleSortAscendingChar
{
  void input(char arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextLine().charAt(0);
    }
  }
  void bubbleSort(char arr[])
  {
    int n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] > arr[j + 1])
        {
          char temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  void display(char arr[])
  {
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    BubbleSortAscendingChar obj = new BubbleSortAscendingChar();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    // OBSERVATION #1
    // You'll need to add an sc.nextLine() to allow
    // entering the first character
    sc.nextLine();
    char arr[] = new char[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    sc.nextLine();
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}