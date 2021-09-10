import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
		int num = sc.nextInt();
    sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
    
		System.out.println("num: #" + num + "#");
		System.out.println("name: #" + name + "#");
	}
}
