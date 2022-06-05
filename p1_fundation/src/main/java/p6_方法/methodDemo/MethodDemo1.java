package p6_方法.methodDemo;

import java.math.BigDecimal;

public class MethodDemo1 {
    public static void main(String[] args) {
        // BigDecimal对超过16位有效位的数进行精确的运算
        BigDecimal  bd1 = new BigDecimal("-10");
        BigDecimal  bd2 = new BigDecimal("3");

        BigDecimal add = bd1.divide(bd2,2,BigDecimal.ROUND_UP);
        System.out.println(add);
    }
}
