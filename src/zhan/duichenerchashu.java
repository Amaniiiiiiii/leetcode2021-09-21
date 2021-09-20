package zhan;

import com.sun.source.tree.Tree;

public class duichenerchashu {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root){
        return check(root,root);

    }

    public boolean check(TreeNode p,TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        return p.val==q.val && check(q.left,p.right) && check(q.right,p.left);
    }
}
