// Scored - 5 points
import java.util.Scanner;
class ArrayEven
{
    void input(int arr[])
    {
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print("Enter element" + (i+1) + ";");
            arr[i]= sc.nextInt();
        }
    }
    int sumArray(int arr[])
    {
        int sum=0;
        for (int i=0;i<=arr.length-1;i++)
        {
            if(arr[i] % 2==0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayEven obj = new ArrayEven();
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        obj.input(arr);
        int sum = obj.sumArray(arr);
        System.out.println("The sum of the elements of the array : "+ sum);
    }
}