public class MyStackLL{
    Node top;

    public MyStackLL(){
        top=null;
    }

    public boolean isEmpty(){
        return top == null;            
    }

    public void push(String s){
        top=new Node(s, top); //add a value to the front of the list.
    }

    public String peek() throws EmptyStackException2{
        if(isEmpty()){
            throw new EmptyStackException2("The Stack is empty");
        }
        return top.value;
    }

    public String pop()throws EmptyStackException2{
    if(isEmpty()){
        throw new EmptyStackException2("The Stack is empty");
    }
    String s = top.value; // peek
    top = top.next; // remove the top Node
    return s;
    }


}

