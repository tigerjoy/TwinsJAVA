import java.util.Scanner;
class ArrayQ15
{
  static Scanner sc = new Scanner (System.in);
  void input (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print ("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int largestArray(int arr[])
  {
    int largest = arr[0];
    for (int i = 1; i <= arr.length - 1; i++)
    {
      if (arr[i] > largest)
      {
        largest = arr[i];
      }
    }
    return largest;
  }
  public static void main (String [] args)
  {
    ArrayQ15 obj = new ArrayQ15();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The Largest element of the array is: " + obj.largestArray(arr));
  } //end of main
} //end of class