class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(k == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}