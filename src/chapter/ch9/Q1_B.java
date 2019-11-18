package chapter.ch9;

import java.util.LinkedList;

public class Q1_B {
    public static void main(String[] args) {
        BinarySearchTree_B tree=new BinarySearchTree_B();
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
    }
}
class BinarySearchTree_B {
    class BinaryTree {
        int key;
        BinaryTree left, right;
        public BinaryTree(int key) { this.key=key; }
        @Override
        public String toString() { return Integer.toString(key); }
    }
    BinaryTree root;


//    public void add(int key) {
//        root=add(root, key);
//    }
    private BinaryTree add(BinaryTree tree, int key) {
        if(tree==null) return new BinaryTree(key);
        if(tree.key<key) tree.right=add(tree.right, key);
        else if(tree.key>key) tree.left=add(tree.left, key);
        else ; // value 삽입 시 else tree.value=value;
        return tree;
    }

    public void add(int key)    {

    }


    public BinaryTree search(int key) {
        BinaryTree node=root;
        while(node!=null){
            if(node.key==key) return node;
            if(node.key<key) node=node.right;
            else node=node.left;
        }
        return node;
    }
    @Override
    public String toString() {
        return levelOrder().toString();
    }
    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list=new LinkedList<>();
        LinkedList<BinaryTree> queue=new LinkedList<>();
        if(root!=null) queue.addLast(root);
        while(!queue.isEmpty()){
            BinaryTree node=queue.removeFirst();
            list.add(node);
            if(node.left!=null) queue.addLast(node.left);
            if(node.right!=null) queue.addLast(node.right);
        }
        return list;
    }
}
