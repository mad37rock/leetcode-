class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[102];
        for (int i = 0; i < n; i++){
            res[nums[i] + 1]++;
        }
        for (int i = 0; i < 101; i++){
            res[i + 1] += res[i];
        }
        for (int i = 0; i < n; i++){
            nums[i] = res[nums[i]];
        }
        return nums;
    }
}
