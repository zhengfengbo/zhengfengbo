package date;

import Collection.MyException;
import Collection.Teacher;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
     /*
    异常：不正常
    程序的异常：Throwable
  	严重问题：Error 不处理。这种问题一般都是很严重的，比如说内存溢出。
  	问题：Exception
  	编译期问题:不是RuntimeException的异常 必须进行处理的，因为不处理，编译不能通过。
  	运行期问题:RuntimeException	这种问题也不处理，因为是开发者的问题，
    而且这个问题出现肯定是代码不够严谨，需要修正代码。
    程序出现问题，没有做任何处理，最终jvm会做出默认的处理。
    把异常的名称，原因及出现的问题等信息输出在控制台。
    同时会结束程序。
 */
        //第一阶段
        /*
        int a = 10;
        //int b=2;
        int b = 0;
        System.out.println(a/b);
        //第二阶段
        System.out.println("over");*/

/*
 * 如何处理异常
 *   A:try...
        catch...
		   finally
 *   B:throws 抛出
 *
 * try...catch...finally的处理格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}finally {
 * 			释放资源; * 		}
 *
 * 变形格式：
 * 		try {
 * 			可能出现问题的代码;
 * 		}catch(异常名 变量) {
 * 			针对问题的处理;
 * 		}
 *
 * 注意：
 * 		A:try体内代码越少越好
 * 		B:catch内必须有内容，比如给出一个简单的提示也可
 */
        // 第一阶段
        int a = 10;
        // int b = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        }

        // 第二阶段
        System.out.println("over");
        System.out.println("-------------------");

        /*
         * A:一个异常
         * B:二个异常的处理
         * 		a:每一个写一个try...catch
         * 		b:写一个try，多个catch
         * 			try{
         * 				...
         * 			}catch(异常类名 变量名) {
         * 				...
         * 			}
         * 			catch(异常类名 变量名) {
         * 				...
         * 			}
         * 			...
         * 注意：
         * 		一旦try内出问题，就会把问题给抛出去，然后与catch里面的处理方式进行匹配，
         * 		一旦有匹配的，就执行catch里面的处理，然后结束try...catch
         * 		继续执行后面的语句。
         */
        //method1();
        //method2();
        //method3();
        method4();

    }

    private static void method4() {
        int a = 10;
        int b =0;
        int[] arr = {1,2,3,};
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("这里出现了一个异常");
        }catch (ArithmeticException e){
            System.out.println("除了不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("访问了不该访问的索引");
        }catch(Exception e){
            System.out.println("出问题了");
        }
        System.out.println("over");
        System.out.println("------------------");
    }

    // 两个异常的处理
    public static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[3]);
            System.out.println(a / b);
            // System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问了不该的访问的索引");
        }

        System.out.println("over");
    }
    // 两个异常
    public static void method2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        int[] arr = { 1, 2, 3 };
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问了不该的访问的索引");
        }

        System.out.println("over");
    }
    //一个异常
    public static void method1(){
        //第一阶段
        int a = 10;
        //int b = 2;
        int b = 0;
        try{
            System.out.println(a/b);

        }catch (ArithmeticException ae){
            System.out.println("除数不能为0");
        }
        System.out.println("over");

        System.out.println("-------------------");

        /*
        System.out.println("今天天气很好");
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("但是不该有雾霾");

		method2();
	}

	// 运行期异常的抛出
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

	// 编译期异常的抛出
	// 在方法声明上抛出，是为了告诉调用者，此处有问题。
	public static void method() throws ParseException {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
        */
        // method();
/*
 * throw:如果出现异常情况，可以把异常抛出，抛出的应该是异常的对象
 *
 * throws和throw的区别(面试题)
	throws
		用在方法声明后，跟的是异常类名
		可以跟多个异常类名，用逗号隔开
		表示抛出异常，由该方法的调用者处理
		throws表示出现异常的一种可能性，并不一定会发生异常
	throw
		用在方法体内，跟的是异常对象
		只能抛出一个异常对象
		表示抛出异常，由方法体内的语句处理
 */
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }
    }

    public static void method6() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();
        } else {
            System.out.println(a / b);
        }
        System.out.println("--------------");

        class Fu {
            public void show() throws Exception {
            }

            public void method() {
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.check(score);
        } catch (MyException e) {
            e.printStackTrace();
        }
    /*
 * 异常注意事项:
 * A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类
 * B:如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是其子集,子类不能抛出父类没有的异常
 * C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,
     如果子类方法内有异常,那么子类只能try,不能throws
 */
        class Zi extends Fu {
            @Override
            public void show() throws ArithmeticException {

            }

            @Override
            public void method() {
                // String s = "2014-11-20";
                // SimpleDateFormat sdf = new SimpleDateFormat();
                // Date d = sdf.parse(s);
                // System.out.println(d);
    }
}}}
