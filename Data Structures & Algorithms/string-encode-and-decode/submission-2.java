class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_str = new StringBuilder();
        int s = strs.size();
        for(String str:strs){
            encoded_str.append(str).append("`");
        }
        return encoded_str.toString();
    }

    public List<String> decode(String str) {
        String []decoded_str = str.split("`",-1);
        List<String> decodedStr = new ArrayList<>(Arrays.asList(decoded_str));
        decodedStr.remove(decoded_str.length-1);
        return decodedStr;
    }
}
