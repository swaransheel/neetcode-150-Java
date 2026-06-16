class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int maxi=0;
        while(start<end){
            maxi=Math.max(maxi,(end-start)*Math.min(heights[start],heights[end]));
            if(heights[start]>heights[end]){
                end--;
            }else{
                start++;
            }
        }
        return maxi;
    }
}
