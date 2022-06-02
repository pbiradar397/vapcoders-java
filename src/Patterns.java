public class Patterns {
    public void number() {

//        1
//        1 2
//        1 2 3
//        1 2 3 4

//        4 3 2 1
//        3 2 1
//        2 1
//        1




        for(int i=1;i<5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
