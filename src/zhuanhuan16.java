public class zhuanhuan16 {
    public String toHex(int num) {
        StringBuffer buffer = new StringBuffer();
        char[] arr = "0123456789abcdef".toCharArray();
        if (num == 0) return "0";
        while (num != 0) {
            int tmp = num & 15;
            buffer.append(arr[tmp]);
            num = num >>> 4;

        }
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new zhuanhuan16().toHex(-1));
    }



}
