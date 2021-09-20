package jianzhiOffer;

public class fanzhuandancixulie {
    public String ReverseSentence(String str) {
        if(str.length()==0 || str.length()==1) return str;
        String strReverse = new StringBuffer(str).reverse().toString();

        int p = 0;
        String ans = "";
        for (int i = 0; i < strReverse.length(); i++) {
            if(strReverse.substring(i,i+1).equals(" ")){
                ans = ans + new StringBuffer(strReverse.substring(p,i)).reverse().toString();
                ans = ans + " ";
                p = i+1;
            }else if(i==strReverse.length()-1){
                ans = ans + new StringBuffer(strReverse.substring(p,i+1)).reverse().toString();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new fanzhuandancixulie().ReverseSentence("nowcoder. a am I"));
    }
}
