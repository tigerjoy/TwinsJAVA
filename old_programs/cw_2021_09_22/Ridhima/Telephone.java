import java.util.Scanner;
class Telephone
{
  int prv;
  int pre;
  int call;
  String name;
  double amt;
  double total;

  void input()
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the previous reading: ");
    prv = sc.nextInt();
    System.out.println ("Enter the present reading: ");
    pre = sc.nextInt();
    sc.nextLine();
    System.out.println ("Enter the name: ");
    name = sc.nextLine();  
  }
  void cal()
  {
    call = pre - prv;
    if (call >= 0 && call <= 100)
    {
      amt = 0;
    }
    else if (call >= 101 && call <= 200)
    {
      amt = (call - 100) * 0.9;
    }
    else if (call >= 201 && call <= 400)
    {
      amt = (100 * 0.9) + (call - 200) * 0.8;
    }
    else if (call > 400)
    {
      amt = (100 * 0.9) + (200 * 0.8) + (call - 400) * 0.7;
    }
    total = amt + 180;
  }
  void display ()
  {
    System.out.println ("Name\tCalls Made\tAmount\tTotal Amount");
    System.out.println (name + "\t" + call + "\t" + amt + "\t" + total);
  }
  public static void main (String []args)
  {
    Telephone obj = new Telephone();
    obj.input();
    obj.cal();
    obj.display();
  }
}