import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {29, 34, 12, 45, 56, 2, 43, 19};

        // Sorts the elements of array in ascending order.
        Arrays.sort(array);

        // Prints the contents of array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}