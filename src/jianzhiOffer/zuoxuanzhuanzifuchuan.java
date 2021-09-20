package jianzhiOffer;

public class zuoxuanzhuanzifuchuan {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0 || str.length()==1) return str;
        n = n%str.length();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(i+n+1>str.length()) ans = ans + str.substring(i+n-str.length(),i+n+1-str.length());
            else ans = ans + str.substring(i+n,i+n+1);
        }
        return ans;
    }

    public String LeftRotateString1(String str,int n){
        if(n > str.length())
            return str;

        String s = str.substring(n,str.length()) + str.substring(0,n);

        return s;
    }

    public static void main(String[] args) {
        //System.out.println("123".substring(0,1));
        System.out.println(new zuoxuanzhuanzifuchuan().LeftRotateString1("abcXYZdef",10));
    }
}
