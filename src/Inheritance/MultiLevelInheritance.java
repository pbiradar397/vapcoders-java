package Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("creating person object");
        Person p = new Person("Shrinidhi", "23-jan-2021");
        System.out.println("-----------------------------");

        System.out.println("Creating student object");
        Student s = new Student(101, "Maths", "English", "Hindi");
        System.out.println("-----------------------------");
        System.out.println("creating result object");
        Result res = new Result(250);
    }
}
