package io_edit;

import java.io.*;

public class FileOutputStreamDemo {
    /*
     * IO流分类：
     * 		流向：
     * 			输入流	读取数据
     * 			输出流 写出数据
     * 		数据类型：
     * 			字节流
     * 				字节输入流	读取数据	InputStream
     * 				字节输出流	写出数据	OutputStream
     * 			字符流
     * 				字符输入流	读取数据	Reader
     * 				字符输出流	写出数据	Writer
     *
     * 		注意：默认情况下是按照数据类型分
     *
     * 需求：要向文本文件中输入："hello,io"
     *
     *
     *
     * 使用：OutputStream
     * 流对象是一个抽象类，不能实例化
     * 所以，要一个具体的子类。
     * 而要找的子类名称：
     * 文件：File
     * 然后用的是字节输出流：FileOutputStream
     * 注意：基类的子类都是以父类名作为后缀名。
     * 		XxxOutputStream
     * 		XxxInputStream
     * 		XxxReader
     * 		XxxWriter
     * FileOutputStream的构造方法：
     * 		FileOutputStream(File file)
     *		FileOutputStream(String name)
     *
     * 字节输出流操作步骤：
     * 		A:创建字节输出流对象
     * 		B:写数据
     * 		C:释放资源
     */
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        // FileOutputStream(File file)
        // File file = new File("fos.txt");
        // FileOutputStream fos = new FileOutputStream(file);
        // FileOutputStream(String name)
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //写数据
        fos.write("hello,IO".getBytes());
        fos.write("java".getBytes());

        //释放资源
        //关闭此文件输出流并释放与此流有关的所有系统资源
        fos.close();
        /*
         * 一定要close()
         * A:流对象变成垃圾，就可以被垃圾回收器回收
         * B:通知系统去释放跟该文件相关的资源
         */
        System.out.println("---------------------------");
        /*
         * 字节输出流操作步骤：
         * A:创建字节输出流对象
         * B:调用write()方法
         * C:释放资源
         *
         * public void write(int b):写一个字节
         * public void write(byte[] b):写一个字节数组
         * public void write(byte[] b,int off,int len):写一个字节数组的一部分
         */
        // 创建字节输出流对象
        // OutputStream os = new FileOutputStream("fos2.txt"); // 多态
        FileOutputStream fos1 = new FileOutputStream("fos2.txt");

        // 调用write()方法
        //fos.write(97);
        // fos.write(57);
        // fos.write(55);

        //public void write(byte[] b):写一个字节数组
        byte[] bys={97,98,99,100,101};
        fos.write(bys);

        //public void write(byte[] b,int off,int len):写一个字节数组的一部分
        fos.write(bys,1,3);

        //释放资源
        fos.close();
        System.out.println("----------------------");
        /*
         * 实现换行
         *
         * 		windows:\r\n
         * 		linux:\n
         * 		Mac:\r
         * 		有些常见的个高级记事本，是可以识别任意换行符号的。
         *
         * 如何实现数据的追加写入
         * 		用构造方法带第二个参数是true的情况即可
         */

            // 创建字节输出流对象
            // FileOutputStream fos = new FileOutputStream("fos3.txt");
            // 创建一个向具有指定 name 的文件中写入数据的输出文件流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
            FileOutputStream fos2 = new FileOutputStream("fos3.txt", true);

            // 写数据
            for (int x = 0; x < 10; x++) {
                fos.write(("hello" + x).getBytes());
                fos.write("\r\n".getBytes());
            }

