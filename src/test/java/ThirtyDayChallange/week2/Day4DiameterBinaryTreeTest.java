package ThirtyDayChallange.week2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day4DiameterBinaryTreeTest {
    Day4DiameterBinaryTree ob = new Day4DiameterBinaryTree();

    @Test
    public void diameterOfBinaryTree() {
        Day4DiameterBinaryTree.TreeNode root = new Day4DiameterBinaryTree.TreeNode(1);
        root.left = getNode(2);
        root.right = getNode(3);
        root.left.left = getNode(4);
        root.left.right = getNode(5);
        root.left.left.left = getNode(6);
        root.left.right.left = getNode(7);
        Assert.assertEquals(5, ob.diameterOfBinaryTree(root));
    }

    private Day4DiameterBinaryTree.TreeNode getNode(int x) {
        return new Day4DiameterBinaryTree.TreeNode(x);
    }
}