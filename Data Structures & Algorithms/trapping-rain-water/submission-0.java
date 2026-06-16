class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] pre=new int[n+1];
        int[] suf=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=Math.max(pre[i-1],height[i-1]);
            suf[n-i]=Math.max(suf[n-i+1],height[n-i]);
        }
        int tot=0;
        for(int i=0;i<n;i++){
            int wat=Math.min(pre[i],suf[i])-height[i];
            if(wat>0){
                tot+=wat;
            }
        }
        return tot;
    }
}
