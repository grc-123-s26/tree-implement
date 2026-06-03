public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);
    
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15,
                              new TreeNode<>(-3), 
                              new TreeNode<>(5, 
                                   null, 
                                   new TreeNode<>(22)
                              )
                            );

    TreeNode<String> stringRoot = new TreeNode<>("hello");
    
    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("sdkjf");
    stringRoot.left.right = new TreeNode<>("sdf");

    stringRoot.right = new TreeNode<>("dfgdfg",
                              new TreeNode<>("dfgdf"), 
                              new TreeNode<>("yo", 
                                   null, 
                                   new TreeNode<>("ey")
                              )
                            );

    // preorder(stringRoot);
    // postorder(root);
    // // inorder(root);
    // printGreaterThan(root, 1);  
    System.out.println(countNodes(root));                    
  }

  public static int countNodes(TreeNode<?> current) {
    //bool?iftrue:else;
    return current == null ? 0 : 1 + countNodes(current.left) + countNodes(current.right);
    // if(current == null) return 0;
    // return 1 + countNodes(current.left) + countNodes(current.right);
  }

  // Do a preorder traversal
  // but ONLY PRINT the the nodes that are greater than our threshold
  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;
    if (current.value > threshold) {
      System.out.println(current.value);
    }
    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode<?> current) {
    if(current == null) return; 

    System.out.println(current.value);
    preorder(current.left);
    preorder(current.right);
  }

  public static <E> void postorder(TreeNode<E> current) {
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    E myValue = current.value;
    System.out.println(myValue);
  }

  public static void inorder(TreeNode current) {
    if(current == null) return;
    inorder(current.left);
    System.out.println(current.value);
    inorder(current.right);
  }
}