            // 释放资源
            fos.close();
        System.out.println("-------------------------");
        /*
         * 加入异常处理的字节输出流操作
         */
        // 在finally里面能够看到该对象则必须定义到外面，为了问不出问题，必须给初始化值
        FileOutputStream fos111 = null;
        FileOutputStream fos11 = null;
        try {
            // fos = new FileOutputStream("z:\\fos4.txt");
            fos11 = new FileOutputStream("fos4.txt");
            fos11.write("java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 如果fos不为null，则需要close()
            if (fos11 != null) {
                // 为保证close()一定会执行，就放到这里了
                try {
                    fos11.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //-------------------------
        /*
         * 字节输入流操作步骤：
         * A:创建字节输入流对象
         * B:调用read()方法读取数据，并把数据显示在控制台
         * C:释放资源
         *
         * 读取数据的方式：
         * A:int read():一次读取一个字节
         * B:int read(byte[] b):一次读取一个字节数组
         */

        // FileInputStream(String name)
        // FileInputStream fis = new FileInputStream("fis.txt");
        FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");

        int by = 0;
        // 读取，赋值，判断
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        // 释放资源
        fis.close();
        //------------------
        /*
         * 一次读取一个字节数组：int read(byte[] b)
         * 返回值其实是实际读取的字节个数
         */
        // 创建字节输入流对象
        // FileInputStream fis = new FileInputStream("fis2.txt");
        FileInputStream fis5 = new FileInputStream("FileOutputStreamDemo.java");

        // 最终版代码
        // 数组的长度一般是1024或者1024的整数倍
        byte[] bys3 = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // 释放资源
        fis.close();
        //-----------------------
        /*
         * 复制文本文件。
         *
         * 数据源：
         * a.txt	--	读取数据	--	FileInputStream
         *
         * 目的地：
         * b.txt	--	写数据		--	FileOutputStream
         *
         * java.io.FileNotFoundException: a.txt (系统找不到指定的文件。)
         *
         */
// 封装数据源
        FileInputStream fis1 = new FileInputStream("a.txt");
        // 封装目的地
        FileOutputStream fos3 = new FileOutputStream("b.txt");

        int by3 = 0;
        while ((by3 = fis1.read()) != -1) {
            fos3.write(by3);
        }

        // 释放资源(无顺序)
        fos3.close();
        fis1.close();
//------------------------------
        /*
         * 需求：把c盘下的a.txt的内容复制到d盘下的b.txt中
         *
         * 数据源：
         * 		c:\\a.txt	--	读取数据--	FileInputStream
         * 目的地：
         * 		d:\\b.txt	--	写出数据	--	FileOutputStream
         */
        /*
         * 需求：把e:\\xxx.jpg内容复制到当前项目目录下的mn.jpg中
         *
         * 数据源：
         * 		e:\\xxx.jpg	--读取数据--FileInputStream
         * 目的地：
         * 		mn.jpg--写出数据--FileOutputStream
         */
        /*
         * 需求：把e:\\xxx.mp4复制到当前项目目录下的copy.mp4中
         *
         * 数据源：
         * 		e:\\xxx.mp4--读取数据--FileInputStream
         * 目的地：
         * 		copy.mp4--写出数据--FileOutputStream
         */
        /*
         * 需求：把c:\\a.txt内容复制到d:\\b.txt中
         *
         * 数据源：
         * 		c:\\a.txt	--	读取数据	--	FileInputStream
         * 目的地：
         * 		d:\\b.txt	--	写出数据	--	FileOutputStream
         */
        /*
         * 有一个缓冲区还是较为专业
         *
         * 类被称为：缓冲区类(高效类)
         * 写数据：BufferedOutputStream
         * 读数据：BufferedInputStream
         *
         * 构造方法可以指定缓冲区的大小，因为默认缓冲区大小就足够
         *
         * 为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象
         * 原因是字节缓冲区流仅仅提供缓冲区，为高效而设计。但是真正的读写操作还得靠基本的流对象实现。
         */
        // BufferedOutputStream(OutputStream out)
        // FileOutputStream fos = new FileOutputStream("bos.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // 简单写法
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("bos.txt"));

        // 写数据
        bos.write("hello".getBytes());

        // 释放资源
        bos.close();
        /*
         * 注意：有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
         */

        /*
         * 需求：把e:\\xxx.mp4复制到当前项目目录下的copy.mp4中
         *
         * 字节流四种方式复制文件：
         * 基本字节流一次读写一个字节：	共耗时：   毫秒
         * 基本字节流一次读写一个字节数组： 共耗时：毫秒
         * 高效字节流一次读写一个字节： 共耗时：毫秒
         * 高效字节流一次读写一个字节数组： 共耗时：毫秒
         */
    }


}
