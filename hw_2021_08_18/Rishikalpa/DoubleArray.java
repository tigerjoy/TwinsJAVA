import java.util.Scanner;
class DoubleArray
{
  void input (double arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextDouble();
    }
  }
  void display (double arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  // Tool - V2
  int linearSearch(double arr[], double key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(key==arr[i])
      {
        pos=i;
        break;
      }
    }
    return pos;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    DoubleArray obj = new DoubleArray();
    System.out.print("Enter the size of the array : ");
    int size = sc. nextInt();
    double arr[]= new double[size];
    obj.input(arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.print("Enter the element to be searched ");
    double key = sc.nextDouble();
    int pos = obj.linearSearch(arr, key);
    if(pos==-1)
    {
      System.out.println(key + " was not found");
    }
    else
    {
      System.out.println(key + " was found at postion " + pos );
    }

  }
}