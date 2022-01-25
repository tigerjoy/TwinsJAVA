import java.util.Scanner;
class Array1
{
  void input(int arr[])
  {
    Scanner sc = new Scanner(System.in);
    // Generate valid indexes for arr
    // 0 to arr.length-1

    // Alternatively,
    // for(int i = 0; i<arr.length; i++)
    for(int i = 0; i<=arr.length-1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for(int i = 0; i <= arr.length-1; i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    Array1 obj = new Array1();

    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println("The elements of the array are");
    obj.display(arr);
  }
}