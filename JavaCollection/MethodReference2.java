import java.util.Arrays;

public class MethodReference2 {
    public static void main(String[] args) {
        String[] a = {"GFG","HELLO","BYE"};
        String[] b = {"gfg","hello","bye"};

        if(Arrays.equals(a, b, String::compareToIgnoreCase)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
