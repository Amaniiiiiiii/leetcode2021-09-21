package hot100;

import java.util.ArrayList;

public class Demo03 {

    byte[] array = new byte[1*1024*1024];

    //dump文件
    public static void main(String[] args) {
        ArrayList<Demo03> objects = new ArrayList<>();
        int count = 0;

        try{
            while(true){
                objects.add(new Demo03());
                count++;
            }
        }catch (Exception error){
            System.out.println("count = " + count);
        }
    }
}
