import java.util.Scanner;
class ArrayQ29b
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
  int productArrayEven(int arr[])
  {
    int product = 1;
    for (int i = 0; i <= arr.length -1; i++)
    {
      if (arr[i] % 2 == 0)
      {
        product *= arr[i];
      }
    }
    return product;
  }
  public static void main (String [] args)
  {
    ArrayQ29b obj = new ArrayQ29b();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("THe product of even array elements is: " + obj.productArrayEven(arr));
  } //end of main
} //end of class