import java.util.Scanner;  // Import Scanner class for user input

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();       // Read number of students
        scanner.nextLine();                        // Consume leftover newline

        String[] names = new String[numStudents];  // Array for student names
        double[] scores = new double[numStudents]; // Array for scores
        char[] grades = new char[numStudents];     // Array for letter grades

        // Input loop for student names and scores
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();  // Read student name

            System.out.print("Enter score (0-100) for " + names[i] + ": ");
            scores[i] = scanner.nextDouble();  // Read numeric score
            scanner.nextLine();               // Clear newline for next input

            grades[i] = getLetterGrade(scores[i]);  // Convert to letter grade
        }

        // Print the student report
        System.out.println("\nSTUDENT REPORT");
        System.out.println("------------------------");

        double total = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + " - Score: " + scores[i] + " - Grade: " + grades[i]);
            total += scores[i];
        }

        double average = total / numStudents;
        System.out.printf("\nClass Average: %.2f\n", average);
    }

    // Method to convert numeric score to a letter grade
    public static char getLetterGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}
