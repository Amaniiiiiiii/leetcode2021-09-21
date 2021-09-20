package jianzhiofferNew;

public class JZ12 {
    public double Power(double base, int exponent) {
        double res = 1;
        while(exponent!=0){
            if(exponent>0){
                res *= base;
                exponent--;
            }else if(exponent<0){
                res = res/base;
                exponent++;
            }
        }
        return res;
    }
}
