import java.util.Scanner;
class ArrayQ5
{
  static Scanner sc = new Scanner(System.in);
  
  void input (int arr[])
  {
     for (int i = 0; i <= arr.length - 1; i++)
     {
       System.out.print ("Enter the element " + (i+1) + ": ");
       arr[i] = sc.nextInt();
     }
  }
  void displayG10 (int arr[])
  {
    for (int i = 0; i<= arr.length - 1; i++)
    {
      if (arr[i] > 10)
      {
        System.out.print ((arr[i] * arr[i]) + ", ");
      }
    }
  }
  public static void main (String [] args)
  {
    ArrayQ5 obj = new ArrayQ5();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The elements of the array greater than 10: ");
    obj.displayG10(arr);
  }
}