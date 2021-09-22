// Scored - 3 points
import java.util.Scanner;
class BubbleSortCharDescending
{
  void input(char arr[])
  {
    Scanner sc = new Scanner(System.in);
    // OBSERVATION #0
    // char -> int
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      // OBSERVATION #1
      // Is line 12 correct?
      arr[i] = sc.nextLine().charAt(0);
    }
  }
  // TOOL
  // Sorts arr in ascending order
  void bubbleSort(char arr[])
  {
    int n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        // OBSERVATION #2
        // For sorting in descending order what is
        // the check that is performed?
        if(arr[j] < arr[j + 1])
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
    BubbleSortCharDescending obj = new BubbleSortCharDescending();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    // OBSERVATION #3
    // When you're taking character input after integer 
    // input, you should always write sc.nextLine(), to 
    // get rid of the extra new line character
    sc.nextLine();
    char arr[] = new char[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}