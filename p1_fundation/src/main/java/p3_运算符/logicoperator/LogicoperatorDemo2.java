package p3_运算符.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // 1. ^ 异或
        // 相同为false，不同为true
        System.out.println(true ^ true); //false
        System.out.println(false ^ false); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //ture

        // 2. ! 逻辑非 取反
        // Tips：
        // 取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false); //true
        System.out.println(!true); //false
        System.out.println(!!true); // 错误写法
    }
}
