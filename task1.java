import java.util.Scanner;

public class task1{
    

  public static void main(String[] args) {

    System.out.println("Hello world!");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Student Name :");
    String studName=sc.next();
    System.out.println("Enter Student Marks for Subject 1 :");
    int studMark1=sc.nextInt();
    System.out.println("Enter Student Marks for Subject 2 :");
    int studMark2=sc.nextInt();
    System.out.println("Enter Student Marks for Subject 3 :");
    int stuMark3=sc.nextInt();
    System.out.println("Enter Student Marks for Subject 4 :");
    int studMark4=sc.nextInt();
    System.out.println("Enter Student Marks for Subject 5 :");
    int studMark5=sc.nextInt();
    int totalMarks=studMark1+studMark2+stuMark3+studMark4+studMark5;
    int percentage=totalMarks/5;
    System.out.println("Precentage obtained by "+studName+" is "+ percentage+"%");
    sc.close();

  }

  
}