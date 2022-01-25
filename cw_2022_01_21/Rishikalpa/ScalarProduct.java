import java.util.Scanner;
class ScalarProduct
{
  static Scanner sc =new Scanner(System.in);
  void input(int arr[])
  {
    for (int i = 0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i]= sc.nextInt();
    }
  }
  void display (int arr[])
  {
    for (int i =0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  int[] scalarMultiplication(int arr[], int scalar)
  {
    int product[]= new int[arr.length];
    for(int i = 0;i<=arr.length-1;i++)
    {
      product[i]= scalar*arr[i];
    }
    return product;
  }
  public static void main(String args[])
  {
    ScalarProduct obj = new ScalarProduct();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    obj.input(arr);
    System.out.print("Enter the value for scalar ");
    int scalar= sc.nextInt();
    int product[]= obj.scalarMultiplication(arr,scalar);
    System.out.println("The content of the array are: ");
    obj.display(arr);
    System.out.println("The result of scalar multiplication is ");
    obj.display(product);
  }//end of main
}//end of class 