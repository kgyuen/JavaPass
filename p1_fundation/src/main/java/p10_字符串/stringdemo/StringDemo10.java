package p10_字符串.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        // 1.获取一个手机号码
        String phoneNumber = "13112349468";

        // 2.获取手机号码前三位
        String start = phoneNumber.substring(0,3);

        // 3.获取手机号码后四位
        String end = phoneNumber.substring(7);

        // 4.拼接
        String result = start+"****"+end;

        // 5.打印
        System.out.println(result);
    }
}
