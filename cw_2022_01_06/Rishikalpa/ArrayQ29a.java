import java.util.Scanner;
class ArrayQ29a
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  int productArrayOdd(int arr[])
  {
    int product=1;
    for (int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==1)
      {
        product*=arr[i];
      }
    }
    return product;
  }
  public static void main(String args[])
  {
    ArrayQ29a obj = new ArrayQ29a();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("The product of odd array elements are " + obj.productArrayOdd(arr));
  }//end of main
}//end of class