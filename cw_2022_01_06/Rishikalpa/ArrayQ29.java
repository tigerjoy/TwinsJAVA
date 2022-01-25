import java.util.Scanner;
class ArrayQ29
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print("enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  int productArray(int arr[])
  {
    int product=1;
    for (int i=0;i<=arr.length-1;i++)
    {
      product*=arr[i];
    }
    return product;
  }
  public static void main(String args[])
  {
    ArrayQ29 obj = new ArrayQ29();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("The product of array elements are " + obj.productArray(arr) );
  }
}