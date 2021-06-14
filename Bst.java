import java.nio.file.Path;
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

        if(!flag){
            Path.clear();
        }
        return Path;
    }
}