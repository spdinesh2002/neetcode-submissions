class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> kFinder = new HashMap();
        List<Integer> kNums = new ArrayList();
        for(int i=0;i<nums.length;i++){
            kFinder.computeIfAbsent(nums[i],j -> j=0);
            if(kFinder.containsKey(nums[i])) {
                kFinder.put(nums[i],kFinder.get(nums[i])+1);
            }
        }
        Map<Integer,Integer> FrequentMap = kFinder.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        int kNumsIter = 0;
        int kNumsArray[] = new int[k];
        for(Map.Entry<Integer,Integer> entry:FrequentMap.entrySet()){
            if(k!=0){
                kNumsArray[kNumsIter++] = entry.getKey();
                k-=1;
            }
        }
        return kNumsArray;
    }
}
