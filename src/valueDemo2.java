/**
 * 变量
 */
public class valueDemo2 {
    public static void main(String[] args) {
        // 定义变量
        // 数据类型 变量名 = 数据值;
        // 数据类型：先定了变量能存储数据的类型
        // int(整数) double(小数)

        int a = 10;
        double b = 10.1;
        System.out.println(String.format("%d\t%.1f", a, b)); // 10 10.1
        System.out.println(a); // 10
        System.out.println(b); // 10.1

        // 变量参与计算
        System.out.println(a + b);

        // 修改变量记录的值
        a = 20;
        System.out.println(a);

        // 在一条语句中，可以定义多个变量
        int c = 100, d = 200, e = 300;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 定义变量的时候，直接赋值
        int f;
        f = 500;
        System.out.println(f);
    }
}
