package medium;

/**
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 * <p>
 * The distance between two adjacent cells is 1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * <p>
 * [<p>
 * [0,0,0],
 * <p>
 * [0,1,0],
 * <p>
 * [0,0,0]
 * <p>]
 * <p>
 * Output:
 * <p>
 * [
 * <p>[0,0,0],
 * <p>
 * [0,1,0],
 * <p>
 * [0,0,0]<p>]
 * <p>
 * Example 2:
 * <p>
 * Input:
 * <p>
 * [<p>[0,0,0],<p>
 * [0,1,0],<p>
 * [1,1,1]<p>]
 * <p>
 * Output:<p>
 * [<p>[0,0,0],<p>
 * [0,1,0],<p>
 * [1,2,1]<p>]
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of elements of the given matrix will not exceed 10,000.
 * There are at least one 0 in the given matrix.
 * The cells are adjacent in only four directions: up, down, left and right.
 */
public class Matrix01 {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 2};
        System.out.println(find132pattern(a));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            small = Math.min(small, nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i] && small < nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
