class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i:nums){
         map.add(i);
        }
        int longest=0;
        for(int i:nums){
         if(!map.contains(i-1)){
            int curr=i;
            int len=1;
            while(map.contains(curr+1)){
               curr++;
               len++;
            }
            longest=Math.max(longest,len);
         }
        }
        return longest;
    }
}
