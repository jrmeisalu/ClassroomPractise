package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intscanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Adding a new student to the classrooom");
        System.out.println("Please enter students name");
        String name = scanner.nextLine();
        System.out.println("Please enter the students grade");
        int grade = intscanner.nextInt();
        System.out.println("Please enter the students course");
        String course = scanner.nextLine();
        Student student = new Student(name, grade, course);
        students.add(student);
        System.out.println(name + " added succsefully");
    }

    public void removeStudent() {
        System.out.println("Please write the name of the student you want to remove");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.name.equals(name)) {
                students.remove(student);
                System.out.println("The following student has been removed: " + student.name);
                return;
            }
        }
    }
    public void viewAllStudents(){
        System.out.println("Listing all of the students in the classroom\n");
    for (Student student:students){
        System.out.println("Name: "+ student.name + " Course: "+ student.course);
    }
    }
    public void findOneStudent() {
            System.out.println("Viewing singel student");
            System.out.println("Please enter student name");
            String name = scanner.nextLine();
            for (Student student : students) {
                if (student.name.equals(name)) {
                    System.out.println("Name: " + student.name + "Grade: " + student.grade + "Course: " + student.course);
                }
            }
        }
    public void gradehigher(){
ArrayList<Student> gradehigherthen5 = new ArrayList<>();
for(Student student:students){
    if(student.grade>5){
        System.out.println("Name: " + student.name + "Grade: "+student.grade);

    }
}
    }
    public void gradelowerthen(){
        ArrayList<Student> gradelowerthen = new ArrayList<>();
        for(Student student:students){
            if(student.grade<5){
                System.out.println("Name: "+student.name + "Grade: "+student.grade);
            }
        }
    }
}