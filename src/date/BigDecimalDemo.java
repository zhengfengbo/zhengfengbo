package date;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

            System.out.println(0.09 + 0.01);
            System.out.println(1.0 - 0.32);
            System.out.println(1.015 * 100);
            System.out.println(1.301 / 100);
            System.out.println(1.0 - 0.12);


    /*
     构造方法：
     public BigDecimal(String val)
     public BigDecimal add(BigDecimal augend)
     public BigDecimal subtract(BigDecimal subtrahend)
     public BigDecimal multiply(BigDecimal multiplicand)
     public BigDecimal divide(BigDecimal divisor)
     public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
     */
    BigDecimal bigDecimal1 = new BigDecimal(0.86);
    BigDecimal bigDecimal2 = new BigDecimal(0.03);
    BigDecimal bigDecimal3 = new BigDecimal(0.01);
    System.out.println(bigDecimal1.add(bigDecimal1));
        System.out.println(bigDecimal1.add(bigDecimal1));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal1));
        System.out.println(bigDecimal1.divide(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal1));


}
}