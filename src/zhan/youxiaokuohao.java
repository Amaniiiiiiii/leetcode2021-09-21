package zhan;

import java.util.HashMap;
import java.util.Stack;

public class youxiaokuohao {
    public static void main(String[] args) {
        System.out.println(new youxiaokuohao().isValid("{[]}"));
    }

    public boolean isValid(String s){
        if(s.length()%2==1) return false;
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            if(map.containsKey(s.charAt(i))){
                char top = stack.isEmpty()? '-':stack.pop();
                if(top!=map.get(s.charAt(i))) return false;
            }
        }

        return stack.isEmpty();
    }
}
