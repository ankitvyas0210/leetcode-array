public class twoSums {

    /*
    * @Author: Ankit Vyas
    * LeetCode challenge Link: https://leetcode.com/problems/two-sum/
    *
    * */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] < target){
                int sum  = nums[i] + nums[i+1];
                if (sum == target){
                    result[0] = i;
                    result[1] = i+1;
                }
            }
        }

        return result;
    }
}
