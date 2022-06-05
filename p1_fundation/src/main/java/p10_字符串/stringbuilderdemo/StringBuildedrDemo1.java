package p10_字符串.stringbuilderdemo;

public class StringBuildedrDemo1 {
    // 太久了
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "abc";
        }
        System.out.println(s);
    }
}
