package p2_面向对象进阶_包_权限修饰符_final_常量_枚举_抽象类_接口.d1_opp_app.d8_abstract_attention.after;

public class CurrentAccount extends Account{

    public CurrentAccount(String cardId,double money){
        super(cardId,money);
    }
    @Override
    public double calc() {
        // b.正式结算利息
        double result = getMoney() * 0.0175; // 结算利息
        return result;
    }
}
