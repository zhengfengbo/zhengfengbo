package date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Collection_edit {
    public static void main(String[] args) {
        /* Collection的功能概述：
        * 1：添加功能
                * boolean add(Object obj):添加一个元素
                * boolean addAll(Collection c):添加一个集合的元素
        * 2:删除功能
                * void clear():移除所有元素
                * boolean remove(Object o):移除一个元素
                * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
        * 3:判断功能
                * boolean contains(Object o)：判断集合中是否包含指定的元素
                * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
                * boolean isEmpty()：判断集合是否为空
        * 4:获取功能
                * Iterator<E> iterator()(重点)
        * 5:长度功能
                * int size():元素的个数
                * 面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
        * 6:交集功能
                * boolean retainAll(Collection c):
        * 7：把集合转换为数组
                * Object[] toArray()
                */
        //测试不带All的方法
        //创建集合对象
        //Collection c = new Collection();
        Collection c = new ArrayList();

        // boolean add(Object obj):添加一个元素
        // System.out.println("add:"+c.add("hello"));
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
        // void clear():移除所有元素
        // c.clear();
        // boolean remove(Object o):移除一个元素
        // System.out.println("remove:" + c.remove("hello"));
        // System.out.println("remove:" + c.remove("javaee"));

        // boolean contains(Object o)：判断集合中是否包含指定的元素
        // System.out.println("contains:"+c.contains("hello"));
        // System.out.println("contains:"+c.contains("android"));

        // boolean isEmpty()：判断集合是否为空
        // System.out.println("isEmpty:"+c.isEmpty());

        //int size():元素的个数
        System.out.println("size:"+c.size());

        System.out.println("c:" + c);
        System.out.println("---------------------");
        /*boolean addAll(Collection c):添加一个集合的元素
         boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
         boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
         boolean retainAll(Collection c):两个集合都有的元素?返回的boolean又是什么意思呢?*/
        // 创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        // 创建集合2
        Collection c2 = new ArrayList();
//		c2.add("abc1");
//		c2.add("abc2");
//		c2.add("abc3");
//		c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

        // boolean addAll(Collection c):添加一个集合的元素
        // System.out.println("addAll:" + c1.addAll(c2));

        //boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
        //只要有一个元素被移除了，就返回true。
        //System.out.println("removeAll:"+c1.removeAll(c2));

        //boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
        //只有包含所有的元素，才叫包含
        // System.out.println("containsAll:"+c1.containsAll(c2));

        //boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
        //假设有两个集合A，B。
        //A对B做交集，最终的结果保存在A中，B不变。
        //返回值表示的是A是否发生过改变。
        System.out.println("retainAll:"+c1.retainAll(c2));

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);

        System.out.println("-------------------------");

        /*
         集合的遍历。是依次获取集合中的每一个元素。
         Object[] toArray():把集合转成数组，可以实现集合的遍历
         */
        // 创建集合对象
        Collection c3 = new ArrayList();

        // 添加元素
        c3.add("hello"); // Object obj = "hello"; 向上转型
        c3.add("world");
        c3.add("java");

        // 遍历
        // Object[] toArray():把集合转成数组，可以实现集合的遍历
        Object[] objs = c3.toArray();
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);
            // 我知道元素是字符串，我在获取到元素的的同时，还想知道元素的长度。
            // System.out.println(objs[x] + "---" + objs[x].length());
            // 上面的实现不了，原因是Object中没有length()方法
            // 我们要想使用字符串的方法，就必须把元素还原成字符串
            // 向下转型
            String s = (String) objs[x];
            System.out.println(s + "---" + s.length());
        }
        /*
          练习：用集合存储5个学生对象，并把学生对象进行遍历。
          分析：
          A:创建学生类
          B:创建集合对象
          C:创建学生对象
          D:把学生添加到集合
          E:把集合转成数组
          F:遍历数组
         */
        //创建集合对象
        Collection b = new ArrayList();


        // 创建集合对象
        Collection c5 = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
        c5.add("hello");
        c5.add("world");
        c5.add("java");

        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator it = c5.iterator(); // 实际返回的肯定是子类对象，是多态

        // 最终版代码
        while (it.hasNext()) {
            // System.out.println(it.next());
            String s = (String) it.next();
            System.out.println(s);

        /*
        // 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("李梓萌", 27);
		Student s2 = new Student("李思思", 30);
		Student s3 = new Student("康辉", 33);
		Student s4 = new Student("海霞", 25);
		Student s5 = new Student("小尼", 22);

		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 遍历
		Iterator it = c.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());

        */

        }
        }
}
