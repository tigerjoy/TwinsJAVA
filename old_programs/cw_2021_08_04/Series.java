// S = 1 + 2 + 3 + 4 + ... upto n terms
// N = 5, 10, 15
import java.util.Scanner;
class Series
{
  int sumOfSeries(int n)
  {
    int sum = 1;
    for(int i = 2; i <= n; i++)
    {
      sum = sum + i;
    }
    return sum;
  }  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    Series obj = new Series();
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int sum = obj.sumOfSeries(n);
		System.out.println("The sum is " + sum);
	} // End of main()
} // End of class