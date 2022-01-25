import java.util.Scanner;
class SumOfArrays
{
  static Scanner sc = new Scanner (System.in);
  void input(int arr[])
  {
    for (int i = 0; i <= arr.length -1; i++)
    {
      System.out.print ("Enter element " + (i+1) +": ");
      arr[i] = sc.nextInt();
    }
  }
  void display(int arr[])
  {
    for (int i = 0; i <= arr.length - 1; i++)
    {
      System.out.print (arr[i] + ", ");
    }
    System.out.println();
  }
  int[] sumArrays (int arr1[], int arr2[])
  {
    int sum[] = new int [arr1.length];
    for (int i = 0; i <= sum.length - 1; i++)
    {
      sum[i] = arr1[i] + arr2[i];
    }
    return sum;
  }
  public static void main (String [] args)
  {
    SumOfArrays obj = new SumOfArrays();

    System.out.print ("Enter the size of the first array: ");
    int size1 = sc.nextInt();
    int arr1[] = new int [size1];
    System.out.println ("Enter elements for the first array: ");
    obj.input(arr1);

    System.out.print ("Enter the size of the second array: ");
    int size2 = sc.nextInt();
    int arr2[] = new int [size2];
    System.out.println ("Enter elements for the second array: ");
    obj.input(arr2);
    if (arr1.length == arr2.length)
    {
      int sum[] = obj.sumArrays(arr1, arr2);
      System.out.println ("The elements of array1 are: ");
      obj.display(arr1);
      System.out.println ("The elements of array2 are: ");
      obj.display(arr2);
      System.out.println ("The summation of array are: ");
      obj.display(sum);
    }
    else
    {
      System.out.println ("The arrays are not comfortable for addition ");
    }
  } //end of main
} //end of class 