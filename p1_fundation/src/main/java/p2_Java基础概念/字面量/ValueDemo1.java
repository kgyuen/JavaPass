package p2_Java基础概念.字面量;

public class ValueDemo1 {
    public static void main(String[] args) {
        // 常见的数据在代码中是怎样编写的

        // 整数
        System.out.println(666);
        System.out.println(-777);

        // 小数
        System.out.println(1.93);
        System.out.println(-3.71);

        // 字符串
        System.out.println("我好帅");

        // 字符
        System.out.println('男');
        System.out.println('女');

        // 布尔
        System.out.println(true);
        System.out.println(false);

        // 空
        // Tips: null不能直接被打印
        // 需要打印时使用字符串的null
        // System.out.println(null);  // 提示报错
        System.out.println("null");
    }
}
