import java.util.Scanner;
class Array14
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
  int sumArray (int arr[])
  {
    int sum = 0;
    for(int i = 0; i <= arr.length - 1; i++)
    {
      sum = sum + arr[i];
    }
    return sum;
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    Array14 obj = new Array14();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    int total = obj.sumArray(arr);
    double average = (double)(total)/arr.length;
    System.out.println("The average of elements in an array " + average);
  }
}