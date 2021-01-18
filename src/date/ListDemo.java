package date;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        List list1 = new ArrayList();

        // 创建字符串并添加字符串
        list1.add("hello");
        list1.add("world");
        list1.add("java");

        // 遍历集合
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            /*News(1,"list1","a"));
            　　　list.add(new News(2,"list2","b"));
            　　　list.add(new News(3,"list3","c"));
            　　　list.add(new News(4,"list4","d"));
　　　            for (int i = 0; i < list.size(); i++) {
                 News s = (News)list.get(i);
                 System.out.println(s.getId());*/
        }
        /*
         * List集合的特点：
         * 		有序:存储和取出元素顺序一致
                可重复:存储的元素可以重复
         */
        // 创建集合对象


        /*
          List集合特有功能：
          A:添加功能
          		void add(int index,Object element):在指定位置添加元素
          B:获取功能
          		Object get(int index):获取指定位置的元素
          C:列表迭代器
          		ListIterator listIterator()：List集合特有的迭代器
          D:删除功能
          		Object remove(int index)：根据索引删除元素,返回被删除的元素
          E:修改功能
          		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
         */
        // 创建集合对象
        List list2 = new ArrayList();

        // 添加元素
        list2.add("hello");
        list2.add("world");
        list2.add("java");

        // void add(int index,Object element):在指定位置添加元素
        // list.add(1, "android");//没有问题
        // IndexOutOfBoundsException
        // list.add(11, "javaee");//有问题
        // list.add(3, "javaee"); //没有问题
        // list.add(4, "javaee"); //有问题

        // Object get(int index):获取指定位置的元素
        // System.out.println("get:" + list.get(1));
        // IndexOutOfBoundsException
        // System.out.println("get:" + list.get(11));

        // Object remove(int index)：根据索引删除元素,返回被删除的元素
        // System.out.println("remove:" + list.remove(1));
        // IndexOutOfBoundsException
        // System.out.println("remove:" + list.remove(11));

        // Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
        System.out.println("set:" + list2.set(1, "javaee"));

        System.out.println("list2:" + list2);
        System.out.println("------------------");



    }
}
