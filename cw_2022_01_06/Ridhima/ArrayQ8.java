import java.util.Scanner;
class ArrayQ8
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
  int sumArray (int arr[])
  {
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      sum += arr[i];
    }
    return sum;
  }
  public static void main (String [] args)
  {
    ArrayQ8 obj = new ArrayQ8();

    System.out.print ("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);

    System.out.println ("The sum of all elements is: "+ obj.sumArray(arr));
  } //end of main
} //end of class