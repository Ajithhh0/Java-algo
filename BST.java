import java.util.Stack;


      class Node{
        int data;
        Node left,right;

        public Node(int item){
            data = item;
            left = right =null;
        }
    }
    public class BST {
    Node root;
    void iterativePreorder(){
        iterativePreorder(root);
    }
    void iterativePreorder(Node node){
        if(node == null){
            return;
        }
        Stack<Node>nodeStack = new Stack<>();
        nodeStack.push(root);
        while(nodeStack.empty() == false){
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data+" ");
            nodeStack.pop();
            if(mynode.right != null){
                nodeStack.push(mynode.right);
            }
            if(mynode.left != null){
                nodeStack.push(mynode.left);
            }
        }
       }
       void iterativeInorder(Node node){
        if(node == null)
        return ;
        iterativeInorder(node.left);
        System.out.print(node.data+ " ");
        iterativeInorder(node.right);
       }
       void iterativePostorder(Node node){
        if(node == null)
        return;
        iterativePostorder(node.left);
        iterativePostorder(node.right);
        System.out.print(node.data+ " ");
       }
       public static void main(String[] args){

        BST tree = new BST();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        System.out.println("\n");
        tree.iterativePreorder();
        System.out.println("\n");
        tree.iterativeInorder(null);
        System.out.println("\n");
        tree.iterativePostorder(null);

       }
 }

