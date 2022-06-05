package p4_判断和循环.loopdemo;

public class ForDemo1 {
    public static void main(String[] args) {
        // 需求： 打印10次HelloWorld

        // 分析
        //i 1~5
        /* for(初始化语句;条件判断语句;条件控制语句){
            循环体;
        }*/
        for (int i = 0; i <= 10; i++) {
            System.out.println("HelloWorld");
        }
    }
}
