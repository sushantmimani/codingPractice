package preparation.BinaryTree;

import java.util.*;


public class BinaryTree {

    static ArrayList<Integer> path1 = new ArrayList<>();
    static ArrayList<Integer> path2 = new ArrayList<>();


    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void levelOrder(Node root) {
        List<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.remove(0);
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    public static void levels(Node root){
        int height = height(root);
        for(int i=1;i<=height;i++){
            printByLevel(root, i);
            System.out.println();
        }
    }

    public static void printByLevel(Node root, int depth){
        if(root==null)
            return;
        if(depth==1)
            System.out.print(root.data+" ");
        else{
        printByLevel(root.left, depth-1);
        printByLevel(root.right, depth-1);
        }
    }

    public static boolean findPath(Node root, int data, ArrayList<Integer> list) {
        if (root == null)
            return false;
        if (root.data == data) {
            list.add(root.data);
            return true;
        }
        if ((root.left != null && findPath(root.left, data, list)) || (root.right != null && findPath(root.right, data, list))) {
            list.add(root.data);
            return true;
        }

        return false;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return lHeight > rHeight ? (lHeight + 1) : (rHeight + 1);
    }

    public static int sizeOfTree(Node root) {
        if (root == null)
            return 0;
        int lSize = sizeOfTree(root.left);
        int rSize = sizeOfTree(root.right);
        return lSize + rSize + 1;
    }

    public static int leastCommonAncestor(Node root, int data1, int data2) {

        findPath(root, data1, path1);
        findPath(root, data2, path2);
        for (int i = 0; i < path1.size(); i++) {
            for (int j = 0; j < path2.size(); j++) {
                if (path1.get(i) == path2.get(j))
                    return path1.get(i);
            }
        }
        return -1;

//        if(root == null){
//            return null;
//        }
//
//        if(root.data == data1 || root.data == data2){
//            return root;
//        }
//
//        Node l = leastCommonAncestor(root.left,data1,data2);
//        Node r = leastCommonAncestor(root.right,data1,data2);
//
//        if(l != null && r != null){
//            return root;
//        }
//
//        return l != null ? l:r;
    }

    public static boolean sameTree(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null && root2 != null || root1 != null && root2 == null)
            return false;
        return (root1.data == root2.data &&
                sameTree(root1.left, root2.left) &&
                sameTree(root1.right, root2.right));
    }

    public static void distanceBetweenNodes(Node root, int data1, int data2) {
        int lca = leastCommonAncestor(root, data1, data2);
        int i = 0;
        while (path1.get(i) != lca) {
            i++;
        }
        int j = 0;
        while (path2.get(j) != lca) {
            j++;
        }
        System.out.println("Distance is:" + (i + j));
    }

    public static boolean rootToLeafSum(Node root, int sum, ArrayList<Integer> list) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.data == sum) {
            list.add(root.data);
            return true;
        }
        if ((root.left != null && rootToLeafSum(root.left, sum - root.data, list)) ||
                (root.right != null && rootToLeafSum(root.right, sum - root.data, list))) {
            list.add(root.data);
            return true;
        }
        return false;
    }

    public static Node treeFromList(ArrayList<Integer> a) {
        ArrayList<Node> queue = new ArrayList<>();
        Node root = new Node(a.get(0));
        int i = 1;
        queue.add(root);
        while (!queue.isEmpty() && i != a.size()) {
            Node parent = queue.remove(0);
            parent.left = new Node(a.get(i++));
            queue.add(parent.left);
            parent.right = new Node(a.get(i++));
            queue.add(parent.right);
        }
        return root;


    }

    public static boolean printAncestors(Node root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        if ((root.left != null && printAncestors(root.left, data)) ||
                (root.right != null && printAncestors(root.right, data))) {
            System.out.println(root.data);
            return true;
        }

        return false;
    }

    public static void commonNodes(Node root, int data1, int data2) {

        int lca = leastCommonAncestor(root, data1, data2);
        int i = path1.indexOf(lca);
        while (i != path1.size()) {
            System.out.println(path1.get(i++));
        }
    }

    public static boolean isSubtree(Node root1, Node root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(sameTree(root1, root2))
            return true;
        return (isSubtree(root1.left, root2)|| isSubtree(root1.right, root2));
    }

    public static int nodeLevel(Node root, int data, int level){
        if(root==null)
            return -1;
        if(root.data==data)
            return level;
        int l = nodeLevel(root.left, data, level+1);
        if(l>=1)
            return l;
        return nodeLevel(root.right, data, level+1);
    }

    public static int countLeaf(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        return countLeaf(root.left)+countLeaf(root.right);
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
//
//        levelOrder(root);
//        System.out.println();
//        levelOrder(root1);
//        System.out.println("\nHeight of tree is:"+height(root));
//        System.out.println("Least Common Ancestor:"+leastCommonAncestor(root, 2, 4));
//        distanceBetweenNodes(root, 4, 3);
//        System.out.println(sameTree(root, root1));
//
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        Node root2 = treeFromList(a);
        preOrder(root2);
//

//
//        printAncestors(root3, 7);


        Node root4 = new Node(1);
        root4.left = new Node(2);
        root4.right = new Node(3);
        root4.left.left = new Node(4);
        root4.left.right = new Node(5);
        root4.right.left = new Node(6);
        root4.right.right = new Node(7);
        root4.left.left.left = new Node(8);
        root4.right.left.left = new Node(9);
        root4.right.left.right = new Node(10);

//        commonNodes(root4, 9, 7);
//        System.out.println(sizeOfTree(root1));

        Node root5 = new Node(10);
        root5.left = new Node(8);
        root5.right = new Node(2);
        root5.left.left = new Node(3);
        root5.left.right = new Node(5);
        root5.right.left = new Node(2);

//        System.out.println(rootToLeafSum(root5, 21, path3));
//        System.out.println(countLeaf(root1));

//        System.out.println(isSubtree(root4, root1));
//        System.out.println(nodeLevel(root4, 2,1));

        levels(root1);
    }

}
