import java.util.Scanner;
class BubbleSortLong
{
  void input(long arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextLong();
    }
  }
  void bubbleSort(long arr[])
  {
    int n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] < arr[j + 1])
        {
          long temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  void display(long arr[])
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
    BubbleSortLong obj = new BubbleSortLong();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    long arr[] = new long[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}