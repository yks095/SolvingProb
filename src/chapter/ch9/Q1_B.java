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

    public void add(int key)    {
        BinaryTree newNode = new BinaryTree(key);
        if(root == null) {
            root = newNode;
            return;
        }
        else    {
            BinaryTree tree = root;
            BinaryTree parent = null;

            while(true) {
                parent = tree;

                if(tree.key < key) {
                    tree = tree.right;
                    if(tree == null)    {
                        parent.right = newNode;
                        return;
                    }
                }
                else if(tree.key > key) {
                    tree = tree.left;
                    if(tree == null)    {
                        parent.left = newNode;
                        return;
                    }
                }
            }
        }
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
