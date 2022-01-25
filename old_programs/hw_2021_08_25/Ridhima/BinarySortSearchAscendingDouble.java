// Scored - 5 points
import java.util.Scanner;
class BinarySortSearchAscendingDouble
{
  void input(double arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i=0;i<=arr.length-1; i++)
    {
      System.out.print("Enter elemnt " + (i+1) + ": ");
      arr[i]= sc.nextDouble();
    }
  }
  void bubbleSort(double arr[])
  {
    double n = arr.length;
    for(int i = 0; i <= n - 2; i++)
    {
      for(int j = 0; j <= n-i-2; j++)
      {
        if(arr[j] > arr[j + 1])
        {
          double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  int binarySearch(double arr[], double key)
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
    BinarySortSearchAscendingDouble obj = new BinarySortSearchAscendingDouble();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    double arr[] = new double[size];
    obj.input(arr);
    System.out.print("Enter the element to be searched: ");
    double key = sc.nextDouble();
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
  } 
}
