
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> responseSum = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> dupIdentificationList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int numberToFind = 0 - (nums[i]+nums[j]);
                int numberToFindIndex = binarySearch(numberToFind,i,j,nums);
                if(numberToFindIndex != -1){
                   int[] valueArr = {nums[i], nums[j], nums[numberToFindIndex] };
                   Arrays.sort(valueArr);
                   int dupIdValue = valueArr[0]*100 + valueArr[1]*10 + valueArr[2];
                   if(!dupIdentificationList.contains(dupIdValue)){
                    dupIdentificationList.add(dupIdValue);
        responseSum.add(Arrays.asList(nums[i],nums[j],nums[numberToFindIndex]));
                   }
                }

            }
        }
               return responseSum;
    }
    public static int binarySearch(int number, int i, int j, int[] nums){
        int first= 0;
        int last = nums.length-1;
        while (first<=last){
            int mid = first + ((last - first)/2);
            if(nums[mid] == number && mid != i && mid != j){
                return mid;
            }
            else if(nums[mid]>number){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return -1;
    }
}
