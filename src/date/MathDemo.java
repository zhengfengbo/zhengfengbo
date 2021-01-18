package date;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        // public static final double PI
        System.out.println("PI:" + Math.PI);
        // public static final double E
        System.out.println("E:" + Math.E);
        System.out.println("--------------");

        // public static int abs(int a)：绝对值
        System.out.println("abs:" + Math.abs(10));
        System.out.println("abs:" + Math.abs(-10));
        System.out.println("--------------");

        // public static double ceil(double a):向上取整
        System.out.println("ceil:" + Math.ceil(12.34));
        System.out.println("ceil:" + Math.ceil(12.56));
        System.out.println("--------------");

        // public static double floor(double a):向下取整
        System.out.println("floor:" + Math.floor(12.34));
        System.out.println("floor:" + Math.floor(12.56));
        System.out.println("--------------");

        // public static int max(int a,int b):最大值
        System.out.println("max:" + Math.max(12, 23));
        // 需求：我要获取三个数据中的最大值
        // 方法的嵌套调用
        System.out.println("max:" + Math.max(Math.max(12, 23), 18));
        // 需求：我要获取四个数据中的最大值
        System.out.println("max:"
                + Math.max(Math.max(12, 78), Math.max(34, 56)));
        System.out.println("--------------");

        // public static double pow(double a,double b):a的b次幂
        System.out.println("pow:" + Math.pow(2, 3));
        System.out.println("--------------");

        // public static double random():随机数 [0.0,1.0)
        System.out.println("random:" + Math.random());
        // 获取一个1-100之间的随机数
        System.out.println("random:" + ((int) (Math.random() * 100) + 1));
        System.out.println("--------------");

        // public static int round(float a) 四舍五入(参数为double的自学)
        System.out.println("round:" + Math.round(12.34f));
        System.out.println("round:" + Math.round(12.56f));
        System.out.println("--------------");

        //public static double sqrt(double a):正平方根
        System.out.println("sqrt:" + Math.sqrt(4));
        System.out.println("--------------");


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = sc.nextInt();
        System.out.println("请输入结束数：");
        int end = sc.nextInt();

        for (int x = 0; x < 100; x++) {
            // 调用功能
            int num = getRandom(start, end);
            // 输出结果
            System.out.println(num);
        }
    }
    /*
     * 写一个功能 两个明确： 返回值类型：int 参数列表：int start,int end
     */
    public static int getRandom(int start, int end) {
        // 回想我们讲过的1-100之间的随机数
        // int number = (int) (Math.random() * 100) + 1;
        // int number = (int) (Math.random() * end) + start;
        // 发现有问题了，怎么办呢?
        int number = (int) (Math.random() * (end - start + 1)) + start;
        return number;
    }



}
