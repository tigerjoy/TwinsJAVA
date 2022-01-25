import java.util.Scanner;
class ArrayQ3
{
  static Scanner sc = new Scanner (System.in);
  
  void input (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print ("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  void displayExcept79 (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      if (arr[i] != 7 && arr[i] != 9)
      {
        System.out.print (arr[i] + ", ");
      }
    }
  }
  public static void main (String [] args)
  {
    ArrayQ3 obj = new ArrayQ3();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The elements of the array except 7 and 9 are: ");
    obj.displayExcept79(arr);
  }
}