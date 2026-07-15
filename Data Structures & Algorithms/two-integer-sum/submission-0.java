class Solution {
    
    private void check_Input(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Invalid input.");
        }
    }

    public int[] twoSum(int[] nums, int target){
        check_Input(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
