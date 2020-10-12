package lab2ex2;

public class Main {
    public static void main(String[] args) {

        //Creating 2 queues using 2 different constructors with and without parameters
        Queue queue1= new Queue();
        Queue queue2= new Queue(3);

        //Testing queue1
        System.out.println("Queue nr 1:\n");
        queue1.push(10);
        queue1.push(21);
        queue1.push(32);
        System.out.println("\nInitial queue:");
        queue1.showElements();
        queue1.pop();
        System.out.println("\nThe queue after extracting 1 elements: ");
        queue1.showElements();
        System.out.println("\nThe queue is empty: "+ queue1.isEmpty());
        System.out.println("The queue is full: "+ queue1.isFull());
        queue1.pop();
        queue1.pop();
        System.out.println("\nThe queue after extracting all elements: ");
        //Check if the queue is empty
        System.out.println("\nThe queue is empty: "+ queue1.isEmpty());
        System.out.println("The queue is full: "+ queue1.isFull());
        queue1.push(44);
        queue1.push(53);
        queue1.push(61);
        queue1.push(69);
        queue1.push(75);
        System.out.println("Push 5 elements to the queue:");
        queue1.showElements();
        System.out.println("\nThe queue is empty: "+ queue1.isEmpty());
        System.out.println("The queue is full: "+ queue1.isFull());

        //Testing queue2
        System.out.println("Queue nr 2:\n");
        queue2.push2(75);
        queue2.push2(22);
        queue2.push2(34);
        System.out.println("\nInitial queue:");
        queue2.showElements();
        System.out.println("\nThe queue is empty: "+ queue2.isEmpty());
        System.out.println("The queue is full: "+ queue2.isFull());
        queue2.pop();
        System.out.println("\nThe queue after extracting 1 elements: ");
        queue2.showElements();
        System.out.println("\nThe queue is empty: "+ queue2.isEmpty());
        System.out.println("The queue is full: "+ queue2.isFull());
        queue2.pop();
        queue2.pop();
        System.out.println("\nThe queue after extracting all elements: ");
        //Check if the queue is empty
        System.out.println("\nThe queue is empty: "+ queue2.isEmpty());
        System.out.println("The queue is full: "+ queue2.isFull());

        queue2.push2(4);
        queue2.push2(5);
        queue2.push2(6);
        System.out.println("Push 3 elements to the queue(maxSize):");
        queue2.showElements();
        System.out.println("\nThe queue is empty: "+ queue2.isEmpty());
        System.out.println("The queue is full: "+ queue2.isFull());

        System.out.println("\nPushing one more value(It should be impossible)\n ");
        queue2.push2(7);
        System.out.println("The final queue:");
        queue2.showElements();




    }
}
