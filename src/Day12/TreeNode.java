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

public class TreeNode {
    public static void main(String[] args) {
        Node nn = new Node(90);
        int root = nn.val;
        System.out.println(root);
        nn.left = new Node(80);
        nn.right = new Node(100);
        nn.left.left = new Node(70);
        nn.left.right = new Node(85);
        nn.right.left = new Node(95);
        nn.right.right = new Node(110);
        System.out.println("Left child: " + nn.left.val);
        System.out.println("Right child: " + nn.right.val);
        System.out.println("Left-left child: " + nn.left.left.val);
        System.out.println("Left-right child: " + nn.left.right.val);
        System.out.println("Right-left child: " + nn.right.left.val);
        System.out.println("Right-right child: " + nn.right.right.val);
    }
}



