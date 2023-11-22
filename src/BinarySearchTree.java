
public class BinarySearchTree {
    Node root;
    
    public void addNode(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }else{
            Node tmp = root;
            Node parent = root;
            while(tmp != null){
                parent = tmp;
                if(data < tmp.data){
                    tmp = tmp.left;
                }else if(data > tmp.data){
                    tmp = tmp.right;
                }
                
                if(data < parent.data){
                    parent.left = newNode;
                }else if(data > parent.data){
                    parent.right = newNode;
                }
            }
        }
    }
    
    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + "  ");
            inOrder(root.right);
        }
    }
    
    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "  ");
        }
    }
    
    public Node search(int data){
        Node tmp = root;
        while(tmp != null){
            if(data < tmp.data){
                tmp = tmp.left;
            }else if(data > tmp.data){
                tmp = tmp.right;
            }else{
                return tmp;
            }
        }
        return null;
    }
    
    public Node minSearch(Node tmp){
        if(tmp.left != null){
            return minSearch(tmp.left);
        }
        return (tmp);
    }
    
    public int size(Node root){
        if(root == null){
            return 0;
        }else{
            return (size(root.left) + size(root.right) + 1);
        }
    }
    
    public int height(Node root){
        if(root == null){
            return -1;
        }else{
            int sol = 0;
            int sag = 0;
            
            sol = height(root.left);
            sag = height(root.right);
            
            if(sol>sag){
                return (sol +1);
            }else{
                return (sag + 1);
            }
        }   
    }
    
    public Node searchRecursive(Node root, int data){
        if(root == null){
            return null;
        }else{
            if(root.data == data){
                return root;
            }else if(data < root.data){
                return searchRecursive(root.left, data);
            }else{
                return searchRecursive(root.right, data);
            }
        }
    }
    
    public void deleteMin(){
        Node tmp = root;
        
        if(root == null){
            System.out.println("--- EMPTY ---");
            return;
        }
        
        Node parent = null;
        while(tmp.left != null){
            parent = tmp;
            tmp = tmp.left;
        }
        
        if(tmp == root){
            root = root.right;
        }
        
        parent.left = null;
    }
            
}
