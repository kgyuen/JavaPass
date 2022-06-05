package p3_运算符.arithmeticoperator;

public class ArithmeticoperatorDemo5 {

    // int a = 10;
    // a++; // 错误写法

    public static void main(String[] args) {
        // ++ 和 --
        int a = 10;
        // 表示把变量a里面的值+1 (先赋值再+）
        a++;
        System.out.println(a); // 11
        // 表示把变量a里面的值+1 （先+再赋值)
        ++a;
        System.out.println(a); // 12
        //表示把变量a里面的值-1 (先赋值再-)
        a--;
        System.out.println(a);// 11
        //表示把变量a里面的值-1 (先-再赋值）
        --a;
        System.out.println(a);// 10

        int c = 10;
        int d = 10;
        boolean b = ++c < 5 && ++d < 5;  // c在确定为false之后退出了,执行不了后面的 ++d
        System.out.println(c);  // 11
        System.out.println(d);  // 10
    }
}
