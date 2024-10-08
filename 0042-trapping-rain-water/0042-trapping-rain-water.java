class Solution {
    public int trap(int[] height) {
       int ans=0;
       int lmax=-9999,rmax=-9999;
       int l=0;
       int r=height.length-1;
       while(l<r)
       {
        lmax=Math.max(height[l],lmax);
        rmax=Math.max(height[r],rmax);
        ans+=lmax<rmax?lmax-height[l++]:rmax-height[r--];
       } 
       return ans;
    }
}