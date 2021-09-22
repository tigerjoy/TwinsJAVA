// Scored - 5 points
import java.util.Scanner;
class LinearSearchV2Long
{
  void input (long arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextLong();

    }
  }
  void display (long arr[])
  {
    for (int i = 0;i <= arr.length - 1;i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  void linearSearch (long arr[],long key)
  {
    int pos = -1;
    for (int i = 0; i<= arr.length - 1; i++)
    {
      if (key == arr[i])
      {
        pos = i;
        System.out.println (key + " was found at position " + pos);
      }
    }
    if (pos == -1)
    {
      System.out.println (key + " is not present");
    }
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    LinearSearchV2Long obj = new LinearSearchV2Long();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    long arr[] = new long [size];
    obj.input (arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.println ("Enter the element to be searched ");
    long key = sc.nextLong();
    obj.linearSearch(arr,key);
  }
}