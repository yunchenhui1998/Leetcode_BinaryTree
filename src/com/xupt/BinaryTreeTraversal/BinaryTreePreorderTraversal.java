package com.xupt.BinaryTreeTraversal;
//二叉树的前序遍历

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    private void helper(TreeNode root,List list){
        if(root==null){
            return;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}
