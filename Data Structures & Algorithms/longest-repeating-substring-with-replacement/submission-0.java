class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxi=0;
        int left=0;
        int ans=0;
        for(int r=0;r < s.length();r++){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxi=Math.max(maxi,freq[ch-'A']);
            while((r-left+1)-maxi>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,r-left+1);
        }
        return ans;
    }
}
