public class Node{
    String value;
    Node next;

    public Node(String value){
        this.value = value;
        this.next = null;
    }

    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }


}