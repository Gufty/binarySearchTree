/**
 * @author (your name)
 * @version (a version number or a date)
 */

 public class BSTNode
 {
     private Integer value;
     private BSTNode leftChild;
     private BSTNode rightChild;
     
     //constructor - requires value of type Integer and both children if they exist or null
     public BSTNode(Integer initValue, BSTNode initLeftChild, BSTNode initRightChild)
     {
         value = initValue;
         leftChild = initLeftChild;
         rightChild = initRightChild;
     }
     
     //constructor - requires value of type Integer and sets both children to null
     public BSTNode(Integer initValue){
        value = initValue;
        leftChild = null;
        rightChild = null;
     }
     //returns the value in the current TreeNode
     public Integer nodeValue()
     {
         return value;
     }
 
     //returns the TreeNode of the left child if it exists or null if no left child
     public BSTNode leftChild()
     {
        return (leftChild != null) ? leftChild : null; 
     }
     
     //returns the TreeNode of the right child if it exists or null if no right child
     public BSTNode rightChild()
     {
        return (rightChild != null) ? rightChild : null; 
    }
     
     //change the current value of the node
     public void setNodeValue(Integer newValue)
     {
         value = newValue;
     }
     //change the current left child node
     public void setLeftChild(BSTNode newLeft)
     {
        leftChild = newLeft;
     }
 
     //change the current right child node
     public void setRightChild(BSTNode newRight)
     {
         rightChild = newRight;
     }
 }

 