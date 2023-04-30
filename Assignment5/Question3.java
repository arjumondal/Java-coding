/* 3. Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberofRooms. The class contains methods for getting and printing the attributes. Then write a Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods for this
class. Also, implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options:
      i) Admit new student
      ii) Migrate a student
      iii) Display details of a student
For the third option, a search is to be made on the basis of the entered registration number. */
import java.util.Scanner;

interface Department{
    String deptName = "name";
    String deptHead = "head";
    void displayDept();
}

class Hostel{
    Scanner scan = new Scanner(System.in);
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void setAttributes(){
        System.out.print("Hostel Name:\t");
        this.hostelName = scan.nextLine();
        scan.nextLine();
        System.out.print("Hostel Location:\t");
        this.hostelLocation = scan.nextLine();
        System.out.print("How Many Number of Rooms are There:\t");
        this.numberOfRooms = scan.nextInt();
    }

    void display(){
        System.out.println("Hostel Name is:\t" + this.hostelName);
        System.out.println("Hostel Location is:\t" + this.hostelLocation);
        System.out.println("There are total " + this.numberOfRooms + " Rooms.");
    }
}

class Student extends Hostel implements Department{
    String studentName;
    long regNo;
    String electiveSubject;
    float avgMarks;

    void setvalues(){
        System.out.print("Student Name:\t");
        studentName = scan.nextLine();
        System.out.print("Elective Subject is:\t");
        electiveSubject = scan.nextLine();
        System.out.print("Registration Number:\t");
        regNo = scan.nextLong();
        System.out.print("Average Marks is:\t");
        avgMarks = scan.nextFloat();
    }

    void displayValues(){
        System.out.println("Student Name:\t" + studentName);
        System.out.println("Elective Subject:\t" + electiveSubject);
        System.out.println("Registration Number:\t" + regNo);
        System.out.println("Average Marks:\t" + avgMarks);
        System.out.println("Hostel Name:\t" + hostelName);
        System.out.println("Hostel Location:\t" + hostelLocation);
        System.out.println("Total Room Number:\t" + numberOfRooms);
    }

    @Override
    public void displayDept() {
        System.out.println("Department Name:\t" + deptName);
        System.out.println("Department Head:\t" + deptHead);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setvalues();
        s.setAttributes();
        s.displayValues();
        s.displayDept();
    }
}
