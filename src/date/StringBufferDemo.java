package date;

public class StringBufferDemo {
    private static Object StringBuffer;

    public static void main(String[] args) {
        /*
          线程安全
          安全 -- 同步 -- 数据是安全的
          不安全 -- 不同步 -- 效率高一些
          StringBuffer:
          线程安全的可变字符串。
          StringBuffer和String的区别?
          前者长度和内容可变，后者不可变。
          如果使用前者做字符串的拼接，不会浪费太多的资源。
          StringBuffer的构造方法：
          public StringBuffer():无参构造方法
          public StringBuffer(int capacity):指定容量的字符串缓冲区对象
          public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
          StringBuffer的方法：
          public int capacity()：返回当前容量。	理论值
          public int length():返回长度（字符数）。 实际值
         */

        // public StringBuffer():无参构造方法
        // public StringBuffer(int capacity):指定容量的字符串缓冲区对象
        // public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
        System.out.println("-----------------");


     /*
      StringBuffer添加功能：
      public StringBuffer append(String str):
      可以把任意类型数据添加到字符串缓冲区,并返回字符串缓冲区本身
      public StringBuffer insert(int offset,String str):
      在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
      */
        // 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        // public StringBuffer append(String str)
        // StringBuffer sb2 = sb.append("hello");
        // System.out.println("sb:" + sb);
        // System.out.println("sb2:" + sb2);
        // System.out.println(sb == sb2); // true

        // 一步一步的添加数据
        // sb.append("hello");
        // sb.append(true);
        // sb.append(12);
        // sb.append(34.56);

        // 链式编程
        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println("sb:" + sb);

        // public StringBuffer insert(int offset,String
        // str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        sb.insert(5, "world");
        System.out.println("sb:" + sb);
        System.out.println("---------------------");

        /*
          StringBuffer的删除功能
          public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
          public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
         */

        // 创建对象
        StringBuffer sb1 = new StringBuffer();

        // 添加功能
        sb.append("hello").append("world").append("java");
        System.out.println("sb1:" + sb1);

        // public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
        // 需求：我要删除e这个字符，肿么办?
        // sb1.deleteCharAt(1);
        // 需求:我要删除第一个l这个字符，肿么办?
        // sb1.deleteCharAt(1);
        // public StringBuffer delete(int start,int
        // end):删除从指定位置开始指定位置结束的内容，并返回本身
        // 需求：我要删除world这个字符串，肿么办?
        // sb1.delete(5, 10);
        // 需求:我要删除所有的数据
        sb1.delete(0, sb1.length());
        System.out.println("sb1:" + sb1);
        System.out.println("----------------------");
        /*
          StringBuffer的替换功能：
          public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
         */
        // 创建字符串缓冲区对象
        StringBuffer sb2 = new StringBuffer();

        // 添加数据
        sb2.append("hello");
        sb2.append("world");
        sb2.append("java");
        System.out.println("sb2:" + sb2);

        // public StringBuffer replace(int start,int end,String
        // str):从start开始到end用str替换
        // 需求：我要把world这个数据替换为"节日快乐"
        sb2.replace(5, 10, "节日快乐");
        System.out.println("sb2:" + sb2);
        System.out.println("----------------------");

        /*
         * StringBuffer的反转功能：
         * public StringBuffer reverse()
         */
        // 创建字符串缓冲区对象
        StringBuffer sb3 = new StringBuffer();

        // 添加数据
        sb3.append("霞青林爱我");
        System.out.println("sb3:" + sb3);

        // public StringBuffer reverse()
        sb3.reverse();
        System.out.println("sb3:" + sb3);
        System.out.println("---------------------");
        /*
         * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
         * public String substring(int start)
         * public String substring(int start,int end)
         */
        // 创建字符串缓冲区对象
        StringBuffer sb4 = new StringBuffer();

        // 添加元素
        sb4.append("hello").append("world").append("java");
        System.out.println("sb4:" + sb4);

        // 截取功能
        // public String substring(int start)
        String s = sb.substring(5);
        System.out.println("s:" + s);
        System.out.println("sb4:" + sb4);

        // public String substring(int start,int end)
        String ss = sb.substring(5, 10);
        System.out.println("ss:" + ss);
        System.out.println("sb4:" + sb4);

        System.out.println("--------------");
        /*
         * 类之间的转换：
         *    A -- B的转换
         * 把A转换为B，其实是为了使用B的功能。
         *    B -- A的转换
         * 可能要的结果是A类型，所以还得转回来。
         *
         * String与StringBuffer的相互
         */
        // String -- StringBuffer
        String s1 = "hello";
        // 注意：不能把字符串的值直接赋值给StringBuffer
        // StringBuffer sb = "hello";

        // 方式1:通过构造方法
        StringBuffer sb5 = new StringBuffer(s);
        // 方式2：通过append()方法
        StringBuffer sb6 = new StringBuffer();
        sb6.append(s1);
        System.out.println("sb5:" + sb5);
        System.out.println("sb6:" + sb6);
        System.out.println("---------------");

        // StringBuffer -- String
        StringBuffer buffer = new StringBuffer("java");
        // String(StringBuffer buffer)
        // 方式1:通过构造方法
        String str = new String(buffer);
        // 方式2：通过toString()方法
        String str2 = buffer.toString();
        System.out.println("str:" + str);
        System.out.println("str2:" + str2);
        System.out.println("-------------------");


    }
}