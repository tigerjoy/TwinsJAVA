import java.util.Scanner;
class LinearSearchCharV1
{
  void input (char arr[])
  {
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i<= arr.length - 1; i++)
    {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = sc.nextLine().charAt(0);

    }
  }
  void display (char arr[])
  {
    for (int i = 0;i <= arr.length - 1;i++)
    {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
  int linearSearch(char arr[],char key)
  {
    int pos = -1;
    for (int i = 0; i <= arr.length - 1; i++)
    {
      if (key == arr[i])
      {
        pos = i;
        break;
      }
    }
    return pos;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    LinearSearchCharV1 obj = new LinearSearchCharV1();
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    char arr[] = new char [size];
    obj.input (arr);
    System.out.println("The elements of the array are ");
    obj.display(arr);
    sc.nextLine();
    System.out.println ("Enter the element to be searched ");
    char key = sc.nextLine().charAt(0);
    int pos = obj.linearSearch(arr,key);
    if (pos == -1)
    {
      System.out.println(key+ " was not found in the array ");
    }
    else
    {
      System.out.println(key + " was found at position " + pos);
    }
  }
}