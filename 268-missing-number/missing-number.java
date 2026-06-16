class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int exSum=n*(n+1)/2;

        int acSum=0;
        for(int num:nums){
            acSum=acSum+num;
        }
        return exSum-acSum;
    }
}