import java.util.Scanner;
class LargestSmallest
{
  void input (int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ":" );
      arr[i]= sc.nextInt();
    }
  }
  int largest(int arr[])
  {
    int largest=arr[0];
    for (int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]>largest)
      {
        largest=arr[i];
      }
    }
    return largest;
  }
  int smallest(int arr[])
  {
    int smallest=arr[0];
    for (int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]<smallest)
      {
        smallest=arr[i];
      }
    }
    return smallest;
  }
  void display(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    LargestSmallest obj= new LargestSmallest();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]=new int [size];
    obj.input(arr);
    int largest= obj.largest(arr);
    System.out.println("The largest element of the array is: " + largest);
    int smallest= obj.smallest(arr);
    System.out.println("The smallest element of the array is: " + smallest);
    System.out.println("the difference between largest and smalllest number ");
    obj.display(arr);
  }
}