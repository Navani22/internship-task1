package internship-task1;

import java.util.Scanner;

public class Practice2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = sc.next();
    System.out.println("Hello " + name + " have a nice day.");
    sc.close();
  }
}