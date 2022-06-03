public class LargeAndSmall {

    public static void main(String[] args) {

        int a[] = {10, 25, 8, 3, 4, 20};
        int large = findMax(a);
        System.out.println("largest in an array :" + large);

        int small = findMIn(a);
        System.out.println("Smallest in an array :" + small);


    }

    public static int findMax(int arr[]) {

//        int a[] = {10, 25, 8, 3, 4, 20};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
//        System.out.println("largest in a array :"+max);
        return max;
    }

    public static int findMIn(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }
}
