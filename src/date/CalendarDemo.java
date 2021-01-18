package date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        //获取年
        int year = rightNow.get(Calendar.YEAR);
        //获取月
        int month = rightNow.get(Calendar.MONTH);
        //获取日
        int date = rightNow.get(Calendar.DATE);

        System.out.println(year +"年"+ (month+1) + "月" + date + "日");
        System.out.println("---------------------");
        //获取当前日期
        Calendar c = Calendar.getInstance();
        //获取年
// // 三年前的今天
        // c.add(Calendar.YEAR, -3);
        // // 获取年
        // year = c.get(Calendar.YEAR);
        // // 获取月
        // month = c.get(Calendar.MONTH);
        // // 获取日
        // date = c.get(Calendar.DATE);
        // System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 5年后的10天前
        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE, -10);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("--------------");

        c.set(2019, 11, 11);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

    }
}
