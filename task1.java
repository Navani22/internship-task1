import java.util.Scanner;

public class task1{
    

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
        System.out.println("Enter Student Marks for Subject 4 :");
        float studMark4 = sc.nextFloat();
        System.out.println("Enter Student Marks for Subject 5 :");
        float studMark5 = sc.nextFloat();
        float totalMarks = studMark1 + studMark2 + stuMark3 + studMark4 + studMark5;
        float percentage = totalMarks / 5;
        System.out.println("Precentage obtained by " + studName + " is " + percentage + "%");
        sc.close();
    
      }
    
    }

  

  
