package Map;

import java.util.*;

public class MapDemo {
    //Map 基本特性：
    //以 key-value 键值对的形式存储数据，可通过 key 来查找 value；
    //对于每一个 key，Map 只接受存储一次；
    //通过 put(key,value) 方法添加一个值，通过 get(key) 方法获取与这个键关联的值。
    public static void main(String[] args) {
    //map集合的特点
       //将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。

     //HashMap（无序，底层哈希表结构，保证键唯一，需要重写键对应类的hashCode和equals方法）
            //通过 HashMap 创建 map 对象
            Map<String, String> map = new HashMap<>();
            //向 Map 添加键值对
            map.put("a", "rat");
            map.put("b", "cat");
            map.put("b", "dog");
            map.put("c", "rat");
            map.put(null, null);
            map.put(null, null);
            //map 打印
            System.out.println("map: " + map);

            System.out.println("map 中是否有键 a: " + map.containsKey("a"));
            System.out.println("map 中是否有值 null: " + map.containsValue(null));
            System.out.println("map 中 a 的值为：" + map.get("a"));
            map.remove(null);
            System.out.println("删除 null 后的map：" + map);
        System.out.println("----------------------");
        /*
        TreeMap 是基于红黑树实现，用来保存一个有序的键值对 (key-value) 集合，有两种排序方式，默认是自然排序，还可以定制排序。先看自然排序：
        */
        //通过 TreeMap 创建 map 对象
        Map<String, String> map1 = new TreeMap<>();
        //向 Map 添加键值对
        map1.put("rat", "bob");
        map1.put("cat", "sam");
        map1.put("dog", "tim");
        System.out.println(map1);
     //主要功能
            //增改：V put(K key, V value)：向集合中添加键值对，如何键重复，覆盖之间的整个键值对，并返回被覆盖的键值对的值
            //删：V remove(OBject key)：根据键从map集合中删除键值对，返回被覆盖的键值对的值
            //查：V get(K key)：根据键从map集合中找到唯一对应的值
            //长度：int size()；
            //判断
            // boolean isEmpty()；
            // boolean containsKey(Object key)；
            // boolean containsValue(Object value)；

        //--------------------------------------------------------------------

    //方法

        /*put方法：将指定的键与值对应起来，并添加到集合中
        方法返回值为键所对应的值
        使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；
        使用put方法时，若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的值，替换成指定的新值。*/

        //创建一个hashMap集合
        Map<String, String> map2 = new HashMap<String,String>();
        map2.put("小明", "我是山东人");
        map2.put("小红", "我是广州人");
        map2.put("小李", "我是北京人");
        map2.put("小东", "我是上海人");
        System.out.println(map2);
        String value = map2.remove("小东");
        System.out.println(value);
        System.out.println(map2);
        System.out.println("---------------------------");

        //get方法：获取指定键(key)所对应的值(value)

        // 创建 person 对象
        Map<String, String> person = new HashMap<>();
        // 添加 元素 put 方法
        person.put("唐三藏", "师傅");
        person.put("孙悟空", "大师兄");
        person.put("猪八戒", "二师兄");
        person.put("沙悟净", "三师弟");
        person.put("白龙马", "四师弟");
        //get值
        String value1 = person.get("唐三藏");
        System.out.println("唐三藏的值value1="+value);
        String value2 = person.get("孙悟空");
        System.out.println("孙悟空的值value2="+value2);
        String value3 = person.get("沙悟净");
        System.out.println("沙悟净的值value3="+value3);
        System.out.println("-----------------------------------");

        //remove方法：根据指定的键(key)删除元素，返回被删除元素的值(value)

        /*
        1.properties是Map中很重要的一个集合
        2.Properties是一个持久的属性集，所谓持久 就是 它具有自己写数据到文件的方法
        3.Properties是没有泛型,泛型固定为String
        4.Properties类,具有Map接口的一切方法，还有具有一些自己特有的方法:：
          public String getProperty(String key)用指定的键在此属性列表中搜索属性的值,功能和Map中的get是一样
          public Object setProperty(String key, String value);添加键值对,功能和Map的put方法是一样
          public Set<String> stringPropertyNames()://和Map中的keySet方法是一样
        5.Properties具有持久化到文件的功能
          store();//保存数据到文件,实际上不是保存到文件 而是写入到流中,由流写到文件
          load();//从文件中加载数据,实际上不是直接加载文件,而是加载流中的数据,而流的数据是从该文件中读取的
        6.Properties本质上是一个Map集合
        */
            //Properties遍历
            Properties pr = new Properties();
            pr.setProperty("001", "苹果");
            pr.setProperty("003", "华为");
            pr.setProperty("002", "小米");
            Set<String> prkey = pr.stringPropertyNames();
            for (String ps : prkey) {
                System.out.println(ps + ":" + pr.getProperty(ps));
            }

    }
    }


