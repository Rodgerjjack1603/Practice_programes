import java.util.Arrays;
import java.util.stream.Collectors;

public class Bubble_sort {
    public static void main(String[] args) {

        int [] arr = {2, 4, 5, 0, 1, 5, 2};
        //Normal sort sequence
        /*                         Inner loop size
          [2, 4, 0, 1, 5, 2, 5] --    7
          [2, 0, 1, 4, 2, 5, 5] --    6
          [0, 1, 2, 2, 4, 5, 5] --    5
          [0, 1, 2, 2, 4, 5, 5] --    4 -- This will be the last iteration as array is already sorted 
        */
        System.out.println("Before sort >> "+ printArray(arr));;
        sort(arr, true);
        System.out.println("Ascending sort >> "+ printArray(arr));
        sort(arr, false);
        System.out.println("Descending sort >> "+ printArray(arr));
    }

    private static void sort(int [] arr, boolean ascending){
        int length = arr.length;
        int temp;
        boolean is_sorted;

        for(int i=0; i < length; i++){
            is_sorted = true;
            for(int j=1; j < length - i; j++){
                if(ascending){
                    if(arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        is_sorted = false;
                    }
                }else{
                    if(arr[j-1] < arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        is_sorted = false;
                    }
                }
            }
            //avoid useless loop
            if(is_sorted) break;
        }
    }

    private static String printArray(int [] arr){
        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
    }
}
