import java.util.Scanner;
class BinarySearchAscending
{
  void input(int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i=0;i<=arr.length-1; i++)
    {
      System.out.print("Enter elemnt " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  // TOOL
  // Searches for key in arr, where
  // arr is sorted in Ascending order
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
        ub=mid-1;
      }
      else
      {
        lb=mid+1;
      }
    }
    return pos;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    BinarySearchAscending obj= new BinarySearchAscending();
    System.out.print("Enter the size of the array ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("Enter the element to be searched: ");
    int key= sc.nextInt();
    int pos= obj.binarySearch(arr, key);
    if(pos==-1)
    {
      System.out.println( key + " was not found ");
    }
    else
    {
      System.out.println( key + " was found ");
    }
  }//end of the main()
}//end of the class