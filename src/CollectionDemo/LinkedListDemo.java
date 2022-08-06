package CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        String studentName;
        int rollNo;

        Student s1 = new Student(1, "priyanka");
        Student s2 = new Student(2, "Vinod");


        List<Student> l = new LinkedList<Student>();
        l.add(s1);
        l.add(s2);
        l.add(s1);
        l.add(s2);
//        l.addAll(3, (Collection<? extends Student>) s1);

        System.out.println(l.size());

        for (Student s : l) {
            System.out.println(s);
        }
    }
}
