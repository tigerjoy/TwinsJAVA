import java.util.Scanner;
class CompositeQ0
{
  // Tool
  boolean isComposite(int num)
  {
    int factorCount= 0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        factorCount++;
      }
    }
    if(factorCount>2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    CompositeQ0 obj= new CompositeQ0();
    //boolean result= obj.isComposite(num);
    // 4 is a composite number
    // 5 is not a composite number
    if(obj.isComposite(num)==true)
    {
      System.out.println(num + " is a composite number");
    }
    else
    {
      System.out.println(num + " not a composite number");
    }
    
  }
}