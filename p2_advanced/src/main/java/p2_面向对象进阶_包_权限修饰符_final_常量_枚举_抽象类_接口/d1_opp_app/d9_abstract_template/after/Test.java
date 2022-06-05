package p2_面向对象进阶_包_权限修饰符_final_常量_枚举_抽象类_接口.d1_opp_app.d8_abstract_attention.after;

public class Test {
    public static void main(String[] args) {
        CurrentAccount acc = new CurrentAccount("ICBC-111",100000);
        acc.handle("KGY","123456");
    }
}
