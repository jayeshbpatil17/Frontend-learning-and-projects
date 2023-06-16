// interface Test1{

//     void print();
// }


interface Test2{
    void print(Integer p);
}

public class LambdaNoParam {

    // static void testprint(Test1 t1){
    //     t1.print();

    // }


    static void testprint(Test2 t2 , Integer p){
        t2.print(p);
    }
    public static void main(String[] args) {

        // testprint(()-> System.out.println("hello"));
        testprint(p->System.out.println(p*p), 5);
    }
}
