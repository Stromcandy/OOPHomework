import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tutor {
    private String name,id,add,Exp,dateJoined,yearsInCenter;

    public Tutor(String name, String id, String add, String Exp, String dateJoined, String yearsInCenter) {
        this.name = name;
        this.id = id;
        this.add = add;
        this.Exp = Exp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    public static List<Tutor> inputTeachers(int numTeachers) {
        Scanner scanner = new Scanner(System.in);
        List<Tutor> teachers = new ArrayList<>();
        for (int i = 1; i <= numTeachers; i++) {
            System.out.println("Please enter the details for teacher " + i);

            System.out.println("Please enter the name of the teacher:");
            String name = scanner.nextLine();

            System.out.println("Please enter the ID of the teacher:");
            String id = scanner.nextLine();

            System.out.println("Please enter the address of the teacher:");
            String address = scanner.nextLine();

            System.out.println("Please enter the years of experience of the teacher:");
            String yearsOfExperience = scanner.nextLine();

            System.out.println("Please enter the date joined of the teacher (DD/MM/YYYY):");
            String dateJoined = scanner.nextLine();

            System.out.println("Please enter the years in center of the teacher:");
            String yearsInCenter = scanner.nextLine();

            Tutor teacher = new Tutor(name, id, address, yearsOfExperience, dateJoined, yearsInCenter);
            teachers.add(teacher);
        }
        return teachers;
    }

    public static void displayTeachers(List<Tutor> teachers) {
        System.out.println("\nTeacher details:");
        for (Tutor teacher : teachers) {
            System.out.println("Name: " + teacher.name);
            System.out.println("ID: " + teacher.id);
            System.out.println("Address: " + teacher.add);
            System.out.println("Years of experience: " + teacher.Exp);
            System.out.println("Date joined: " + teacher.dateJoined);
            System.out.println("Years in center: " + teacher.yearsInCenter);
            System.out.println();
        }
    }
}
