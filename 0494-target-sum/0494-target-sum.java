class Solution {
public int findTargetSumWays(int[] nums, int target) 
    {
        return ways(nums,0,target);
    }
    public int ways(int[] nums,int index,int target)
    {
        if(index==nums.length)
        {
            return target==0?1:0;
        }
        return ways(nums,index+1,target-nums[index])+ways(nums,index+1,target+nums[index]);
    }
}