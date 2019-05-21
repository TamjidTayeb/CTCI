public class BST<T> {

    public class TreeNode<T> {
        TreeNode left;
        TreeNode right;
        int value;

        public TreeNode(int value) { this.value = value; }
    }

    TreeNode<T> root;

    public TreeNode insert(TreeNode node, int val) {
        if (this.root == null) {
            this.root=new TreeNode<>(val);
            return this.root;
        }
        if (node==null) return new TreeNode<>(val);
        if (val < node.value) node.left=insert(node.left,val);
        else node.right=insert(node.right,val);
        return node;
    }



    public static void main(String[] args) {
        int[] arr = {8,3,6,4,10,7,1,14,13};
        BST tree = new BST();
        for (int i: arr) {
            tree.insert(tree.root,i);
        }
//        tree.insert(tree.root,8);
//        tree.insert(tree.root,3);
//        tree.insert(tree.root,6);
//        tree.insert(tree.root,4);
//        tree.insert(tree.root,10);
//        tree.insert(tree.root,7);
//        tree.insert(tree.root,1);
//        tree.insert(tree.root,14);
//        tree.insert(tree.root,13);
        System.out.println("LOL");
    }

}
