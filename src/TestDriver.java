public class TestDriver {
    public static void main(String[] args) {
        QueueObject<String> QO = new QueueObject<String>();

        System.out.println(QO.isEmpty()); // should print out true
        // adds these strings to the queue
        QO.enqueue("hello");
        QO.enqueue("What");
        QO.enqueue("The");
        QO.enqueue("Dog");
        QO.enqueue("Doing");
        System.out.println(QO.isEmpty()); // should print out false
        System.out.println(QO.size());
        System.out.println(QO.peek());//should print out hello
        System.out.println(QO.dequeue()); //should return hello
        System.out.println(QO.dequeue()); //should return What
        System.out.println(QO.size()); //should return 3
        System.out.println(QO.dequeue()); // should return The
        System.out.println(QO.size()); //should return 2

    }
}
