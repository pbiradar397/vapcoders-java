package CollectionDemo;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> Name = new HashSet<>();
        Name.add("Priyanka");
        Name.add("Vinod");
        Name.add("Vinod");

        Set<Integer> lh = new LinkedHashSet<>(Arrays.asList(1, 2, 4, 3, 4, 2));
        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 8, 9));

        System.out.println(al);
        Integer[] array = new Integer[al.size()];

        Integer[] arr = al.toArray(array);


        System.out.println(Arrays.toString(arr));


        System.out.println(lh);
        lh.toArray();
        System.out.println(lh);

        Set<Integer> id = new HashSet<>();
        id.add(101);
        id.add(102);
        Student s = new Student(101, "priya");
        Student s2 = new Student(101, "priya");
        Student s3 = new Student(102, "Veeresh");
        Student s4 = new Student(103, "mamne");
        Set<Student> set = new HashSet<>();
        set.add(s);
        set.add(s);
        set.add(s);
        set.add(s2);
        set.add(s3);
        set.add(s4);
//        for(Student s5: set) {
//            if(s5.equals(set)){
//                System.out.println(s5);
//            }
//        }


//        for (String s : Name) {
//            System.out.println(s);
//        }
        System.out.println(id);

    }
}



