import java.util.Scanner;
class Array27
{
  void input(int arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+ (i+1) + ":" );
      arr[i] = sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  void doubleOddHalfEven(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]%2==0)
      {
        arr[i]=arr[i]/2;
      }
      else
      {
        arr[i]=2*arr[i];
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Array27 obj = new Array27();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);
    System.out.println("Before modifications the array: ");
    obj.display(arr);
    obj.doubleOddHalfEven(arr);
    System.out.println("After modifications the array: ");
    obj.display(arr);
  }
}