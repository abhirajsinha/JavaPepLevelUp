import java.util.*;

public class Bst {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int MaximumInBST(TreeNode root){
        TreeNode curr=root;
        while(curr!=null){
            curr=curr.right;
        }
        return curr.val;
    }

    public static int MinimumInBST(TreeNode root){
        TreeNode curr=root;
        while(curr!=null){
            curr=curr.left;
        }
        return curr.val;
    }
    
    public static boolean Find(TreeNode root,int data){
        TreeNode curr=root;

        while(curr!=null){
            if(root.val==data) return true;
            else if(root.val>data) curr=curr.left;
            else curr=curr.right;
        }
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr=root;
        
        while(curr!=null){
            if(curr.val>p.val && curr.val>q.val){
                curr=curr.left;
            }
            else if(curr.val<p.val && curr.val<q.val){
                curr=curr.right;
            }
            else{
                return curr;
            }
        }
        return null;
    }

    public static ArrayList<TreeNode> NodeToRootPath(TreeNode root, int data){
        ArrayList<TreeNode> Path=new ArrayList<TreeNode>();
        TreeNode curr = root;
        boolean flag=false;

        while(curr!=null){
            Path.add(curr);

            if(curr.val==data){
                flag=true;
                break;
            }
            else if(curr.val>data){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }

        if(!flag){// if we haven't find our data then Path is of no use 
            Path.clear();
        }
        return Path;
    }

    
}