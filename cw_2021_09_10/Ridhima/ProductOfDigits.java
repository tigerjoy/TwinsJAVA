import java.util.Scanner;
class ProductOfDigits
{
  // Tool
  int productOfDigits(int num)
  {
    int product = 1;
    while( num != 0)
    {
      int dig = num % 10;
      product = product * dig;
      num = num / 10;
    }
    return product;
  }
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the number ");
    int num = sc.nextInt();
    ProductOfDigits obj = new ProductOfDigits();
    int product = obj.productOfDigits(num);
    System.out.println ("The product of the digits are " + product);
  }
}