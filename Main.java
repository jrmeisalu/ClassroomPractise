import student.Classroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the student tracking application");
        System.out.println("Please select the following action: ");
        Classroom classroom = new Classroom();
        String input = "";
        do {
            System.out.println("""
                    1. Add a student
                    2. Remove a student
                    3. View all the students in the classroom
                    4. View a single student by name
                    5. View students with grade higher than 5
                    6. View students with grade lower than 5
                    Write "quit" to exit the application\n""");

            input = scanner.next();
            switch (input) {
                case "quit":
                    System.out.println("Closing the app");
                    break;
                case "1":
                    classroom.addStudent();
                    break;
                case "2":
                    classroom.removeStudent();
                    break;
                case "3":
                    classroom.viewAllStudents();
                    break;
                case "4":
                    classroom.findOneStudent();
                    break;
                case "5":
                    classroom.gradehigher();
                    break;
                case "6":
                    classroom.gradelowerthen();
                    break;
                default:
                    System.out.println("Please select a valid input");
                    break;
            }
        } while (!input.equals("quit"));

    }
}



