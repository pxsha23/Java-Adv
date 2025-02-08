import java.util.*;
public class ExpressionTree {
    public static class Node {
        char data;
        Node left, right;
        public Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public static void main(String[] args) {
        String str = "*+AB-CD";
        //PREFIX
        char[] s = str.toCharArray();
        System.out.print("String: ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
        Stack<Node> stack = new Stack<>();
        //REVERSE STRING
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            //System.out.println("INDEX " + i +" "+ "CHAR" +" "+ c +" ");
            if (isOperator(c)) {
                if (stack.size() >= 2) {
                    Node left = stack.pop();
                    Node right = stack.pop();
                    Node newNode = new Node(c);
                    newNode.left = left;
                    newNode.right = right;
                    stack.push(newNode);
                } else {
                    System.out.println("NO SPACE FOR " + c);
                    return;
                }
            } else {
                Node newNode = new Node(c);
                stack.push(newNode);
            }
        }
        if (stack.size() != 1) {
            //ONE NODE ONLY
            System.out.println("Invalid");
            return;
        }
        Node root = stack.pop();
        System.out.println("ROOT : "+ root.data);
        System.out.print("INORDER : ");
        inorderTraversal(root);
    }
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*';
    }
    private static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
}
