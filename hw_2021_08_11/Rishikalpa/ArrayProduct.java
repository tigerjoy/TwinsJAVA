import java.util.Scanner;
class ArrayProduct
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
    int productArray(int arr[])
    {
        int product=1;
        for (int i=0;i<=arr.length-1;i++)
        {
            if(arr[i] % 2==0)
            {
                product=product*arr[i];
            }
        }
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayProduct obj = new ArrayProduct();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        obj.input(arr);
        int product = obj.productArray(arr);
        System.out.println("The product of the elements n the array : "+ product);
    }
}