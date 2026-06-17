public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

//TreeNode myNode = new TreeNode(8,null someOtherNode);
    public TreeNode(int value, TreeNode left, TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

public TreeNode(int value){
    this.value = value;
    
}

public TreeNode (TreeNode left, int value){
    this.value = value;
    this.left = left; 
}

  public TreeNode (int value, TreeNode right){
    this.value = value;
    this.right = right; 
}
  
}