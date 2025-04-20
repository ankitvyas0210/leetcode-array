import java.util.Arrays;

public class twoSums {

    /*
    * @Author: Ankit Vyas
    * LeetCode challenge Link: https://leetcode.com/problems/two-sum/
    *
    * */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length - 1; i++){
            System.out.println("nums[i] = " + nums[i]);
            for(int j=i+1;j<=nums.length - 1; j++){

                int sum  = nums[i] + nums[j];
                if (sum == target){
                    result[0] = i;
                    result[1] = j;
                }

            }

        }
        return result;

    }

    public static void main(String[] args) {
        twoSum(new int[]{3,2,3}, 6);
    }
}
