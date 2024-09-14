
public class NodeTester{
public static void main(String[] args) {

    Node n1 = new Node("A");
    Node n2 = new Node("B");
    Node n3 = new Node("C");
    Node n4 = new Node("D");
    Node n5 = new Node("E");

    // connect B -> A -> C -> E -> D   

    n2.next = n1; // B -> A
    n1.next = n3; // A -> C
    n3.next = n5; // C -> E
    n5.next = n4; // E -> D

    System.out.println(n2.value);
    System.out.println(n2.next.value);
    System.out.println(n2.next.next.value);

    Node n = n2;

    printNode(n);
    printNodeRec(n);
    System.out.println();


}

    public static void printNode(Node n){
    
    while(n != null){

        System.out.print(n.value + " ");

        n = n.next;

    }
    System.out.println();
    }

    public static void printNodeRec(Node n){


        if(n != null){

        printNodeRec(n.next);
        System.out.print(n.value);
        System.out.print(" ");
    }
    
    }

    public static void printNodeReverse(Node n){
    
        
    
    }

}