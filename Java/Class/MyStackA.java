

public class MyStackA {

    String [] stack;
    int top;
    int size;

    public MyStackA(int size){
        stack = new String[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == 0;
    }

    /*public void ensureCapacity(){
        String[] newStack = new String[stack.length * 2];
        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
            stack = newStack;
        }
    } */

    public void push(String s){
        //if(top == stack.length){
          //  ensureCapacity();
        //}
        stack[top] = s;
        top++; 
    } 

    public String pop()throws EmptyStackException2{
        if(isEmpty()){
            throw new EmptyStackException2("The stack is empty");
        }
        String s = stack[top-1];
        top--;
        return s;
    }

        public String peek()throws EmptyStackException2{
        if(isEmpty()){
            throw new EmptyStackException2("The stack is empty");
        }
        String s = stack[top-1];
        return s;
    }
    
    public boolean isFull()throws EmptyStackException2{
        if(isEmpty()){
            throw new EmptyStackException2("emptyyyy");
        }
        
        if(top == size){
            return true;
        }
        else {
            return false;
        }
    }

    public int size(){
    
    return top;
    
    }



}