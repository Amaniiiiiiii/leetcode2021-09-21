package jianzhiOffer;

public class bashuzupaichengzuixiaodeshu {
    public String PrintMinNumberMy(int [] numbers){
        int min=0;
        for (int i = 0; i < numbers.length-1; i++) {
            min = compare(numbers[i],numbers[i+1]);
        }
        return null;
    }

        public String PrintMinNumber(int [] numbers) {
            int len = numbers.length;
            if(len < 1)
                return "";
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len-i-1; j++){
                    String s1 = String.valueOf(numbers[j]) + String.valueOf(numbers[j+1]);
                    String s2 = String.valueOf(numbers[j+1]) + String.valueOf(numbers[j]);
                    if(s1.compareTo(s2) > 0){
                        int temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                    }
                }
            }
            String string = String.valueOf(numbers[0]);
            for(int i = 1; i < len; i++)
                string += String.valueOf(numbers[i]);
            return string;
        }

    public int compare (int a,int b){
        //自己写的一个排序
        String a1,b1;
        char ch1,ch2;
        a1 = String.valueOf(a);
        b1 = String.valueOf(b);

        int i =0;
        while(i<a1.length() || i<b1.length()) {
            if(i>=a1.length() || i>= b1.length())
                return i>=a1.length()?b:a;

            ch1 = a1.charAt(i);
            ch2 = a1.charAt(i);

            if(Integer.parseInt(ch1 + "")!=Integer.parseInt(ch2 + ""))
                return Integer.parseInt(ch1 + "")>Integer.parseInt(ch2 + "")?b:a;

            i++;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(new bashuzupaichengzuixiaodeshu().compare(321,3213));
    }
}
