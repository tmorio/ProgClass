import java.util.*;

public class StackTest {
    public static void main(String[] args){
        LinkedList<String> stack = new LinkedList<String>();
        stack.addLast("Oyama");
        System.out.println("STACK: " + stack);
        stack.addLast("Ashikaga");
        System.out.println("STACK: " + stack);
        stack.addLast("Utunomiya");
        System.out.println("STACK: " + stack);
        stack.addLast("Sano");
        System.out.println("STACK: " + stack);
        System.out.println("POP:" + stack.removeLast());
        System.out.println("STACK: " + stack);
        System.out.println("POP:" + stack.removeLast());
        System.out.println("STACK: " + stack);
        System.out.println("POP:" + stack.removeLast());
        System.out.println("STACK: " + stack);
        System.out.println("POP:" + stack.removeLast());

    }
}
