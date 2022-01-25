import java.util.Scanner;
class  ArrayQ25
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
  void display (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print (arr[i] + ", ");
    }
    System.out.println ();
  }
  void doubleArray (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      arr[i] = arr[i] * 2;
    }
  }
  public static void main (String [] args)
  {
    ArrayQ25 obj = new ArrayQ25();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);

    System.out.println ("Before doubling: ");
    obj.display(arr);
    obj.doubleArray(arr);
    System.out.println ("After doubling: ");
    obj.display(arr);
  }
}