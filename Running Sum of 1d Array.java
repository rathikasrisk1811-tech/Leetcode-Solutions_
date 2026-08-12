class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
		int[] nums1 = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum+=nums[i];
			nums1[i] = sum;
		}
		return nums1;
	}
}
