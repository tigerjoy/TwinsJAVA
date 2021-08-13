import java.util.Scanner;
class Array16
{
  void input (int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int smallest (int arr[])
  {
    int smallest = arr[0];
    for(int i = 0; i<= arr.length - 1; i++)
    {
      if(arr[i]<smallest)
      {
        smallest = arr[i];
      }
    }
    return smallest;
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    Array16 obj = new Array16();
    System.out.print("Enter the size of the array ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    int smallest = obj.smallest(arr);
    System.out.println("The smallest element of the array is " + smallest);
  }
}