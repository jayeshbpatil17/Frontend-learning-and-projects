import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class lambda
{
    public static void main(String[] args) {
        List<Integer> l1 =  Arrays.asList(10,15,20,25,30);
        l1.forEach(x->System.out.println(x));
    }
}