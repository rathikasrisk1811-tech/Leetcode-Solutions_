class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n1 = nums.length;
		int[] result = new int[n1];
		for(int i=0;i<n;i++)
		{
			result[2*i] = nums[i];
			result[2*i+1]=nums[n+i];
		}
		return result;
	}
}
