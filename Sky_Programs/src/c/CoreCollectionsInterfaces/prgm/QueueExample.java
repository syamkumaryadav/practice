package c.CoreCollectionsInterfaces.prgm;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(5);
        numbers.add(55);

        System.out.println("Queue contents (Priority Queue):");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());  // Poll retrieves and removes elements in natural order
        }
    }
}

