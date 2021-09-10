import java.util.Scanner;
class ProductOfDigitsQ9a
{
  int productOfDigit(int num)
  {
    int product=1;
    while(num!=0)
    {
      int digit = num%10;
      product= product*digit;
      num =num/10;
    }
    return product;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    ProductOfDigitsQ9a obj = new ProductOfDigitsQ9a();
    //int sum=obj.sumOfDigit(num);
    System.out.println("The product of all digits is " + obj.productOfDigit(num));
  }
}