class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        while(i<numbers.length){
            int diff = target - numbers[i];
            int index = diff>=0 ? getElementIndex(numbers, diff,i+1) : normalfind(numbers, diff, i);
            if(index != -1 && diff == numbers[index]){
                return new int[]{i+1,index+1};
            }
            i+=1;
        }
        return new int[]{};
    }
    public int getElementIndex(int[] numbers, int target, int low){
        int high = numbers.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2; 
            if(numbers[mid] == target){
                return mid;
            }
            else if(numbers[mid] > target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public int normalfind(int[] numbers, int target, int low){
        for(int i=low+1;i<numbers.length;i++){
            if(target == numbers[i]){
                return i;
            }
        }
        return -1;
    }
}
