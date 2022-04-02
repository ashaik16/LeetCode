class Solution {
            List<Integer> tree = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

     if(root==null)
         return tree;
                 tree.add(root.val);
                 preorderTraversal(root.left);
                  preorderTraversal(root.right); 
        return tree;
    }
}
