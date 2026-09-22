class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Hashtable<Character,Integer> s1 = new Hashtable();
        Hashtable<Character,Integer> t1 = new Hashtable();
        for(int i=0; i<s.length();i++){
            s1.put(s.charAt(i),s1.containsKey(s.charAt(i)) ? s1.get(s.charAt(i)) + 1 : 1);
            t1.put(t.charAt(i),t1.containsKey(t.charAt(i)) ? t1.get(t.charAt(i)) + 1 : 1);
        }
        for(Map.Entry<Character,Integer> i: s1.entrySet()){
            if(!(i.getValue().equals(t1.get(i.getKey())))){
                return false;
            }
        }
        return true;
       
    }
}
