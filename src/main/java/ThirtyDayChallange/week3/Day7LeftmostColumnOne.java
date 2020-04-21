package ThirtyDayChallange.week3;

import java.util.ArrayList;
import java.util.List;

interface BinaryMatrix {
    default int get(int x, int y) {
        return 0;
    }

    default List<Integer> dimensions() {
        return new ArrayList<>();
    }
};

/**
 * (This problem is an interactive problem.)
 * <p>
 * A binary matrix means that all elements are 0 or 1. For each individual row of the matrix, this row is sorted in non-decreasing order.
 * <p>
 * Given a row-sorted binary matrix binaryMatrix, return leftmost column index(0-indexed) with at least a 1 in it. If such index doesn't exist, return -1.
 * <p>
 * You can't access the Binary Matrix directly.  You may only access the matrix using a BinaryMatrix interface:
 * <p>
 * BinaryMatrix.get(x, y) returns the element of the matrix at index (x, y) (0-indexed).
 * BinaryMatrix.dimensions() returns a list of 2 elements [n, m], which means the matrix is n * m.
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.  Also, any solutions that attempt to circumvent the judge will result in disqualification.
 * <p>
 * For custom testing purposes you're given the binary matrix mat as input in the following four examples. You will not have access the binary matrix directly.
 */

/**
 * These codes are part of Leetcode 30 day coding challenges
 * Link:  https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/
 * Question Link: https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3306/
 */
public class Day7LeftmostColumnOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        if (binaryMatrix == null) return -1;
        List<Integer> dimension = binaryMatrix.dimensions();

        if (dimension.get(0) == 0) return -1;

        int i = dimension.get(0) - 1, j = dimension.get(1) - 1;

        while (i >= 0 && j >= 0) {
            if (binaryMatrix.get(i, j) == 0) i--;
            else j--;
        }

        return j == dimension.get(1) - 1 ? -1 : j + 1;
    }
}
