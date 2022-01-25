import java.util.Scanner;
class LinearSearchV1
{
  static Scanner sc = new Scanner (System.in);
  void input(int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print ("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print (arr[i] + ",");
    }
    System.out.println();
  }
  int linearSearch (int arr[], int key)
  {
    int pos = -1;
    for(int i = 0; i <= arr.length -1; i++)
    {
      if (key == arr[i])
      {
        pos = i;
        break;
      }
    }
    return pos;
  }
  public static void main (String [] args)
  {
    LinearSearchV1 obj = new LinearSearchV1();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println ("Enter the element to be searched: ");
    int key = sc.nextInt();
    int pos = obj.linearSearch(arr, key);
    System.out.println ("The elements of the array: ");
    obj.display(arr);
    if(pos == -1)
    {
      System.out.print ("The element was not found ");
    }
    // 11 was found at postion 4.
    // key                     pos
    else
    {
      System.out.println (key + " found at position " + pos);
    }
  } //end of main
} //end of class