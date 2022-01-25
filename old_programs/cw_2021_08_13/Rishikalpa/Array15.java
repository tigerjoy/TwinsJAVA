import java.util.Scanner;
class Array15
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
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    Array15 obj= new Array15();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]=new int [size];
    obj.input(arr);
    int largest= obj.largest(arr);
    System.out.println("The largest element of the array is: " + largest);
  }
}