public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    //left subtree
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    //right subtree
    root.right = new TreeNode(15, new TreeNode(-3), new TreeNode(5, null, new TreeNode(22)));

    /*preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);*/

    printUnderThreshold(root, 11);
    System.out.println(countNodes(root));
  }

  //print ALL nodes in the tree that have data that is less than the threshold
  public static void printUnderThreshold(TreeNode current, int threshold){
    if(current == null) return;
    if(current.value<threshold){
      System.out.println(current.value);
    }
    printUnderThreshold(current.left, threshold);
    printUnderThreshold(current.right, threshold);
  }

  public static int countNodes(TreeNode current){
    if(current == null) return 0;
    //count left subtree
    int leftCount = countNodes(current.left);
    //count right subtree
    int rightCount = countNodes(current.right);
    //add one for the root
    return leftCount + rightCount + 1;
  }

  public static void preorder(TreeNode current){
    if(current == null) return;
    System.out.print(current.value + " ");
    preorder(current.left);
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
