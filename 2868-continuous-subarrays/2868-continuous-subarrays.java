     class Solution {
    public long continuousSubarrays(int[] nums) {
        long c=0;
        int n=nums.length;
        Deque<Integer>min=new LinkedList<>();
        Deque<Integer>max=new LinkedList<>();
        long ans=0;
        int l=0;
        for(int r=0;r<n;r++)
        {
            while(!min.isEmpty() && nums[min.peekLast()]>=nums[r])
            {
                min.pollLast();
            }
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[r])
            {
                max.pollLast();
            }
            min.offerLast(r);
            max.offerLast(r);
            while(nums[max.peekFirst()]-nums[min.peekFirst()] > 2)
            {
                l++;
                if(min.peekFirst()<l)
                min.pollFirst();
                if(max.peekFirst()<l)
                max.pollFirst();
            }
            ans+=r-l+1;
        }
        return ans;
    }
}