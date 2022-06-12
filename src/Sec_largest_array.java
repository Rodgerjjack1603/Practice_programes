import java.util.Arrays;
import java.util.Comparator;

public class Sec_largest_array {

    public static void main(String[] args) {
        int[] arr = {23, 55, 6, 45, 22, 44, 99, 78, 78};
        int temp;
        //Declarative approach
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest>>"+ arr[arr.length-2]);

        //Imperative approach
        int result = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("result>>"+ result);
    }
}
