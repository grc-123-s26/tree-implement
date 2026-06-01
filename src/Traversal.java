public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15, new TreeNode(-3), new TreeNode(5, null, new TreeNode(22)));
    
    //root.right.left = new TreeNode(-3);
    //System.out.println(root.right.right.right.data);

    preorder(root);
    System.out.println();

    postorder(root);
    System.out.println();

    inorder(root);
  }

  public static void preorder(TreeNode current)
  {
    if(current == null) return;
    System.out.println(current.data);
    preorder(current.left);
    preorder(current.right);
  }

  public static void postorder(TreeNode current)
  {
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    System.out.println(current.data);
  }

  public static void inorder(TreeNode current)
  {
    if(current == null) return;
    inorder(current.left);
    System.out.println(current.data);
    inorder(current.right);
  }
}
