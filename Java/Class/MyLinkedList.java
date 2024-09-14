public class MyLinkedList{

    Node first;
    Node last;
    int counter;

    public MyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
     if(first == null){
        return true;
     }
     return false;
    }

    public void add(String s){
        Node n = new Node(s);
        if(isEmpty()){
            first = last = n;
        }
        else{
            last.next = n; //connect the last
            last = last.next;
        }
    }

    public void find(){
        find(first);;
    }

    private void find(Node n){
    while(n!= null){
        if(n.value.equals("B")){
            System.out.println("true");
        } 
            n = n.next;
        }
    }

    public void printRec(){
        printRec(first);
    }

    private void printRec(Node n){
    if(n != null){
        System.out.println(n.value);
        printRec(n.next);
    }
    }

    public int size(){
       return size(first);
    }

    private int size(Node n){
        int counter = 0;
        while(n != null){
            counter++;
            n = n.next;
        }
        return counter;
    }

    public int sizeRec(){
        return sizeRec(first);
    }

    private int sizeRec(Node n){ 
    if(n != null){
        return 1 + sizeRec(n.next);
    }
    return 0;
    }


    public void add(int index, String e){
        if(index == 0){ 
            first = new Node(e, first);
            if(last == null){
                last = first;
                return;    
            }
        }
        //cuando lo estas agregando en medio de la lista
        Node p = first;
        for(int k = 1; k <= index - 1; k++){
            p = p.next;
        }

        p.next = new Node(e, p.next);
        if(p.next.next == null){
            last = p.next;
        }
    }
}