package Trees;

public class MirrorTree {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,3};
        BST tree = new BST();
        TreeNode root = tree.buildBST(arr);
        TreeNode root1 = tree.ArraytoBST(arr, 0, arr.length-1);
        //tree.isMirrorTree(root);
//        tree.preOrder(root);
        tree.preOrder(root1);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.left = null;
    }
}
class BST{
    // Converting given sorted array into BST
    TreeNode ArraytoBST(int[] arr, int start, int end){
        if(start > end) return  null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = ArraytoBST(arr, start, mid-1);
        root.right = ArraytoBST(arr, mid+1, end);
        return root;
    }
    // Adding a Node into BST.
    TreeNode addNodes(TreeNode root, int val){
        // if root is null create a Node.
        if(root == null) return new TreeNode(val);

        // if val is lesser than root add it to left child
        if(val < root.val) root.left = addNodes(root.left, val);
        // if val is greater than root add it to right child
        else if(val > root.val) root.right  =addNodes(root.right, val);

        return root;
    }
    // Building BST using Add Node Funciton by Passing an Array of Integers.
    TreeNode buildBST(int[] arr){
        TreeNode root  = null;
        for (int i = 0; i < arr.length; i++) {
            root = addNodes(root, arr[i]);
        }
        return root;
    }

//    Preorder Traversal Function
    void preOrder(TreeNode root){
        if(root ==  null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
//    Inorder Traversal Function
    void inOrder(TreeNode root){
        if(root == null ) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    void isMirrorTree(TreeNode root){
        System.out.println(isMirror(root, root)== true ? "YES" : "NO");
    }

    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 ==  null&& root2==null) return  true;
        if(root1.val == root2.val && root2!=null && root1!=null){
            return (isMirror(root1.left, root2.right) && isMirror(root2.left, root1.right));
        }
        return  false;
    }
}
