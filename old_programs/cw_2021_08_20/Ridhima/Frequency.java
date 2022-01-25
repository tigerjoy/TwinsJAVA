import java.util.Scanner;
class Frequency
{
  void input (int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int calcFrequency(int arr[], int key)
  {
    int count = 0;
    for(int i = 0; i<= arr.length - 1; i++)
    {
      if (key == arr[i])
      {
        count ++;
      }
    }
    return count;
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    Frequency obj = new Frequency();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    System.out.print("Enter the element to be searched: ");
    int key = sc.nextInt();
    int count = obj.calcFrequency(arr,key);
    if (count == 0)
    {
      System.out.println ("The element was not found ");
    }
    else
    {
      // The element was found 2 times
      System.out.println("The element was found " + count + " times");
    }
  }
}