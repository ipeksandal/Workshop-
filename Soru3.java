import java.util.LinkedList;
import java.util.Queue;
public class Soru3 {
    private int data;
    private  Node left, right;
    public Soru3(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    private Node root;
    public Node Tree(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int root = (start + end) / 2;
        Node node = new Node(arr[root]);
        node.left = Tree(arr, start, root -1);
        node.right = Tree(arr, root + 1, end);
        return node;
    }
    public int height(Node node){
        if(node == null)
            return 0;
        else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    public void print(){
        System.out.println("Seviyelerine göre oluşturulan ağaç : ");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            for (int i = 0 ; i < levelSize; i++){
                Node current = queue.poll();
                if (current != null){
                    System.out.println(current.data + " ");
                    if (current.left != null)
                        queue.add(current.left);
                    if (current.right != null)
                        queue.add(current.right);
                }
            }
            System.out.println();
        }
    }
    public void printRoot(){
        if (root != null)
            System.out.println("Ağacın kökü : " + root.data);
        else
            System.out.println("Ağaç boş!");
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        Tree tree = new Tree();
        int l = arr.length;
        tree.root = tree.Tree(arr, 0, l - 1);
        tree.print();
        //tree.print(tree.root, 0);
        int height = tree.height(tree.root);
        System.out.println("Ağacın yüksekliği : " + height);
        tree.printRoot();
    }
}

