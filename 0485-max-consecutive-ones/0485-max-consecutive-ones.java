class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int max=0;
        for(int i:nums){
            if(i==1)
            {
                maxi++;
            }
            if(maxi>max)
            {
                max=maxi;
            }
            if(i==0){
                maxi=0;
            }
        }
        return max;
    }
}