public class ReversePattern {
    public void reverse() {
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
