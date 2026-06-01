public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    //left subtree
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    //right subtree
    root.right = new TreeNode(15, new TreeNode(-3), new TreeNode(5, null, new TreeNode(22)));

    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);
  }

  public static void preorder(TreeNode current){
    if(current == null) return;
    System.out.print(current.value + " ");

    //explore left
    preorder(current.left);

    //explore right
    preorder(current.right);

  }

  public static void postorder(TreeNode current){
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    System.out.print(current.value + " ");
  }

  public static void inorder(TreeNode current){
    if(current == null) return;
    inorder(current.left);
    System.out.print(current.value + " ");
    inorder(current.right);
  }
}
