import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Student {
    Scanner scanner = new Scanner(System.in);

    public void inputStudentDetails(int numStudents) {
        for (int i = 0; i < numStudents; i++) {
            // Get student information
            System.out.println("Enter the name of the student:");
            String name = scanner.nextLine();
            System.out.println("Enter the IC of the student:");
            String ic = scanner.nextLine();
            System.out.println("Enter the address of the student:");
            String address = scanner.nextLine();
            System.out.println("Enter the year of the student:");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the school name of the student:");
            String schoolName = scanner.nextLine();

            // Get test scores
            System.out.println("Enter the number of tests for the student:");
            int numTests = scanner.nextInt();
            scanner.nextLine();
            ArrayList<Double> scoreList = new ArrayList<>();
            for (int j = 0; j < numTests; j++) {
                System.out.println("Enter score for test " + (j + 1) + ":");
                double score = scanner.nextDouble();
                scanner.nextLine();
                scoreList.add(score);
            }

            // Calculate average, minimum, and maximum scores
            double averageScore = calculateAverage(scoreList);
            double minimumScore = Collections.min(scoreList);
            double maximumScore = Collections.max(scoreList);

            // Print results
            System.out.println("Results for " + name + ":");
            System.out.println("Average score: " + averageScore);
            System.out.println("Minimum score: " + minimumScore);
            System.out.println("Maximum score: " + maximumScore);
        }
    }

    public double calculateAverage(ArrayList<Double> scoreList) {
        double sum = 0;
        for (double score : scoreList) {
            sum += score;
        }
        return sum / scoreList.size();
    }
}
