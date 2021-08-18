import java.util.Scanner;
class Array9
{
    void input(int arr[])
    {
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i <= arr.length - 1; i++)
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    int sumOdd(int arr[])
    {
        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++)
        {
            if(arr[i] % 2 == 1)
            {
                sum = sum + arr[i];
            }
        }
          return sum;
    }        
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        Array9 obj = new Array9();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        obj.input(arr);
        int sumOdd = obj.sumOdd(arr);
        System.out.println("The sum of odd elements is " + sumOdd);
    }
}
