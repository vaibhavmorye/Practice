class Node
{
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node root;
    BinarySearchTree()
    {
        root = null;
    }
    
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    void NonRecInsert(int key)
    {
        root = nonRecursiveInsert(key);
    }
    
    Node insertRec(Node root, int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(root.data < key)
        {
            root.left = insertRec(root.left, key);
        }else if(root.data > key)
        {
            root.right = insertRec(root.right, key);
        }
        
        return root;
    }
    
    Node nonRecursiveInsert(int key)
    {
        if(root == null)
        {
            root = new Node(key);
        }
        else
        {    
            Node prev = null;
            Node curr = root;
            while(curr !=null)
            {
                prev = curr;
                if(curr.data < key)
                    curr = curr.right;
                else
                    curr = curr.left;
            }
            if(prev.data < key)
                prev.right = new Node(key);
            else
                prev.left = new Node(key);
        }
        return root;
    }
    void inorder()
    {    
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root != null)
        {
            inorderRec(root.right);
            System.out.print(root.data+" ");
            inorderRec(root.left);
            
        }
    }
    
    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.NonRecInsert(50);
        tree.NonRecInsert(30);
        tree.NonRecInsert(20);
        tree.NonRecInsert(40);
        tree.NonRecInsert(70);
        tree.NonRecInsert(60);
        tree.NonRecInsert(80);
        
        tree.inorder();
        
    }
    
}
