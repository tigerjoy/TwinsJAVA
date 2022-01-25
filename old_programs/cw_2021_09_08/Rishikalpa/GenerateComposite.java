import java.util.Scanner;
class GenerateComposite
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
    System.out.println("Enter the lower bound");
    int lb = sc.nextInt();
    System.out.println("Enter the upper bound");
    int ub = sc.nextInt();
    GenerateComposite obj= new GenerateComposite();
    System.out.println("The composite numbers are");
    for(int i=lb; i<=ub;i++)
    {
      if (obj.isComposite(i)==true)
      {
        System.out.print(i + ",");
      }
    }
    
    
  }
}