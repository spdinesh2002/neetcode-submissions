class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 !=0){
            return false;
        }
        Map<Character, Character> paranthesisCheckMap = new HashMap<>();
        paranthesisCheckMap.put('{','}');
        paranthesisCheckMap.put('[',']');
        paranthesisCheckMap.put('(',')');
        Stack<Character> openParanthesisStack = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                openParanthesisStack.push(ch);
            }
            else if (openParanthesisStack.size() > 0 && (ch == '}' || ch == ']' || ch == ')')){
                char tempch = openParanthesisStack.pop();
                if(paranthesisCheckMap.get(tempch) != ch){
                    return false;
                }
            }
            else if(openParanthesisStack.size() == 0 && (ch == '}' || ch == ']' || ch == ')')){
                 return false;
            }

        }
        if(openParanthesisStack.size()>0){
            return false;
        }
        return true;
    }
}
