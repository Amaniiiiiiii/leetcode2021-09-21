package huaweijikao;

import java.util.*;

public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(!map.containsKey(a)) map.put(a,b);
            else map.put(a,map.get(a)+b);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
    }
}
