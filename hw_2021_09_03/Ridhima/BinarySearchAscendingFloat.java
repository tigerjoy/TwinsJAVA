import java.util.Scanner;
class BinarySearchAscendingFloat
{
  void input (float arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextFloat();
    }
  }
  int binarySearch (float arr[], float key)
  {
    int pos = -1;
    int lb =0;
    int ub = arr.length - 1;
    while (lb <= ub)
    {
      int mid = (lb + ub)/2;
      if (key == arr[mid])
      {
        pos = mid;
        break;
      }
      else if (key < arr[mid])
      {
        ub = mid - 1;
      }
      else
      {
        lb = mid + 1;
      }
    }
    return pos;
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    BinarySearchAscendingFloat obj = new BinarySearchAscendingFloat();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    float arr[] = new float [size];
    obj.input(arr);
    System.out.println ("Enter the elements to be searched ");
    float key = sc.nextFloat();
    int pos = obj.binarySearch(arr,key);
    if ( pos == -1)
    {
      System.out.println(key + " was not found");
    }
    else
    {
      System.out.println (key + " was found");
    }
  }
}