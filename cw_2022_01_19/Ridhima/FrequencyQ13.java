import java.util.Scanner;
class FrequencyQ13
{
  static Scanner sc = new Scanner (System.in);
  
  void input(int arr[])
  {
    for (int i = 0; i <= arr.length -1; i++)
    {
      System.out.print ("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int countItems (int arr[], int key)
  {
    int count = 0;
    for (int i = 0; i <= arr.length -1; i++)
    {
      if (key == arr[i])
      {
        count++;
      }
    }
    return count;
  }
  public static void main (String [] args)
  {
    FrequencyQ13 obj = new FrequencyQ13();

    System.out.print ("Enter the size of the element: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    System.out.print ("Enter the element to be counted: ");
    int key = sc.nextInt();
    System.out.println (key + " was found " + obj.countItems(arr, key) + " times");
  } //end of main
} //end of class