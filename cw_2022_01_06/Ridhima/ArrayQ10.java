import java.util.Scanner;
class ArrayQ10
{
  static Scanner sc = new Scanner (System.in);

  void input (int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print ("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int sumArrayOdd (int arr[])
  {
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      if (arr[i] % 2 == 1)
      {
        sum += arr[i];
      }
    }
    return sum;
  }
  int productArrayEven(int arr[])
  {
    int product = 1;
    for (int i = 0; i <= arr.length -1; i++)
    {
      if (arr[i] % 2 == 0)
      {
        product *= arr[i];
      }
    }
    return product;
  }
  public static void main (String [] args)
  {
    ArrayQ10 obj = new ArrayQ10();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The sum of odd numbers is: " + obj.sumArrayOdd(arr));
    System.out.println ("The product of even numbers is: " + obj.productArrayEven(arr));
  } //end of main
} //end of class