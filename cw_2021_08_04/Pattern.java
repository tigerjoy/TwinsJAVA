// 1
// 12
// 123
// 1234
// 12345
import java.util.Scanner;
class Pattern
{
  void pattern(int n)
  {
    for(int row = 1; row <= n; row++)
    {
      for(int col = 1; col <= row; col++)
      {
        System.out.print(col);
      }
      System.out.println();
    }
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    Pattern obj = new Pattern();
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		obj.pattern(n);
	} // End of main()
} // End of class

