package OOP.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    String id;
    String homeTown;
    Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String homeTown, Date dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("ID: " + id);
        System.out.println("Hometown: " + homeTown);
        System.out.println("Date of Birth: " + sdf.format(dateOfBirth));
    }

    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID: ");
            id = scanner.nextLine();
            System.out.print("Enter Hometown: ");
            homeTown = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("Enter Date of Birth (dd/MM/YYYY):");
            String dateOfBirthString = scanner.nextLine();
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public boolean editPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Hometown: ");
            homeTown = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.print("Enter Date of Birth (dd/MM/YYYY):");
            String dateOfBirthString = scanner.nextLine();
            dateOfBirth = sdf.parse(dateOfBirthString);
            return true;
        } catch (ParseException e) {
            System.out.println(e);
            return false;
        }
    }
}
