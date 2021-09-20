package huisu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.put;

//这道题中所有情况都是可行的，所以回溯不存在不可用的解
public class dianhuahaoma {
    public List<String> letterCombinations(String digits){
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }

        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }

    public void backtrack (List<String> combinations,Map<Character,String> phonemap,String digits,int index,StringBuffer combination){
        if(index==digits.length()) combinations.add(combination.toString());
        else {
            String letters = phonemap.get(digits.charAt(index));
            for (int i = 0; i < letters.length(); i++) {
                combination.append(letters.charAt(i));
                backtrack(combinations,phonemap,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new dianhuahaoma().letterCombinations("234"));
    }
}
