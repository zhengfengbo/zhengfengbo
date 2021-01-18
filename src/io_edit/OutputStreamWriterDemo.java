package io_edit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {

        // 创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "osw2.txt"));

        // 写数据
        // public void write(int c):写一个字符
        // osw.write('a');
        // osw.write(97);
        // 为什么数据没有进去呢?
        // 原因是：字符 = 2字节
        // 文件中数据存储的基本单位是字节。
        // void flush()

        // public void write(char[] cbuf):写一个字符数组
        // char[] chs = {'a','b','c','d','e'};
        // osw.write(chs);

        // public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
        // osw.write(chs,1,3);

        // public void write(String str):写一个字符串
        // osw.write("山东大学软件学院");

        // public void write(String str,int off,int len):写一个字符串的一部分
        osw.write("山东大学软件学院", 2, 3);

        // 刷新缓冲区
        osw.flush();
        // osw.write("山东大学软件学院", 2, 3);

        // 释放资源
        osw.close();
        // java.io.IOException: Stream closed
        // osw.write("", 2, 3);
    }
}
