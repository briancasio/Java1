
public class MyStackLLTester{
public static void main(String[] args)  {
    
    MyStackLL stack = new MyStackLL();
    try{
    System.out.println("is stack empty ?" + stack.isEmpty());
    stack.push("EPCC");
    stack.push("CS");
    stack.push("Java");
    System.out.println("is stack empty? " + stack.isEmpty());
    System.out.println("Top: " + stack.peek());
    }
    catch(EmptyStackException2 e1){
        System.out.println(e1);
    }



}
}