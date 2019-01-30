public class StaticClassTest {
    public static void main(String[] args){
        System.out.println("n = " + StaticClass.n);

        StaticClass c1 = new StaticClass();
        System.out.println("n = " + StaticClass.n);

        StaticClass c2 = new StaticClass();
        System.out.println("n = " + StaticClass.n);

        StaticClass.clear();
        System.out.println("n = " + StaticClass.n);
    }
}
