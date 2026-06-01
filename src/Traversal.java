public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);
    
    root.right = new TreeNode(15,
                              new TreeNode(-3), 
                              new TreeNode(5,
                                            null,
                                            new TreeNode (22)));
                                            
    //preorder(root);
    //postOrder(root);
    inOrder(root);

    
  }

  public static void preorder(TreeNode current){
    if(current == null) return;
    System.out.println(current.value);
    preorder(current.left);
    preorder(current.right);
    return; 
  }

  public static void postOrder(TreeNode current){
    if(current==null) return;
    postOrder(current.left);
    postOrder(current.right);
    System.out.println(current.value);
    return;
    
  }
  public static void inOrder(TreeNode current){
    if(current==null) return;
    inOrder(current.left);
    System.out.println(current.value);
    inOrder(current.right);
    return;
  }


}
