import java.util.*;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void printCond(Collection<Integer> c , Predicate<Integer> p) {
        for (Integer x : c) {
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        /* 
        //using without lambda class
        class MyPredicate  implements Predicate<Integer>{
            public boolean test(Integer x){
                return (x%2==0);
            }
        }
        */

         //using  lambda class
        /*
         Predicate<Integer> pp = new Predicate<Integer>() {

            public boolean test(Integer x) {
                return (x%2==0);
            }
            
        };
        */
         
        List<Integer> ls = new ArrayList<>(Arrays.asList(10,15,20,25,30));
        //using without lambda class
        // printCond(ls, new MyPredicate());

        //using  lambda class
        //printCond(ls, pp);

        //using final  lambda expression
        printCond(ls, x -> x%2==0);

    }
    
}
