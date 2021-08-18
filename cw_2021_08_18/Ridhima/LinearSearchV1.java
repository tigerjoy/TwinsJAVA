import java.util.Scanner;
class LinearSearchV1
{
  void input (int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();

    }
  }
  void display (int arr[])
  {
    for (int i = 0;i <= arr.length - 1;i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  int linearSearch(int arr[],int key)
  {
    int pos = -1;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      if (key == arr[i])
      {
        pos = i;
        break;
      }
    }
    return pos;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    LinearSearchV1 obj = new LinearSearchV1();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input (arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.println ("Enter the element to be searched ");
    int key = sc.nextInt();
    int pos = obj.linearSearch(arr,key);
    if (pos == -1)
    {
      System.out.println(key+ " was not found in the array ");
    }
    else
    {
      System.out.println(key + " was found at position " + pos);
    }
  }
}