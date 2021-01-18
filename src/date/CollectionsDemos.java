package date;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemos {
    public static void main(String[] args) {
        // 创建集合对象
        List<Integer> list = new ArrayList<Integer>();

        // 添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:" + list);

        // public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
        // Collections.sort(list);
        // System.out.println("list:" + list);
        // [10, 20, 30, 40, 50]

        // public static <T> int binarySearch(List<?> list,T key):二分查找
        // System.out
        // .println("binarySearch:" + Collections.binarySearch(list, 30));
        // System.out.println("binarySearch:"
        // + Collections.binarySearch(list, 300));

        // public static <T> T max(Collection<?> coll):最大值
        // System.out.println("max:"+Collections.max(list));

        // public static void reverse(List<?> list):反转
        // Collections.reverse(list);
        // System.out.println("list:" + list);

        //public static void shuffle(List<?> list):随机置换
        Collections.shuffle(list);
        System.out.println("list:" + list);


    }
}
