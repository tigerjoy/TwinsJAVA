import java.util.Scanner;
class Array25
{
  void input(int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  void display (int arr[])
  {
    for(int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  void doubleArray(int arr[])
  {
    for(int i = 0; i <= arr.length - 1; i++)
    {
      arr[i] = 2 * arr[i];
    }
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    Array25 obj = new Array25();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    System.out.println("Before doubling the array ");
    obj.display(arr);
    obj.doubleArray(arr);
    System.out.println("After doubling the array ");
    obj.display(arr);
  }
}