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
                                          new TreeNode(22)
                                    )
                              );
    //preorder(root);
    //postorder(root);
    //inorder(root);
    printUnderThreshold(root, 11);
  }

  public static int countNodes(TreeNode current) {
    if (current == null) return 0;
    // count left subtree
    int leftCount = countNodes(current.left);
    // count right subtree
    int rightCount = countNodes(current.left);
    // add one for the root
    int totalCount = leftCount + rightCount + 1;
    return totalCount;
  }

  // Print ALL nodes the tree that have data strickly less than the threshold
  // nodes should be printed in pre-order
  public static void printUnderThreshold(TreeNode current, int threshold) {
    if (current == null) return;

    if (current.value < threshold) {
      System.out.println(current.value);
    }
    printUnderThreshold(current.left, threshold);
    printUnderThreshold(current.right, threshold);
  }

  public static void preorder(TreeNode current) {
    if(current == null) return;
    System.out.println(current.value);
    // explore.left
    preorder(current.left);
    // explore.right
    preorder(current.right);
  }

  public static void postorder(TreeNode current) {
    if(current == null) return;
    postorder(current.left);
    postorder(current.right);
    System.out.println(current.value);
  }

  public static void inorder(TreeNode current) {
    if(current == null) return;
    inorder(current.left);
    System.out.println(current.value);
    inorder(current.right);
  }
}
