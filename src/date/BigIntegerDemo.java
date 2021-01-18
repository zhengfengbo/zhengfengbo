package date;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // Integer i = new Integer(100);
        // System.out.println(i);
        // // System.out.println(Integer.MAX_VALUE);
        // Integer ii = new Integer("2147483647");
        // System.out.println(ii);
        // // NumberFormatException
        // Integer iii = new Integer("2147483648");
        // System.out.println(iii);

        // 通过大整数来创建对象
        BigInteger bi = new BigInteger("2147483648");
        System.out.println("bi:" + bi);
        /*
         public BigInteger add(BigInteger val):加
         public BigInteger subtract(BigInteger val):减
         public BigInteger multiply(BigInteger val):乘
         public BigInteger divide(BigInteger val):除
         public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
         */
    }
}
