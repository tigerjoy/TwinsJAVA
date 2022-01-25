// Scored - 8 points
import java.util.Scanner;
class Student
{
   String name;
   double average;
   int maximum=0;
   int age;
   int mark1;
   int mark2;
   int mark3;
   Student()
   {
       name="";//empty String
       average=0;
       maximum=0;
       age=0;
       mark1=0;
       mark2=0;
       mark3=0;
    }
   void input()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name ");
    name = sc.nextLine();
    System.out.println("Enter average ");
    average = sc.nextDouble();
    System.out.println("Enter subject 1 mark: ");
    mark1 = sc.nextInt();
    System.out.println("Enter subject 2 mark: ");
    mark2 = sc.nextInt();
    System.out.println("Enter subject 3 mark: ");
    mark3 = sc.nextInt();
  }
  // OBSERVATION #1
  // If mark1 = 40, mark2 = 40 and 
  // mark3 = 10, what will be assigned to 
  // maximum?
  // And where did you compute the average
  // marks?
  void compute()
  {
      if(mark1>=mark2 && mark1>=mark3)
      {
          maximum = mark1;
      }
      else if(mark2>=mark1 && mark2>=mark3)
      {
          maximum = mark2;
      }
      else
      {
          maximum = mark3;
      }
  }
  void display()
  {
     System.out.println("Name" + name);
     System.out.println("Age"+ age);
     System.out.println("Subject 1 marks: "+ mark1);
     System.out.println("Subject 2 marks: "+ mark2);
     System.out.println("Subject 3 marks: "+ mark3);
     System.out.println("Maximum Marks" + maximum);
     System.out.println("Average Marks" + average);
   }
   public static void main(String args[])
   {
     Student obj = new Student();
     obj.input();
     obj.compute();
     obj.display();
   }
}