import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Total number of Subjects:  ");
        int no_of_sub = sc.nextInt();
        if (no_of_sub <= 0) {
            System.out.println("Enter a valid Number of Subject: ");
            no_of_sub = sc.nextInt();
        }

        int total_marks = no_of_sub * 100;
        int marks;
        int obtained_marks = 0;
        float percentage = 0;

        for (int i = 0; i < no_of_sub; i++) {
            System.out.println("Enter The Marks of " + (i + 1) + " Subject out of 100:  ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Enter A Valid Marks:  ");
                i--;
            } else {
                obtained_marks += marks;
            }
        }

        
        percentage = ((float) obtained_marks / total_marks) * 100;

        System.out.println("The Total Marks of Student is  " + obtained_marks + "  and the Percentage is  " + percentage + "  \n");
        System.out.println("The Grade of Student is:   ");

        if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("C");
        } else if (percentage >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
