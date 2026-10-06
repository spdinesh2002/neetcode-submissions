class Solution {
    public boolean isPalindrome(String s) {
        String compareString1 = "";
        String compareString2 = "";
        String s1 = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < s1.length() ; i++){
            Character ch1 = Character.toLowerCase(s.charAt(i));
            Character ch2 = Character.toLowerCase(s1.charAt(i));
            if((ch1 > 64 && ch1 < 91) || (ch1 > 96 && ch1 < 123) || (ch1 > 47 && ch1 < 58) ){
                compareString1+=ch1;
            }
            if((ch2 > 64 && ch2 < 91) || (ch2 > 96 && ch2 < 123) || (ch2 > 47 && ch2 < 58) ){
                compareString2+=ch2;
            }
        }
        return compareString1.equals(compareString2);
    }
}
