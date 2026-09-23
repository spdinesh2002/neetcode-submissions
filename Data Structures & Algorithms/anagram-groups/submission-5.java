class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,List<String>> anagram = new Hashtable();
       List<List<String>> anagramList = new ArrayList();
        Map<String,List<String>> tempMap = new HashMap();
        for(String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String str = new String(ca);
            tempMap.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }
        for(Map.Entry<String,List<String>> map: tempMap.entrySet()){
            anagramList.add(map.getValue());
        }
        
        return anagramList;
    }
    
}
