package p10_字符串.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        sb.append("aaa").append("bbb").append("ddd");

        System.out.println(sb);

        // 3.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
