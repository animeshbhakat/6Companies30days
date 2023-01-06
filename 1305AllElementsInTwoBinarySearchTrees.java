/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorderExecution(TreeNode root, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        inorderExecution(root.left, result);
        result.add(root.val);
        inorderExecution(root.right, result);

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        inorderExecution(root1, result1);
        inorderExecution(root2, result2);

        List<Integer> answer = new ArrayList<>();
        int i= 0, j=0;
        while(i<result1.size() && j< result2.size()){
            if(result1.get(i) < result2.get(j)){
                answer.add(result1.get(i++));
            }
            else{
                answer.add(result2.get(j++));
            }
        }
        while(i < result1.size()){
            answer.add(result1.get(i++));
        }
        while(j < result2.size()){
            answer.add(result2.get(j++));
        }

        return answer;
    }
}
