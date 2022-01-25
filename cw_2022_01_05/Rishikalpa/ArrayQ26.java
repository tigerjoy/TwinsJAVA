import java.util.Scanner;
class ArrayQ26
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " +(i+1)+ ":");
      arr[i]=sc.nextInt();
    }
  }
  void displayFirstLast(int arr[])
  {
    System.out.println(arr[0]+ ","+ arr[arr.length-1]);
  }
  public static void main(String args[])
  {
    ArrayQ26 obj= new ArrayQ26();
    System.out.print("Enter the size of the array: ");
    int size= sc.nextInt();
    int arr[]= new int [size];
    obj.input(arr);
    System.out.println("Enter the first and last element of the array");
    obj.displayFirstLast(arr);
  }
}