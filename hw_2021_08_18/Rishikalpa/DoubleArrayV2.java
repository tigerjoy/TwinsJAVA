import java.util.Scanner;
class DoubleArrayV2
{
  void input(double arr[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextDouble();
    }
  }
  void display(double arr[])
  {
    for (int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
  }
  // Tool - V2
  void linearSearch(double arr[],double key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if (key==arr[i])
      {
        pos=i;
        System.out.println(key + " was found at position " + pos);
      }
    }
    if(pos==-1)
    {
      System.out.println(key + "is not present");
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    DoubleArrayV2 obj = new DoubleArrayV2();
    System.out.print("Enter the size of the array : ");
    int size = sc. nextInt();
    double arr[]= new double[size];
    obj.input(arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    System.out.print("Enter the element to be searched ");
    double key = sc.nextDouble();
    obj.linearSearch(arr,key);
    
  }
}