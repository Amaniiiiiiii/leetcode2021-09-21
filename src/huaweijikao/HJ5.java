package huaweijikao;

import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            int ans = 0;
            for (int i = 2; i < str.length(); i++) {
                if(str.charAt(i)=='1') ans+=1*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='2') ans+=2*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='3') ans+=3*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='4') ans+=4*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='5') ans+=5*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='6') ans+=6*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='7') ans+=7*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='8') ans+=8*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='9') ans+=9*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='A') ans+=10*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='B') ans+=11*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='C') ans+=12*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='D') ans+=13*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='E') ans+=14*(int)Math.pow(16,str.length()-i-1);
                else if(str.charAt(i)=='F') ans+=15*(int)Math.pow(16,str.length()-i-1);
            }
            System.out.println(ans);
        }
    }
}
