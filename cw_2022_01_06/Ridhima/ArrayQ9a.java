import java.util.Scanner;
class ArrayQ9a
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
  int sumArrayEven (int arr[])
  {
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      if (arr[i] % 2 == 0)
      {
        sum += arr[i];
      }
    }
    return sum;
  }
  public static void main (String [] args)
  {
    ArrayQ9a obj = new ArrayQ9a();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The sum of even array elements is: " + obj.sumArrayEven(arr));
  }
}