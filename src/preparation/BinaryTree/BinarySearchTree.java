package preparation.BinaryTree;



public class BinarySearchTree {

    Node root;

    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
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
        if(root.data>=data1 && root.data<=data2)
            return root;
        if(root.data>data1 && root.data>data2)
            return leastCommonAncestor(root.left, data1, data2);
        return leastCommonAncestor(root.right, data1, data2);

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
        System.out.println(tree.leastCommonAncestor(tree.root, 4, 22).data);

    }
}
