import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
    queue.offer("Person1");
    queue.offer("Person2");
    queue.offer("Person3");
    System.out.println(queue);
    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue);

    
  }

}
