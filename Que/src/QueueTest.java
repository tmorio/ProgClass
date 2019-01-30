import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        System.out.println("QUE:" + queue);
        queue.offer("Oyama");
        System.out.println("QUE:" + queue);
        queue.offer("Utunomiya");
        System.out.println("QUE:" + queue);
        queue.offer("Ashikaga");
        System.out.println("QUE:" + queue);
        queue.offer("Sano");
        System.out.println("Que:" + queue);
        System.out.println("Dequeue:" +queue.poll());
        System.out.println("Que:" + queue);
        System.out.println("Dequeue:" +queue.poll());
        System.out.println("Que:" + queue);
        System.out.println("Dequeue:" +queue.poll());
        System.out.println("Que:" + queue);
        System.out.println("Dequeue:" +queue.poll());
        System.out.println("Que:" + queue);
        System.out.println("Dequeue:" +queue.poll());
    }
}
