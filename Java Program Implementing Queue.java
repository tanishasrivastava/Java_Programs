package demo_project;

import java.util.LinkedList;

import java.util.Queue;



public class queue {



    public static void main(String[] args) {

       

        Queue<String> queue = new LinkedList<>();

    queue.add("Alice");

        queue.add("Bob");

        queue.add("Charlie");

        queue.add("David");



        System.out.println("Queue: " + queue);



        

        String removedElement = queue.remove();

        System.out.println("Dequeued: " + removedElement);

        System.out.println("Updated Queue: " + queue);



        

        String frontElement = queue.peek();

        System.out.println("Front Element: " + frontElement);



        

        boolean isEmpty = queue.isEmpty();

        System.out.println("Is Queue Empty? " + isEmpty);

    }

}
