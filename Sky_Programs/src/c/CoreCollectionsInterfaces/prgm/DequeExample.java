package c.CoreCollectionsInterfaces.prgm;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("New First");

        System.out.println("Deque contents:");
        for (String element : deque) {
            System.out.println(element);
        }
        
        System.out.println("Poll First: " + deque.pollFirst());  
        System.out.println("Poll Last: " + deque.pollLast());    
    }
}

