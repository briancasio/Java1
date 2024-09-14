public class BNodeTester {
    public static void main(String[] args) {
        BNode a = new BNode("A");
        BNode b = new BNode("B");
        BNode c = new BNode("C");
        BNode d = new BNode("D");
        BNode e = new BNode("E");
        BNode f = new BNode("F");
        BNode g = new BNode("G");
        BNode h = new BNode("H");
        BNode i = new BNode("I");
        BNode j = new BNode("J");
        BNode k = new BNode("K");

        //Conect A to B and C

        a.left = b;
        a.right = c;

        //B to D

        b.left = d;

        //C to E and F

        c.left = e;
        c.right = f;

        //D to G(right)
        d.right = g;

        //E to H and I 
        e.left = h;

        e.right = i;

        //F to j(right)
        f.right = j;

        //J to K

        j.left = k;

        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();

    }
    
    //preorder: root, left, right
    public static void preOrder(BNode root){
        if(root!=null){
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //inorder: left, root, right
    public static void inOrder(BNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    //postorder: left, right, root
    public static void postOrder(BNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }
}
