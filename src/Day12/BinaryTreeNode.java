package Day12;

class Node {
    int val;
    Node left;
    Node right;

    Node(int data) {
        val = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeNode {
    int idx = -1;
    public Node buildTree( int[] nodes) {
       idx++;
         if(nodes[idx] == -1) {
              return null;
         }
         Node nn = new Node(nodes[idx]);
         nn.left = buildTree(nodes);
         nn.right = buildTree(nodes);
         return nn;
    }
    public void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }
    public int sumOfLeftSubTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfLeftSubTree(root.left);
        int rightSum = sumOfLeftSubTree(root.right);
        return leftSum + rightSum + (root.left != null ? root.left.val : 0);
    }
    public int sumOfRightSubTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfRightSubTree(root.left);
        int rightSum = sumOfRightSubTree(root.right);
        return leftSum + rightSum + (root.right != null ? root.right.val : 0);
    }
         public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeNode ob = new BinaryTreeNode();
        Node root = ob.buildTree(nodes);
        System.out.println("Preorder traversal:");
        ob.preorder(root);
        System.out.println();
        System.out.println("Inorder traversal:");
        ob.inorder(root);
        System.out.println();
        System.out.println("Postorder traversal:");
        ob.postorder(root);
            System.out.println();
        System.out.println("Count of nodes:" + ob.countNodes(root));
        System.out.println("Sum of left subtree:" + ob.sumOfLeftSubTree(root));
        System.out.println("Sum of right subtree:" + ob.sumOfRightSubTree(root));
        

    }
}  