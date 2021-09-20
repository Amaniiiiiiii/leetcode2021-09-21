package zhan;

import java.util.ArrayList;
import java.util.List;

public class erchashuzhongxubianli {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(new erchashuzhongxubianli().inorderTraversal(treeNode).toString());
    }

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root==null) return ;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
