class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> mp=new HashMap<>();
     for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
     }
     PriorityQueue<Integer> pq=new PriorityQueue((a,b)->mp.get(b)-mp.get(a)); 
     int[] ans=new int[k]; 
     pq.addAll(mp.keySet());
     for(int i=0;i<k;i++){
        ans[i]=pq.poll();
     }
     return ans;
    }
}
