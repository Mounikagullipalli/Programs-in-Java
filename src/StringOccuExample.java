import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringOccuExample {
    public static void main(String[] args) {
        String s = "hai how are you i am grate hai hai what about you";
        String [] arr = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int k = map.get(arr[i]);
                map.put(arr[i],++k);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map +Arrays.toString(arr));
    }
}
