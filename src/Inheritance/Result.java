package Inheritance;

public class Result extends Student {


    public Result(int total_marks) {
        super(101, "Maths", "English", "Hindi");


        float percentage = total_marks/3;
        System.out.println("total_marks: " + total_marks);
        System.out.println("percentage: " + percentage);
    }


}
