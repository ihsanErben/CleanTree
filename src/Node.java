
public class Node {
    int data;
    
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        System.out.println("Data: " + data);
        return "";
    }
    
    
}
