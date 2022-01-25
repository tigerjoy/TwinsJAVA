import java.util.Scanner;
class ArrayQ17
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i =0; i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  int largestArray(int arr[])
    {
      int largest=arr[0];
      for (int i=1;i<=arr.length-1;i++)
      {
        if(arr[i]>largest)
        {
          largest=arr[i];
        }
      }
      return largest;
    }
    int smallestArray(int arr[])
  {
    int smallest= arr[0];
    for (int i=1;i<=arr.length-1;i++)
    {
      if(arr[i]<smallest)
      {
        smallest=arr[i];
      }
    }
    return smallest;
  }
  public static void main(String args[])
  {
    ArrayQ17 obj = new ArrayQ17();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int [size];
    obj.input(arr);
    int small = obj.smallestArray(arr);
    int large = obj.largestArray(arr);
    int diff = large-small;
    System.out.println("The difference is " + diff);
  }//end of main
}//end of class