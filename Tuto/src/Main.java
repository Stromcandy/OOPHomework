import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create an instance of TutoSchool
        TutoSchool school = new TutoSchool();

        // Input tuition center details
        school.inputTuitionCenterDetails();

        // Input the number of teachers
        System.out.print("Please enter the number of Teachers: ");
        int noTeacher = scanner.nextInt();
        scanner.nextLine();

        // Create an instance of Tutor and input teacher details
        Tutor teacher = new Tutor("Iman","921027101270","Shah Alam","6","19/07/2004","4");
        teacher.inputTeachers(noTeacher);

        System.out.println("-----------------------------------------------------------------------");

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        // Create an instance of Student and input student details
        Student student = new Student();
        student.inputStudentDetails(numStudents);

        System.out.println("-----------------------------------------------------------------------");

        // Print performance report of tuition center
        System.out.println("Performance report for tuition center at " + school.getLocation());
        System.out.println("The name of the headmaster is " + school.getHeadMasterName());
        System.out.println("The IC of the headmaster is " + school.getHeadMasterIC());
        System.out.println("Number of tutors: " + noTeacher);
        System.out.println("Number of students: " + numStudents);
    }

}
