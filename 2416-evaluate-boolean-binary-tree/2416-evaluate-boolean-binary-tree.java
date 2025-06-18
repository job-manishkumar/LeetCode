/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean evaluateTree(TreeNode root) {
        return evaluateBTree(root);
    }

    public boolean evaluateBTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateBTree(root.left) || evaluateBTree(root.right);
        }
        return evaluateBTree(root.left) && evaluateBTree(root.right);
    }
}
