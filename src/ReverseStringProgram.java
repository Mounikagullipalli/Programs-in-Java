import java.util.Arrays;

public class ReverseStringProgram {
    public static void main(String[] args) {
        String s = "Mounika";
        char[] arr = s.toString().toCharArray();
        StringBuffer sb1 = new StringBuffer();
        for(int i=arr.length-1;i>=0;i--){
            sb1.append(arr[i]);
        }
        System.out.println( sb1);
    }
}
