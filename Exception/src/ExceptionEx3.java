public class ExceptionEx3 {
    public static void main(String[] args){
        int a = 4;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Excetion!");
            System.out.println(e);
            return;
        }finally {
            System.out.println("Teerminated.");
        }
    }
}
