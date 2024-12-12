class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int x:gifts)
        pq.add(x);
        while(!pq.isEmpty() && k>0)
        {
            int val=pq.poll();
            pq.offer((int)Math.sqrt(val));
            k--;
        }
        for(int x:pq)
        sum+=x;
        return sum;
    }
}