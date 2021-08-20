import java.util.Scanner;
class Count
{
  void input(int arr[])
  {
    Scanner sc = new Scanner (System.in);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter the element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  // Tool
  int calcFrequency(int arr[], int key)
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(key==arr[i])
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Count obj = new Count();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("Enter the element to be counted: ");
    int key= sc.nextInt();
    int frequency = obj.calcFrequency(arr,key);
    if(frequency == 0)
    {
      System.out.println("The element was not found.");
    }
    else
    {
      System.out.println("The element was found " + frequency + " times");
    }
  }
}