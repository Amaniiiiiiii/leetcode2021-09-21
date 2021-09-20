package hot100new;

import java.util.LinkedList;
import java.util.Queue;

public class no104 {
    //广搜和深搜都可以

    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepthBFS(root.left);
            int rightHeight = maxDepthBFS(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

}
