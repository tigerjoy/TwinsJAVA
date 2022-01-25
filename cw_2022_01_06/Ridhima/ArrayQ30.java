import java.util.Scanner;
class ArrayQ30
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
  int sumArray (int arr[])
  {
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      sum += arr[i];
    }
    return sum;
  }
  double averageArray (int arr[])
  {
    double avg = (double)(sumArray(arr)) / arr.length;
    return avg;
  }
  public static void main (String [] args)
  {
    ArrayQ30 obj = new ArrayQ30();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The total average of the array elements is: " + obj.averageArray(arr));
  } //end of main
} //end of class