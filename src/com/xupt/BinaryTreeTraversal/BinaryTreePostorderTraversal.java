package com.xupt.BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

//二叉树的后序遍历
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    private void helper(TreeNode root,List list){
        if(root==null){
            return;
        }
        helper(root.left,list);
        helper(root.right,list);
        list.add(root.val);
    }
}
