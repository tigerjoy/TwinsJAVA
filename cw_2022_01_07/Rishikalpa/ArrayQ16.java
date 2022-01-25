import java.util.Scanner;
class ArrayQ16
{
  static Scanner sc = new Scanner(System.in);
  void input(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
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
    ArrayQ16 obj =new ArrayQ16();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.println("The smallest number of the array " + obj.smallestArray(arr));
  }//end of main
}//end of class