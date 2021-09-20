package zhan;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class erchashudehouxubianli {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root==null) return ;
        inorder(root.left,res);
        inorder(root.right,res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        //后序遍历的迭代写法 顶不住
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
