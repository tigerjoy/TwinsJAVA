// Scored - 5 points
import java.util.Scanner;
class BubbleSortAscendingFloat
{
  void input(float arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextFloat();
    }
  }
  void bubbleSort(float arr[])
  {
    float n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] > arr[j + 1])
        {
          float temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  void display(float arr[])
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
    BubbleSortAscendingFloat obj = new BubbleSortAscendingFloat();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    float arr[] = new float[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}