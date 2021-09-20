package huaweijikao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            int number = scanner.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            int temp;
            for (int i = 0; i < number; i++) {
                temp = scanner.nextInt();
                if(!map.containsKey(temp)){
                    map.put(temp,1);
                }
            }

            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey());
            }
        }
    }
}
