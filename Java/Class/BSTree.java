public class BSTree{
    BNode root;

   public BSTree(){
    root=null;
   }
   public boolean isEmpty(){
    return root==null;
   }
   public boolean add(int x){
    root = add(x,root);
    return true;
    
   }



   private BNode add(int x, BNode r){
//When the current node is null, we've reached a leaft node
//and we can insert the new node in that position
if(r==null){
    return new BNode(x);
}
//if the new node value is lower than a current node,
//go to the left child:
if(x<root.value){
    r.left = add(x,r.left);
}
//if the new node value is greater than a current node,
//go to the right child:
else{
    r.right = add(x,r.right);
}
return r;
   }

public void pre_order(){
    pre_order(root);
}



//root, left,right   
private void pre_order(BNode r){
    if(r!=null){
System.out.println(r.value);
pre_order(r.left);
pre_order(r.right);
}
}

public boolean contains(int target) {
    return contains(target,root);
}

private boolean contains(int target, BNode root){
if(root==null){
    return false;
}
if(target == root.value){
    return true;
}
if(target<root.value){
    return contains(target, root.left);
}
else{
    return contains(target, root.right);
}
}

public int size(){
    return size(root);
}

private int size (BNode root){
    if(root==null){
        return 0;
    }
    else{
        return 1+size(root.right)+size(root.left);
    }
}

//3
public int numberOfLeaves(){
    return numberOfLeaves(root);
}

private int numberOfLeaves(BNode root){
    if(root==null){
        return 0;
    }
    if(root.left ==null && root.right!=null){
        return 1;
    }
    else if(root.left !=null && root.right==null){
        return 1;
    }
    else{
     return numberOfLeaves(root.left)+numberOfLeaves(root.right);
    }
}

public int largest(){
    return largest(root);
}
private int largest(BNode r){

    if(r == null){
        return 0;
    }
    if(r.right == null){
        return r.value;
    }
    return largest(r.right);

}

}