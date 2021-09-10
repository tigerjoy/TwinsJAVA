// Scored - 5 points
import java.util.Scanner;
class BubbleSortAscendingDouble
{
  void input(double arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextDouble();
    }
  }
  void bubbleSort(double arr[])
  {
    double n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] > arr[j + 1])
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
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    BubbleSortAscendingDouble obj = new BubbleSortAscendingDouble();
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