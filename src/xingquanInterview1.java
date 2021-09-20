import java.util.regex.Pattern;

public class xingquanInterview1 {
    public static void main(String[] args) {
        System.out.println(new xingquanInterview1().changeFormatNumber("sss"));
    }

    public String changeFormatNumber(String number){

        if(!isNumber(number)) return "INPUTERROR";
        int num = Integer.parseInt(number);
        if(num<0) num = 65536+num;

        if(num>65535) return "NODATA";
        int p = num;

        StringBuffer sixteen = new StringBuffer();
        StringBuffer four = new StringBuffer();
        int count1=0;
        int count2=0;

        int tmp;
        while(num!=0 || count1<4){
            tmp = num%16;
            if(tmp<10) sixteen = sixteen.append(tmp);
            else if(tmp==10)  sixteen = sixteen.append('A');
            else if(tmp==11)  sixteen = sixteen.append('B');
            else if(tmp==12)  sixteen = sixteen.append('C');
            else if(tmp==13)  sixteen = sixteen.append('D');
            else if(tmp==14)  sixteen = sixteen.append('E');
            else if(tmp==15)  sixteen = sixteen.append('F');
            num = num/16;
            count1++;
        }

        tmp=0;
        while(p!=0 || count2<16){
            tmp = p%2;
            four = four.append(tmp);
            p = p/2;
            count2++;
        }



        four.reverse().append(',');
        sixteen.reverse();
        return four.append(sixteen).toString();


    }

    public static boolean isNumber(String str){
        Pattern pattern = Pattern.compile("[0-9]*$");
        return pattern.matcher(str).matches();
    }
}
