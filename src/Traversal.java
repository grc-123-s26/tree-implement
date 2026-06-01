public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15, new TreeNode(-3), new TreeNode(5, null, new TreeNode(22)));

    inOrder(root);
  }

  public static void preOrder(TreeNode current) {
    if (current == null) return;

    System.out.println(current.value);
    preOrder(current.left);
    preOrder(current.right);
  } 

  public static void postOrder(TreeNode current) {
    if (current == null) return;

    postOrder(current.left);
    postOrder(current.right);
    System.out.println(current.value);
  }

  public static void inOrder(TreeNode current) {
    if (current == null) return;

    inOrder(current.left);
    System.out.println(current.value);
    inOrder(current.right);
  }
}
