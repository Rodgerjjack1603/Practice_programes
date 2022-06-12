import java.util.Arrays;
import java.util.stream.Collectors;

public class Merge_Arrays {

    public static void main(String[] args) {
        //Merge Arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int arr_length_1 = arr1.length;
        int arr_length_2 = arr2.length;
        int merge_length = arr_length_1 + arr_length_2;
        int[] arr = new int[merge_length];

        System.arraycopy(arr1, 0, arr, 0, arr_length_1);
        System.arraycopy(arr2, 0, arr, arr_length_1, arr_length_2);
        /*
         for (int i=0; i<arr_length_1; i++){
           arr[i] = arr1[i];
        }

        for (int j=0; j<arr_length_2; j++){
            arr[arr_length_1+j] = arr2[j];
        }
         */
        Arrays.stream(arr)
                .forEach(System.out::println);

        //Merge Array with unique values
        int[] arr_1 = {2, 4, 5, 8};
        int[] arr_2 = {3, 4, 5, 9};

        int arrLength1 = arr_1.length;
        int arrLength2 = arr_2.length;
        int totalLength = arrLength1 + arr_length_2;
        int[] mergeArray = new int[totalLength];

        System.arraycopy(arr_1, 0, mergeArray, 0, arrLength1);
        System.arraycopy(arr_2, 0, mergeArray, arrLength2, arrLength2);
        Arrays.stream(mergeArray)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
