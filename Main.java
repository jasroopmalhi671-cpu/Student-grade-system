
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Project Title
        System.out.println("==================================");
        System.out.println(" STUDENT GRADE MANAGEMENT SYSTEM ");
        System.out.println("==================================");

        // Student Information
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        // Subject Marks
        System.out.print("Enter English Marks: ");
        int english = input.nextInt();

        System.out.print("Enter Java Marks: ");
        int java = input.nextInt();

        System.out.print("Enter Computer Marks: ");
        int computer = input.nextInt();

        // Calculate Total Marks
        int total = english + java + computer;

        // Calculate Percentage
        double percentage = (total / 300.0) * 100;

        // Calculate Grade
        char grade;

        if (percentage >= 80) {
            grade = 'A';
        }
        else if (percentage >= 70) {
            grade = 'B';
        }
        else if (percentage >= 60) {
            grade = 'C';
        }
        else if (percentage >= 50) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        // Check Pass or Fail
        String status;

        if (english >= 40 && java >= 40 && computer >= 40) {
            status = "PASS";
        }
        else {
            status = "FAIL";
        }

        // Display Student Result
        System.out.println("\n==================================");
        System.out.println("          STUDENT RESULT          ");
        System.out.println("==================================");

        System.out.println("Student Name: " + name);
        System.out.println("English Marks: " + english);
        System.out.println("Java Marks: " + java);
        System.out.println("Computer Marks: " + computer);

        System.out.println("----------------------------------");
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("==================================");

        input.close();
    }
}
