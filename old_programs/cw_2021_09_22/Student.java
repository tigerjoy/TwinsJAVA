import java.util.Scanner;
class Student
{
  String name;
  String schoolName;
  int maths;
  int computer;

  // Non-parameterized default constructor
  Student()
  {
    name = ""; // Empty String
    schoolName = ""; // Empty String
    maths = 0;
    computer = 0;
  }

  // Parameterized Constructor
  Student(String n, String sN, int m, int c)
  {
    name = n;
    schoolName = sN;
    maths = m;
    computer = c;
  }

  void input()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name: ");
    name = sc.nextLine();
    System.out.print("Enter the school name: ");
    schoolName = sc.nextLine();
    System.out.print("Enter the marks obtained in maths: ");
    maths = sc.nextInt();
    System.out.print("Enter the marks obtained in computer: ");
    computer = sc.nextInt();
  }

  int calculateTotal()
  {
    int total = maths + computer;
    return total;
  }

  double calcPercentage()
  {
    double percentage = calculateTotal() / 2.0;
    return percentage;
  }

  void display()
  {
    System.out.println("Student Name = " + name);
    System.out.println("School Name = " + schoolName);
    System.out.println("Total Marks = " + calculateTotal());
    System.out.println("Percentage = " + calcPercentage());
  }

  public static void main(String args[])
  {
    // 1. During creation of an object of the class,
    // which method is implicitly called?
    // Ans. Constructor
    // 2. Which constructor is called for the below
    // line?
    // Ans. Default Non Parameterized Constructor
    Student obj = new Student();
    obj.input();
    obj.display();
  }
}