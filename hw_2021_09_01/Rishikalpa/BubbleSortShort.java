import java.util.Scanner;
class BubbleSortShort
{
  void input(short arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(short i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextShort();
    }
  }
  void bubbleSort(short arr[])
  {
    int n = arr.length;
    for(short i = 0; i <= n - 2; i++)
    {
      for(short j = 0; j <= n-i-2; j++)
      {
        if(arr[j] < arr[j + 1])
        {
          short temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  void display(short arr[])
  {
    for(short i = 0; i <= arr.length - 1; i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    BubbleSortShort obj = new BubbleSortShort();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    short arr[] = new short[size];
    obj.input(arr);
    System.out.println("Before sorting the array");
    obj.display(arr);
    obj.bubbleSort(arr);
    System.out.println("After sorting the array");
    obj.display(arr);
  }
}