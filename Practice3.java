package internship-task1;
import java.util.Scanner;

class Practice3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name :");
    String studName = sc.next();
    System.out.println("Enter Student Marks for Subject 1 :");
    float studMark1 = sc.nextFloat();
    System.out.println("Enter Student Marks for Subject 2 :");
    float studMark2 = sc.nextFloat();
    System.out.println("Enter Student Marks for Subject 3 :");
    float stuMark3 = sc.nextFloat();
    float totalMarks = studMark1 + studMark2 + stuMark3;
    float cgpa = totalMarks / 30;
    System.out.println("CGPA obtained by " + studName + " is " + cgpa);
    sc.close();

  }
}
