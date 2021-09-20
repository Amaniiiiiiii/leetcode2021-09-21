package hot100new;

public class no5 {
    public String longestPalindrome(String s) {
        //滑动窗口
        if(s.length()==1) return s;
        int left = 0;
        int max = 0;
        String ans="" ;
        for (int i = 0; i < s.length(); i++) {
            int right = s.length();
            while(!isPalindrome(s.substring(i,right)) && right>i){
                right--;
                System.out.println("i:"+i);
                System.out.println("right:" + right);
            }
            if(right-i>max){
                ans = s.substring(i,right);
                max = right-i;
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s){
        if(s.length()==1) return true;
        else{
            int i=0;
            int j= s.length()-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new no5().longestPalindrome("babad"));
        System.out.println(new no5().isPalindrome("baba"));
    }
}
