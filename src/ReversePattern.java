public class ReversePattern {
    public void reverse() {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j>=i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
