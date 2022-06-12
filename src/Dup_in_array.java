import java.util.*;
import java.util.stream.Collectors;

public class Dup_in_array {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 3, 4, 5, 5, 6};
        //Declarative approach
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicates >>" + arr[j]);
                }

            }

        }

        //Imperative approach - fetch duplicates
        Set<Integer> items = new HashSet<>();
        Set<Integer> result = Arrays.stream(arr)
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
        System.out.println(">>>>"+result);

        //Imperative approach - remove duplicates
        Set<Integer> removeDup = Arrays.stream(arr)
                .collect(Collectors.toSet());
        System.out.println("Unique>>"+removeDup);

        //Duplicate count in an Array
        Map<Integer, Integer> frequency = new HashMap<>();

        for (Integer integer : arr) {
            if (frequency.containsKey(integer)) {
                frequency.put(integer, frequency.get(integer) + 1);
            } else {
                frequency.put(integer, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry :frequency.entrySet()){
            if(entry.getValue() > 1){
            System.out.println("Duplicate number : "+ entry.getKey() +" count - "+ entry.getValue());
            }
        }

        //print only duplicate in two Array
        int[] firstArray = {1, 4, 5, 6, 8};
        int[] secondArray= {4, 5, 2, 3, 9};

        for (int k : firstArray) {
            for (int i : secondArray) {
                if (k == i) {
                    System.out.println(k);
                }
            }
        }
    }
}
