// Scored - 3 points
import java.util.Scanner;
class OddArray
{
  void input(int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextInt();
    }
  }
  int countOdd (int arr[])
  {
    // OBSERVATION #1
    // Will this method correctly count the
    // total number of odd numbers within the
    // array?
    int count = 1;
    for(int i = 0; i <= arr.length - 1; i++)
    {
      if(arr[i] % 2 == 1)
      {
        count ++;
      }
    }
    return count;
  }
  public static void main (String []args)
  {
    Scanner sc = new Scanner (System.in);
    OddArray obj = new OddArray();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int [size];
    obj.input(arr);
    int count = obj.countOdd(arr);
    System.out.println("The odd numbers of the array are " + count);
  }
}
