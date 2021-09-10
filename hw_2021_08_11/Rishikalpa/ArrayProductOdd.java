// Scored - 5 points
import java.util.Scanner;
class ArrayProductOdd
{
    void input(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("Enter element" + (i+1) + ";");
            arr[i] = sc.nextInt();
        }
    }
    int productArray(int arr[])
    {
        int Product=1;
        for (int i=0;i<=arr.length-1;i++)
        {
            if(arr[i] % 2==1)
            {
                Product=Product*arr[i];
            }
        }
        return Product;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayProductOdd obj = new ArrayProductOdd();
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        obj.input(arr);
        int product = obj.productArray(arr);
        System.out.println("The product of the odd elements of the array : "+ product);
    }
}