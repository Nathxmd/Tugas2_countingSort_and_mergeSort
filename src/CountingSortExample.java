import java.util.Arrays;

public class CountingSortExample {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);
        int range = max - min + 1;

        int[] count = new int[range];
        Arrays.fill(count, 0);

        for ( int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 12, 8, 3};

        System.out.println("Array sebelum di urutkan :" + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Array sesudah di urutkan :" + Arrays.toString(arr));
    }
}
