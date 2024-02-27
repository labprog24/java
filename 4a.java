import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter elements to enqueue (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            int element = scanner.nextInt();
            queue.add(element);
        }

        System.out.println("Queue elements: " + queue);

        if (!queue.isEmpty()) {
            int removedElement = queue.poll();
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Queue is empty. Nothing to remove.");
        }

        int frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        System.out.println("Queue elements after dequeue: " + queue);
        scanner.close();
    }
}
