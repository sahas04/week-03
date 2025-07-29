package sort;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("orange");

        System.out.println("queue:"+queue);
        System.out.println("peek:"+queue.peek());
        System.out.println("removed:"+queue.poll());
        System.out.println("after poll:"+queue);


    }
}
