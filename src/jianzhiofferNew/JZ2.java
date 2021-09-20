package jianzhiofferNew;

public class JZ2 {
    public String replaceSpace (String s) {
        // write code here
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals(" ")){
                ans.append("%20");
            }
            else ans.append(s.charAt(i));
        }

        return new String(ans);
    }
}
