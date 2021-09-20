package zhan;

import java.util.ArrayList;
import java.util.List;

public class erchashudeqianxubianli {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root==null) return ;
        res.add(root.val);
        inorder(root.left,res);
        inorder(root.right,res);
    }
}
