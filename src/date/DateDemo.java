package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        // 创建对象
        Date d = new Date();
        System.out.println("d:" + d);
        // 创建对象
        // long time = System.currentTimeMillis();
        long time = 1000 * 60 * 60; // 1小时
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);
        System.out.println("----------------");

        Date c = new Date();

        // 获取时间
        long time1 = c.getTime();
        System.out.println(time1);
        // System.out.println(System.currentTimeMillis());

        System.out.println("c:" + c);
        // 设置时间
        d.setTime(1000);
        System.out.println("c:" + c);
        System.out.println("--------------");


        // Date -- String
        // 创建日期对象
        Date d3 = new Date();
        // 创建格式化对象
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // 给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // public final String format(Date date)
        String s = sdf.format(d3);
        System.out.println(s);
        System.out.println("-----------");
    /*
       Date	 --	 String(格式化)
 	   public final String format(Date date)
       String -- Date(解析)
       public Date parse(String source)
       DateForamt:可以进行日期和字符串的格式化和解析，
       但是由于是抽象类，所以使用具体子类SimpleDateFormat。
       SimpleDateFormat的构造方法：
  	   SimpleDateFormat():默认模式
  	   SimpleDateFormat(String pattern):给定的模式
  			这个模式字符串该如何写呢?
 			通过查看API，我们就找到了对应的模式
 			年 y
 			月 M
			日 d
			时 H
 			分 m
 			秒 s

 			2019年12月12日 12:12:12
 */
        //String -- Date
        String str = "2008-08-08 12:12:12";
        //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);

        /**
         * 方法的作用就是把日期转成一个字符串
         *
         * @param d
         *            被转换的日期对象
         * @param format
         *            传递过来的要被转换的格式
         * @return 格式化后的字符串
         */

    }

}
