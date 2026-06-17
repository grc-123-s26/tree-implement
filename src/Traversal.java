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
    //inOrder(root);
    printUnderThreshold(root, 5);
    
  }

public static int countNodes(TreeNode current){
  //count left subtree
if(current== null) return 0; 
int leftCount = countNodes(current.left);
//count right subtree
int rightCount = countNodes(current.right);
//add one for the root
int totalCount = leftCount + rightCount + 1;
return totalCount;

}
// Print All nodes the tree that has data strictly less the threshold
//nodes should be printed pre-order
  public static void printUnderThreshold(TreeNode current, int threshold){
     if(current == null) return;
     if(current.value < threshold){
    System.out.println(current.value);
     }
    printUnderThreshold(current.left,threshold);
    printUnderThreshold(current.right,threshold);
    return;
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
