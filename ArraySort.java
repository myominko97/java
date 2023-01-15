
public class ArraySort {

    public static void main(String[] args) {
        int[] arr = { 100, 20, 90, 2, -5, 8, 11 };
        System.out.println("Before Sort" + arr);

        sort(arr);
        System.out.println("After Sort" + arr);
    }

    private static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

    }

}
