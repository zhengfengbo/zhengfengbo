/*
 * Date:表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemo {
	public static void main(String[] args) {
		// 创建对象
		Date d = new Date();
		System.out.println("d:" + d);

		// 创建对象
		// long time = System.currentTimeMillis();
		long time = 1000 * 60 * 60; // 1小时
		Date d2 = new Date(time);
		System.out.println("d2:" + d2);
	}
}

=============================
/*
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 * 
 * 从Date得到一个毫秒值
 * 		getTime()
 * 把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo {
	public static void main(String[] args) {
		// 创建对象
		Date d = new Date();

		// 获取时间
		long time = d.getTime();
		System.out.println(time);
		// System.out.println(System.currentTimeMillis());

		System.out.println("d:" + d);
		// 设置时间
		d.setTime(1000);
		System.out.println("d:" + d);
	}
}
=====================
/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，
       但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 * 
 * 			2019年12月12日 12:12:12
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// Date -- String
		// 创建日期对象
		Date d = new Date();
		// 创建格式化对象
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// 给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);
		
		
		//String -- Date
		String str = "2008-08-08 12:12:12";
		//在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
================================
/**
 * 日期和字符串相互转换的工具类
 * 
 */
public class DateUtil {
	private DateUtil() {
	}

	/**
	 * 方法的作用就是把日期转成一个字符串
	 * 
	 * @param d
	 *            被转换的日期对象
	 * @param format
	 *            传递过来的要被转换的格式
	 * @return 格式化后的字符串
	 */
	public static String dateToString(Date d, String format) {
		// SimpleDateFormat sdf = new SimpleDateFormat(format);
		// return sdf.format(d);
		return new SimpleDateFormat(format).format(d);
	}

	/**
	 * 方法的作用就是把一个字符串解析成一个日期对象
	 * 
	 * @param s
	 *            被解析的字符串
	 * @param format
	 *            传递过来的要被转换的格式
	 * @return 解析后的日期对象
	 * @throws ParseException
	 */
	public static Date stringToDate(String s, String format)
			throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}

===============================
/*
 * 计算你来到这个世界多少天?
 * 
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		
	}
}

