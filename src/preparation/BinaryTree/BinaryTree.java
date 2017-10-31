package preparation.BinaryTree;

import java.lang.reflect.Array;
import java.util.*;


public class BinaryTree {

    static ArrayList<Integer> path = new ArrayList<>();
    static ArrayList<Integer> path1 = new ArrayList<>();



    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void levelOrder(Node root){
        List<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.remove(0);
            System.out.print(n.data+" ");
            if(n.left!=null)
                q.add(n.left);
            if(n.right!=null)
                q.add(n.right);
        }
    }

    public static boolean findPath(Node root, int data, ArrayList<Integer> list){
        if(root==null)
            return false;
        if(root.data == data){
            list.add(root.data);
            return true;
        }
        if(root.left!=null && findPath(root.left, data, list)) {
            list.add(root.data);
            return true;
        }
        if(root.right!=null && findPath(root.right, data, list)){
            list.add(root.data);
            return true;
        }

        return false;
    }

    public static int height(Node root){
        if (root==null)
            return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
         return lHeight>rHeight?(lHeight+1):(rHeight+1);
    }

    public static int leastCommonAncestor(Node root, int data1, int data2){

        findPath(root,data1, path);
        System.out.println(path);
        findPath(root,data2, path1);
        System.out.println(path1);
        for(int i=0;i<path.size();i++){
            for(int j=0;j<path1.size();j++){
                if(path.get(i)==path1.get(j))
                    return path.get(i);
            }
        }
        return -1;
    }

    public static void distanceBetweenNodes(Node root, int data1, int data2){
        int lca = leastCommonAncestor(root, data1, data2);
        int i=0;
        while(path.get(i)!=lca){
            i++;
        }
        int j=0;
        while(path1.get(j)!=lca){
            j++;
        }
        System.out.println("Distance is:"+(i+j));
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.left.left.right = new Node(15);


        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);


        levelOrder(root);
        System.out.println();
        levelOrder(root1);
        System.out.println("\nHeight of tree is:"+height(root));
//        System.out.println("Least Common Ancestor:"+leastCommonAncestor(root, 15, 11));
        distanceBetweenNodes(root, 4, 3);
    }
}
