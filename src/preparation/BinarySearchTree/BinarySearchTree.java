package preparation.BinarySearchTree;



public class BinarySearchTree {

    static Node root;

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

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.insertNode(root, 1);
        root = bst.insertNode(root, 11);
        root = bst.insertNode(root, 2);
        System.out.println(bst.search(root,111));
    }
}
