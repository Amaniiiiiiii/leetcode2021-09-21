package differentSort;

public class ali {
    public static void main(String[] args) {
        System.out.println(MyReverse("welcome to alibaba!"));
    }
    public static String MyReverse(String str){
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while(i<length){
            int start = i;
            while(i<length && str.charAt(i)!=' '){
                i ++ ;
            }
            for(int j = start ;j<i;j++){
                sb.append(str.charAt(start+i-1-j));
            }
            while(i<length && str.charAt(i)== ' '){
                i++;
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
