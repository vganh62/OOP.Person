package OOP.Person;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    String major;

    public Student() {
    }

    public Student(String id, String homeTown, Date dateOfBirth, String major) {
        super(id, homeTown, dateOfBirth);
        this.major = major;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }

    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Major: ");
        major = scanner.nextLine();
    }

    public boolean editPerson() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edit Major: ");
        major = scanner.nextLine();
        return true;
    }
}
