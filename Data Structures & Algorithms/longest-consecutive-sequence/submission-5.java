class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int k = 0;
        List<Integer> longestConsecutive = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums.length){
               if(nums[i]==nums[i+1]){
                continue;
                }
                else if(nums[i]+1==nums[i+1]){
                     k+=1;
                     continue;
                }
            }
            longestConsecutive.add(k);
            k = 0;
        }
        Collections.sort(longestConsecutive);
        return longestConsecutive.get(longestConsecutive.size()-1)+1;
    }
}
