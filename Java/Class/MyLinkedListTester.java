public class MyLinkedListTester{

    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("...adding elements");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Is the list empty? " + list.isEmpty());

        System.out.println();
        list.find();
        list.printRec();
        System.out.println(list.size());
        System.out.println(list.sizeRec());

    }

}