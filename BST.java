public class BST {
    private BSTNode root;
    int count;
    public BST() {
        root = null;
    }

    // add element to tree in the proper location
    public void add(Integer value) {
        // implementation required
        if (root == null) {
            root = new BSTNode(value);
            return;
        }

        addNode(root, value);
    }

    // recursive helper method that adds the new node in the appropriate location
    private void addNode(BSTNode rootNode, Integer value) {
        // implementation required
        count++; 
        if (value < rootNode.nodeValue()) {
            if (rootNode.leftChild() != null) {
                addNode(rootNode.leftChild(), value);
            }
            else
            rootNode.setLeftChild(new BSTNode(value));
        }

        else if (value >= rootNode.nodeValue()) {
            if (rootNode.rightChild() != null) {
                addNode(rootNode.rightChild(), value);
            }
            else
            rootNode.setRightChild(new BSTNode(value));
        }
        
    }

    // returns the inorder traversal of the BST as a String
    public String inOrderTraversal() {
        if(root == null)
            return "";
            //check if there is only the root node
        return inOrderHelp(root);
    }

    public String inOrderHelp(BSTNode rootNode) {
        String a = "";
        BSTNode leftPointer = rootNode.leftChild();
        if(leftPointer != null){
            a += inOrderHelp(leftPointer);
        }
        a += rootNode.nodeValue() + " ";
        BSTNode rightPointer = rootNode.rightChild();
        if(rightPointer != null)
            a += inOrderHelp(rightPointer);
        return a;
    }

   
}
