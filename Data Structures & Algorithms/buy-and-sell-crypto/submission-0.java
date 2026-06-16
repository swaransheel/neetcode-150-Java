class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;
        for(int i:prices){
            if(i-min>ans){
                ans=i-min;
            }
            if(i<min){
                min=i;
            }
        }
        return ans;
    }
}
