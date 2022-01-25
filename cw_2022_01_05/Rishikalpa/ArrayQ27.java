import java.util.Scanner;
class ArrayQ27
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i = 0; i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+ ": ");
      arr[i]=sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for (int i =0; i <= arr.length-1; i++)
    {
      System.out.print(arr[i]+ ",");
    }
    System.out.println();
  }
  void operation(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==0)
      {
        arr[i]=arr[i]/2;
      }
      else
      {
        arr[i]=arr[i]*2;
      }
    }
  }
  public static void main(String args[])
  {
    ArrayQ27 obj = new ArrayQ27();
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]= new int [size];
    obj.input(arr);
    System.out.println("Before operation");
    obj.display(arr);
    obj.operation(arr);
    System.out.println("After operation");
    obj.display(arr);
  }
}