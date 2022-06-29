package Inheritance;

public class Student extends Person {


    public Student(int studentId, String sub1, String sub2, String sub3) {
        super("Shriyan", "16-apr-2018");

        System.out.println("Student Id: " + studentId);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);

        System.out.println("Subject 3: " + sub3);

    }
}
