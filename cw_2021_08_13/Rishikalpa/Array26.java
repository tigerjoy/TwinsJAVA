import java.util.Scanner;
class Array26
{
  void input(int arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter the element "+ (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Array26 obj = new Array26();
    System.out.print("Enter the size of the array:");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    System.out.println("The first and the last elements are: ");
    System.out.println(arr[0]+","+arr[arr.length-1]);
  }
}