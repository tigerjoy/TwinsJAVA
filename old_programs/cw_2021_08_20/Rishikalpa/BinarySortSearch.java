import java.util.Scanner;
class BinarySortSearch
{
  // Takes input in arr
  void input(int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i=0;i<=arr.length-1; i++)
    {
      System.out.print("Enter elemnt " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  // Sorts arr in descending order
  void bubbleSort(int arr[])
  {
    int n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] < arr[j + 1])
        {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  // Searches for key in arr
  int binarySearch(int arr[], int key)
  {
    int pos=-1;
    int lb=0;
    int ub=arr.length-1;
    while(lb<=ub)
    {
      int mid=(lb+ub)/2;
      if(key==arr[mid])
      {
        pos=mid;
        break;
      }
      else if(key<arr[mid])
      {
        lb=mid+1;
      }
      else
      {
        ub=mid-1;
      }
    }
    return pos;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    BinarySortSearch obj = new BinarySortSearch();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.print("Enter the element to be searched: ");
    int key = sc.nextInt();
    obj.bubbleSort(arr);
    int pos = obj.binarySearch(arr, key);
    if(pos == -1)
    {
      System.out.println(key + " was not found");
    }
    else
    {
      System.out.println(key + " was found");
    }
  } // End of main()
} // End of class