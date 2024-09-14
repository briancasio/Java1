import java.util.Scanner;

public class MyStackATester{

    public static void main(String[] args) throws EmptyStackException2 {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        MyStackA s = new MyStackA(size);
        String word;

        for(int i = 0; i < size; i++){
        
            word = input.nextLine();
            s.push(word);

        }
        try{
        
        //System.out.println(s.peek());     
        //System.out.println("Removing " + s.pop());
        //System.out.println("Removing " + s.pop());
        

        //System.out.println(s.isEmpty());

        System.out.println("is Full? " + s.isFull());

        System.out.println("size? " + s.size());
        }
        catch(EmptyStackException2 e1){
        
            System.out.println(e1);
        
        }

        for(int i = 0; i < s.size(); i++){
        
            System.out.println(s.peek());
        
        }

    }




}