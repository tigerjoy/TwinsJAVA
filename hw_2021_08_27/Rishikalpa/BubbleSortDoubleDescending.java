// Scored - 5 points
import java.util.Scanner;
class BubbleSortDoubleDescending
{
  void input(double arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(double i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextDouble();
    }
  }
  // TOOL
  // Sorts arr in ascending order
  void bubbleSort(double arr[])
  {
    int n = arr.length;
    for(double i = 0; i <= n - 2; i++)
    {
      for(double j = 0; j <= n-i-2; j++)
      {
        if(arr[j] < arr[j + 1])
        {
         double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  void display(double arr[])
  {
    for(double i = 0; i <= arr.length - 1; i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    BubbleSortDoubleDescending obj = new BubbleSortDoubleDescending();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    double arr[] = new double[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}