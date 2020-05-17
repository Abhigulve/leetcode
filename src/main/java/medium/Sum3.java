package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sumNumber = new ArrayList<>();
        Arrays.sort(nums);
        //-4 -1 -1 0 1 2 4
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            if (nums[k] == nums[k + 1]) continue;
            while (i < j) {
                int sum = nums[j] + nums[i] + nums[k];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[j]);
                    temp.add(nums[i]);
                    temp.add(nums[k]);
                    sumNumber.add(temp);
                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return sumNumber;
    }
}
