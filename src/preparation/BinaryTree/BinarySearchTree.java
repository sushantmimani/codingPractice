package preparation.BinaryTree;


import java.util.*;

public class BinarySearchTree {

    Node root;

    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    void inOrderIterative(Node root){
        Stack<Node> s = new Stack();
        while(root!=null){
            s.push(root);
            root = root.left;
        }
        while(!s.isEmpty()){
            Node temp = s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                root = temp.right;
                while(root!=null){
                    s.push(root);
                    root=root.left;
                }
            }

        }
    }

    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void preOrderIterative(Node root){
        Stack<Node> s = new Stack();
        s.add(root);
        while(!s.isEmpty()){
            Node temp = s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
                s.add(temp.right);
            if(temp.left!=null)
                s.add(temp.left);
        }
    }

    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    Node insertNode(Node root, int x){
        if (root==null){
            root = new Node(x);
            return root;
        }
        if(x<=root.data)
            root.left = insertNode(root.left,x);
        else
            root.right = insertNode(root.right,x);
        return root;
    }

    Node search (Node root, int data){
         if(root == null || root.data == data)
             return root;
         else

         if(data<=root.data)
             return search(root.left, data);
         return search(root.right, data);
    }

    Node leastCommonAncestor(Node root, int data1, int data2){
        if(root==null)
            return null;
        if(root.data>data1 && root.data>data2)
            return leastCommonAncestor(root.left, data1, data2);
        if(root.data<data1 && root.data<data2)
            return leastCommonAncestor(root.right, data1, data2);
        return root;

    }

    public static boolean sameTree(Node root1, Node root2){
        if(root1 == null && root2==null)
            return true;
        if(root1==null || root2==null)
                return false;
        else
            return sameTree(root1.left, root2.left)
                    &&sameTree(root1.right, root2.right)
                    && root1.data==root2.data;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.root = new Node(20);
        tree1.root.left = new Node(8);
        tree1.root.right = new Node(22);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(12);
        tree1.root.left.right.left = new Node(10);
        tree1.root.left.right.right = new Node(14);
//        tree.inOrder(tree.root);
//        System.out.println();
//        tree.inOrderIterative(tree.root);
//        System.out.println(tree.leastCommonAncestor(tree.root, 4, 22).data);
//        tree.preOrder(tree.root);
//        System.out.println();
//        tree.preOrderIterative(tree.root);
//        System.out.println();
//        tree.postOrder(tree.root);
        System.out.println(sameTree(tree.root, tree1.root));
    }
}
