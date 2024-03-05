import java.util.Arrays;

public class QuickSort {
    public static int[] quicksort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int pivot = array[0];
            int[] menores = Arrays.stream(array).skip(1).filter(i -> i <= pivot).toArray();
            int[] maiores = Arrays.stream(array).skip(1).filter(i -> i > pivot).toArray();
            return concatArrays(quicksort(menores), new int[]{pivot}, quicksort(maiores));
        }
    }

    public static int[] concatArrays(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }
        int[] result = new int[length];
        int pos = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, pos, array.length);
            pos += array.length;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3};
        int[] sortedArray = quicksort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
