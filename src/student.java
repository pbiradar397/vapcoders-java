public class student {

        int rollno;
        String name;
        static String college ="ITS";

        student(int r, String n){
            rollno = r;
            name = n;

        }
        void display (){System.out.println(rollno+" "+name+" "+college);}

        public static void main(String args[]){
            student s1 = new student(111,"Karan");
            student s2 = new student(222,"Aryan");

            s1.display();
            s2.display();
        }

}
