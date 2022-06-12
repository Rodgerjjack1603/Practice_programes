import java.util.Arrays;

public class String_pro {

    public static void main(String[] args) {
        //Anagram
        String param_1 = "Peek";
        String param_2 = "Keep";

        String param_1_low = param_1.toLowerCase();
        String param_2_low = param_2.toLowerCase();

        if (param_1_low.length() == param_2_low.length()) {
            char[] param_char_1 = param_1_low.toCharArray();
            char[] param_char_2 = param_2_low.toCharArray();
            Arrays.sort(param_char_1);
            Arrays.sort(param_char_2);
            boolean isAnagram = Arrays.equals(param_char_1, param_char_2);
            if(isAnagram){
                System.out.println("This is an Anagram");
            }else{
                System.out.println("This is not an Anagram");
            }
        }else{
            System.out.println("Length not equal this is not an Anagram");
        }
    }
}
