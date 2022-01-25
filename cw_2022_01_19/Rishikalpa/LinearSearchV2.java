import java.util.Scanner;
class LinearSearchV2
{
  static Scanner sc  = new Scanner(System.in);
  void input(int arr[])
  {
    for (int i =0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  void linearSearch(int arr[], int key)
  {
    int pos=-1;
    for (int i =0;i<=arr.length-1;i++)
    {
      if(key==arr[i])
      {
        pos=i;
        System.out.println(key + " was found at position " + pos);
      }
    }
    if(pos==-1)
    {
      System.out.println(key+ " is not present ");
    }
  }
  public static void main(String args[])
  {
    LinearSearchV2 obj = new LinearSearchV2();
    System.out.print("Enter the size of the array ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("Enter the element to be searched: ");
    int key = sc.nextInt();
    obj.linearSearch(arr,key);
  }//end of main
}//end of class