public class Traversal {
  public static void main(String[] args) {
      TreeNode root = new TreeNode(10, null, null);
      root.left = new TreeNode(9, null, null);
      root.left.left = new TreeNode(5, null, null);
      root.left.right = new TreeNode(2, null, null);

      root.right = new TreeNode(15, 
                                new TreeNode(-3, null, null), 
                                new TreeNode(5, 
                                    null, 
                                    new TreeNode(22, null, null)
                                )
                              );
    //preorder(root);
    //postOrder(root);
    inOrder(root);

  }

  public static void preorder (TreeNode current)
  {
    if(current == null) return; 
    System.out.println(current.value); 
    preorder(current.left);
    preorder(current.right); 
  }

  public static void postOrder (TreeNode current)
  {
      if(current == null) return; 
      postOrder(current.left);
      postOrder(current.right);
      System.out.println(current.value);

  }
   
  public static void inOrder(TreeNode current)
  {
    if(current == null) return;
    inOrder(current.left);
    System.out.println(current.value);
    inOrder(current.right);
  }

}
 