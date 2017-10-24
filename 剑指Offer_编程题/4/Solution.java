/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
	题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/

/*
	思路：采用递归，从中序遍历里找到和前序遍历一样值的节点即为根节点，
	在中序遍历中该根节点左边为其左子树，右边为右子树，对该根节点进行分别递归得到左子树和右子树。
*/
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }
    
    private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
        if(startPre > endPre || startIn > endIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        
        for(int i = startIn; i <= endIn; i++){
    	    //找到中序遍历中的根节点
            if(in[i] == pre[startPre]){
                //递归遍历根节点的左子树,i-startIn是左子树的大小
                root.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
                //递归遍历根节点的右子树
                root.right = reConstructBinaryTree(pre, startPre+1+i-startIn, endPre, in, i+1, endIn);
            }
		}
        return root;
    }
}