class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        Map<Integer,Integer> zeroCalcMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                int tempProd = 1;
                for(int j=0;j<nums.length;j++){
                    if(j!=i){
                    tempProd = tempProd * nums[j];
                    }
                }
                zeroCalcMap.put(i,tempProd);
            }
            prod = prod*nums[i];
        }
        int []result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                result[i] = zeroCalcMap.get(i);
            }
            else{
            result[i] = prod/nums[i];
            }
        }
        return result;
    }
}  
