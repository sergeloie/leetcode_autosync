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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(0, new ArrayList<>());
        int level = 0;
        processTree(root, level, result);
        return result;
    }

    public void processTree(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(level, new ArrayList<>());
        }

        list.get(level).add(node.val);

        processTree(node.left, level + 1, list);
        processTree(node.right, level + 1, list);
    }
}
