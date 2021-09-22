// Scored - 5 points
import java.util.Scanner;
class LinearSearchV2Short
{
  void input (short arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (short i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextShort();

    }
  }
  void display (short arr[])
  {
    for (short i = 0;i <= arr.length - 1;i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  void linearSearch (short arr[],short key)
  {
    int pos = -1;
    for (short i = 0; i<= arr.length - 1; i++)
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
    LinearSearchV2Short obj = new LinearSearchV2Short();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    short arr[] = new short [size];
    obj.input (arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.println ("Enter the element to be searched ");
    short key = sc.nextShort();
    obj.linearSearch(arr,key);
  }
}