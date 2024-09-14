public class BSTreeTester{
    public static void main(String[]args){
        BSTree tree = new BSTree();
        System.out.println(tree.isEmpty());
        tree.add(1);
        tree.add(10);
        tree.add(14);
        tree.add(15);
        tree.add(7);
        tree.add(2);
        tree.add(3);
        tree.add(15);
        //System.out.println(tree.isEmpty());
        System.out.println("Found? "+tree.contains(100));
        System.out.println("Size: "+tree.size());
        System.out.println("Leaves: "+tree.numberOfLeaves());
    }
}