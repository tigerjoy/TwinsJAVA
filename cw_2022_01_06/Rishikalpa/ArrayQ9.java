import java.util.Scanner;
class ArrayQ9
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
  int sumArrayOdd(int arr[])
  {
    int sum=0;
    for (int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==1)
      {
        sum+=arr[i];
      }
    }
    return sum;
  }
  public static void main(String args[])
  {
    ArrayQ9 obj= new ArrayQ9();
    System.out.print("Enter the size of the array: ");
    int size= sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("The  sum of odd numbers are " + obj.sumArrayOdd(arr));
  }
}