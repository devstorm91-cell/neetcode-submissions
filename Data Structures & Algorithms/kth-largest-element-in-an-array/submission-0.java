class Solution {

    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, target);
    }

    private int quickSelect(int[] nums, int left, int right, int target) {
        int pivot = partition(nums, left, right);
        if (pivot == target)
            return nums[pivot];
        if (pivot > target)
            return quickSelect(nums, left, pivot - 1, target);
        return quickSelect(nums, pivot + 1, right, target);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[right];
        nums[right] = temp;

        return i;
    }
}