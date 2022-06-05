package p3_运算符.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);// 5
        // -
        System.out.println(5 - 1);// 4
        // *
        System.out.println(7 * 9);// 63

        // 在代码中如果有小数参与，结果有可能不准确
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
