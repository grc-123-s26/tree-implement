public class Traversal {
  public static void main(String[] args) {
{
      TreeNode root = new TreeNode(10);


      root.left = new TreeNode(9);
      root.left.left = new TreeNode(5);
      root.left.right = new TreeNode(2);


      root.right = new TreeNode(15,
                          new TreeNode( -3) ,
                        new TreeNode (5,
                        null,
                         new TreeNode(22)
          )
        );
    }

    public static void preorder(TreeNode current){
          if(current == null) return;
          System.out.println(current.value);
          preorder(current.left);
          preorder(current.right);
    


          public static void postorder(TreeNode current){
            if(current == null ) return;
            postorder(current.left);
            postorder(current.right);
            System.out.println(current.value);
          }
          //   System.out.println( )
          

          // preorder(current.left);
          // preorder(current.right);
    }


    //my BLIND attempt
    public static void exTraversal(int left, int right){
      this.left = left; 
      this.right = right;
    }

    
  }
}
