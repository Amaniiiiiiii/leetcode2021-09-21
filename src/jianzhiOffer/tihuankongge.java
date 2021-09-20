package jianzhiOffer;

public class tihuankongge {
    public void replaceSpace_void(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(" ")){
               str.replace(i,i+1,"%20");
            }
        }
    }

    public String replaceSpace(StringBuffer str){
        StringBuffer ans = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(" ")){
                ans.append("%20");
            }else{
                ans.append(str.substring(i,i+1));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We are happy");
        System.out.println(new tihuankongge().replaceSpace(str));

    }
}
