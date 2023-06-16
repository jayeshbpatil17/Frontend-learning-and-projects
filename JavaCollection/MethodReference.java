import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,30);
        // ls.forEach(System.out::println);

        ls.forEach(MethodReference::printCondition);

    }
    public static void printCondition(Integer x){
        System.out.println(x*x);
    }
}
