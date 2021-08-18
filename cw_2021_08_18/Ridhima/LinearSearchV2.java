import java.util.Scanner;
class LinearSearchV2
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
  void linearSearch (int arr[],int key)
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
    LinearSearchV2 obj = new LinearSearchV2();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input (arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.println ("Enter the element to be searched ");
    int key = sc.nextInt();
    obj.linearSearch(arr,key);
  }
}