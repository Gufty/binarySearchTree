public class TestBST
{
    public static void main(String[] args)
    {
        test1();
        //test2();
    }
    
    public static void test1()
    {
        BST binTree= new BST();
        
        System.out.println("Empty Tree");
        System.out.println("nodes: " + binTree.inOrderTraversal());
        
        binTree.add(10);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(13);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(11);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(6);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(19);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(3);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(1);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(23);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        binTree.add(16);
        System.out.println("nodes: " + binTree.inOrderTraversal());
        System.out.println(binTree.count);
        System.out.println("Sample Tree");
        System.out.println("nodes: " + binTree.inOrderTraversal());
    }
    
    // public static void test2()
    // {
    //     BST binTree= new BST();
        
    //     System.out.println("Empty Tree");
    //     System.out.println("nodes: " + binTree.inOrderTraversal());
        
    //     binTree.add(6);
    //     binTree.add(1);
    //     binTree.add(10);
    //     binTree.add(12);
    //     binTree.add(9);
    //     binTree.add(13);
    //     System.out.println(binTree.count);
                       
    //     System.out.println("Sample Tree");
    //     System.out.println("nodes: " + binTree.inOrderTraversal());
    // }
}
    
