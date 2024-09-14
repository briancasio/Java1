public class MyQueueLLTest {

    public static void main(String[] args) {
        
        try{
        MyQueueLL q = new MyQueueLL();

        System.out.println(q.isEmpty());
        q.enqueue("Hola");
        q.enqueue("Mundo");
        System.out.println(q.isEmpty());
        System.out.println("Removing... " + q.dequeue());
        System.out.println("Removing... " + q.dequeue());
        System.out.println("Removing... " + q.dequeue());

        System.out.println("Front: " + q.peek());
        }
        catch(QueueEmptyException e){
            System.out.println(e);
        }

    }

}