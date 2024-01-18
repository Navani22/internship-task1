package internship-task1;

import java.util.Scanner;

class Practice4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value in (km) to be converted to miles");
    float km = sc.nextFloat();
    double conv = km * 0.62137;
    System.out.println(conv + " miles");
  }
}

