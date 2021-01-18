package date;

import java.util.*;

public class List_son {
    public static void main(String[] args) {
        /*
         * List特点：
         * 		ArrayList:
         * 			底层数据结构是数组，查询快，增删慢
         * 			线程不安全，效率高
         * 		Vector:
         * 			底层数据结构是数组，查询快，增删慢
         * 			线程安全，效率低
         * 		LinkedList:
         * 			 底层数据结构是链表，查询慢，增删快
         * 			线程不安全，效率高
         *
         * 案例：
         * 		使用List的任何子类存储字符串或者存储自定义对象并遍历。
         *
         * ArrayList的使用。
         * 		存储字符串并遍历
         */
        // 创建集合对象
        ArrayList array = new ArrayList();

        // 创建元素对象，并添加
        array.add("hello");
        array.add("world");
        array.add("java");
        // 遍历
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        System.out.println("-----------");

        for (int x = 0; x < array.size(); x++) {
            String s = (String) array.get(x);
            System.out.println(s);
        }


        System.out.println("------------------");
        /*
         * Vector的特有功能：
         * 1：添加功能
         * 		public void addElement(Object obj)		--	add()
         * 2：获取功能
         * 		public Object elementAt(int index)		--  get()
         * 		public Enumeration elements()			--	Iterator iterator()
         * 				boolean hasMoreElements()				hasNext()
         * 				Object nextElement()					next()
         *
         * JDK升级的原因：
         * 		A:安全
         * 		B:效率
         * 		C:简化书写
         */
        // 创建集合对象
        Vector v = new Vector();

        // 添加功能
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");

        // 遍历
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x);
            System.out.println(s);
        }

        System.out.println("------------------");

        Enumeration en = v.elements(); // 返回的是实现类的对象
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
        /*
         * LinkedList的特有功能：
         * 		A:添加功能
         * 			public void addFirst(Object e)
         * 			public void addLast(Object e)
         * 		B:获取功能
         * 			public Object getFirst()
         * 			public Obejct getLast()
         * 		C:删除功能
         * 			public Object removeFirst()
         * 			public Object removeLast()
         */


        /*
         * 获取10个1-20之间的随机数，要求不重复
         *
         * 用数组实现，但是数组的长度是固定，所以用集合实现。
         *
         * 分析：
         * 		A:创建产生随机数的对象
         * 		B:创建一个存储随机数的集合。
         * 		C:定义一个统计变量。从0开始。
         * 		D:判断统计遍历是否小于10
         * 			是:先产生一个随机数，判断该随机数在集合中是否存在。
         * 					如果不存在:就添加，统计变量++。
         * 					如果存在:
         * 			否：不搭理它
         * 		E:遍历集合
         */
        Random r = new Random();
        // 创建一个存储随机数的集合。
        ArrayList<Integer> array1 = new ArrayList<Integer>();


        // 定义一个统计变量。从0开始。
        int count = 0;
        // 判断统计遍历是否小于10
        while (count < 10) {
        //先产生一个随机数
        int number = r.nextInt(20) + 1;

        //判断该随机数在集合中是否存在。
            if(!array1.contains(number)){
        //如果不存在:就添加，统计变量++。
             array1.add(number);
             count++;
            }
        }
        //遍历集合
        for(Integer i : array1){
            System.out.println(i);
        }
        /*
         * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
         *
         * 分析：
         * 		A:创建键盘录入数据对象
         * 		B:键盘录入多个数据,不确定数量，所以用集合存储
         * 		C:以0结束,这个简单，只要键盘录入的数据是0，停止录入
         * 		D:把集合转成数组
         * 		E:对数组排序
         * 		F:获取该数组中的最大索引的值
         */
        // 创建键盘录入数据对象
        Scanner sc = new Scanner(System.in);

        // 键盘录入多个数据,我们不知道有多少个，所以用集合存储
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        // 以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
        while (true) {
            System.out.print("请输入数据：");
            // nextInt()方法：用来接收输入的整数。
            // nextLine()方法：用来接收输入的字符串。
            int number = sc.nextInt();
            if (number != 0) {
                array2.add(number);
            } else {
                break;
            }
        }

        // 把集合转成数组
        // public <T> T[] toArray(T[] a)
        Integer[] shuzu = new Integer[array.size()];
        array.toArray(shuzu);

        // 对数组排序
        // public static void sort(Object[] a)
        Arrays.sort(shuzu);

        // 获取该数组中的最大索引的值
        System.out.println("数组是：" + arrayToString(shuzu));
        System.out.println("最大值是:" + shuzu[shuzu.length - 1]);
    }

    // 数组转为字符串
    public static String arrayToString(Integer[] sz) {
        StringBuilder sb = new StringBuilder(); // 字符串缓冲区

        sb.append("[");
        for (int x = 0; x < sz.length; x++) {
            if (x == sz.length - 1) {
                sb.append(sz[x]);
            } else {
                sb.append(sz[x]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString(); // 字符串
    }
}
