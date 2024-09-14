public class MyQueueLL {

    Node front, rear;

    public MyQueueLL(){
        front = rear = null;
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void enqueue(String s){
        Node n = new Node(s);
        if(isEmpty()){
            front = rear = n;
        }
    else{
        rear.next = n;
        rear=rear.next;
    }
    
    }
    //peek // return front
    public String peek() throws QueueEmptyException{
        if(isEmpty()){
        throw new QueueEmptyException("This queue is empty");
    }
        return front.value;
    }

   public String dequeue()throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("This queue is empty");
        }
        String s = front.value;
        front = front.next;
        return s;
    }



}