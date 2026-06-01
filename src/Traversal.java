public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right= new TreeNode(2);

    root.right = new TreeNode(15,
                             new TreeNode(-3),
                             new TreeNode(5,
                                null, 
                                 new TreeNode(22)
                               )
                              );

  //preorder(root);  
  //postorder(root);  
  inorder(root);                     


  }
  public static void preorder(TreeNode current){
    if(current == null) return;

    System.out.println(current.value);

    //explore left
    preorder(current.left);
    preorder(current.right);
  }

  public static void postorder(TreeNode current){
    if(current==null) return;
    postorder(current.left);
    postorder(current.right);
    System.out.println(current.value);
  }

  public static void inorder(TreeNode current){
    if(current==null) return;
    inorder(current.left);
    System.out.println(current.value);
    inorder(current.right);
  }
}
