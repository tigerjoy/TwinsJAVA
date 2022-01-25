import java.util.Scanner;
class Dice
{
  public static void main (String [] args)
  {
    int diceNumber = (int)(Math.random()*(6 - 1 + 1) + 1);
    System.out.println("The Dice number is " + diceNumber);
  }
}