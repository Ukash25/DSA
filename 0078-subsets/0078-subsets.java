class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> a=new ArrayList();
        solve(nums,0,a,res);
        return res;       
    }
    public void solve(int nums[],int start,List<Integer> a,List<List<Integer>>res)
    {
        if(nums.length==start)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        solve(nums,start+1,a,res);
        a.add(nums[start]);
        solve(nums,start+1,a,res);
        a.remove(a.size()-1);
    }
}
