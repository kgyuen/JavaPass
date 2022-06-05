package p2_面向对象进阶_包_权限修饰符_final_常量_枚举_抽象类_接口.d1_opp_app.d8_abstract_attention.before;

public class FixedAccount {
    private String cardId;
    private double money;

    public FixedAccount() {
    }

    public FixedAccount(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     登录结算
     */
    public void handle(String loginName , String passWord ){
        // a.判断登录是否成功
        if("KGY".equals(loginName) && "123456".equals(passWord)){
            System.out.println("登录成功。。");
            // b.正式结算利息
            double result =  money * 0.035; // 结算利息了
            if(money >= 100000){
                result += money * 0.03;
            }
            // c.输出利息详情
            System.out.println("本账户利息是："+ result);
        }else{
            System.out.println("用户名或者密码错误了");
        }
    }


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
