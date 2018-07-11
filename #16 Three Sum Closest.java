class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int delta =0;
        int res =0;
        if(len <= 3){
            for (int x:nums){
                res += x;
            }
            return res;
        }
        res = nums[0]+nums[1]+nums[len-1];
        for(int i=0; i<len-2; i++){
            int lo = i+1;
            int hi = len - 1;
            int sum = 0;
             
            while(lo<hi){// sorted array: -4 -1 1 2
                sum = nums[i]+nums[lo]+nums[hi];// sum = -4-1+2  =-3
                if(Math.abs(res-target) > Math.abs(sum-target)){
                    res = sum;
                }
                if(nums[i]+nums[lo]+nums[hi] == target){
                    return nums[i]+nums[lo]+nums[hi];    
                }else if(nums[i]+nums[lo]+nums[hi] > target){
                    hi--;
                }
                else{ // lo = 2 
                    lo++;
                }
                // res = -3 sum = -4+1+2
                if((Math.abs(res-target) > Math.abs(nums[i]+nums[lo]+nums[hi]-target))&&(lo!=hi)){
                    res = nums[i]+nums[lo]+nums[hi];
                    }// res= -1
            }
        }
        return res;
    }
}