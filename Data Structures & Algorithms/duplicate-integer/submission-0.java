class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if (mp.get(i)>1){
                return true;
            }
        }
        return false;
    }
}