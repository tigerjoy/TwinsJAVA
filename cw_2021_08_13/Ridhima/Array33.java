import java.util.Scanner;
class Array33
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
  int countEven (int arr[])
  {
    int count = 0;
    for(int i = 0; i <= arr.length - 1; i++)
    {
      if(arr[i] % 2 == 0)
      {
        count ++;
      }
    }
    return count;
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    Array33 obj = new Array33();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    int count = obj.countEven(arr);
    System.out.println("Total even numbers of the array are " + count);
  }
}