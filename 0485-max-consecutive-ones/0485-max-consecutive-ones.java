class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int max=0;
        for(int i:nums){
            if(i==1)
            {
                maxi++;
                max=Math.max(maxi,max);
            }
            else{
                maxi=0;
            }
        }
        return max;
    }
}