/*
 * �ַ������ص㣺һ������ֵ���Ͳ��ܸı䡣
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s:" + s); // helloworld
	}
}

/*
 * String s = new String(��hello��)��String s = ��hello��;������?
 * �С�ǰ�߻ᴴ��2�����󣬺��ߴ���1������
 * 
 * ==:�Ƚ��������ͱȽϵ��ǵ�ֵַ�Ƿ���ͬ
 * equals:�Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equals()�������Ƚϵ��������Ƿ���ͬ��
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}
}

/*
 * ������д���
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true

		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// true

		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6);// true
		System.out.println(s5.equals(s6));// true
	}
}


/*
 * ������д���
 * �ַ������Ǳ�����ӣ�������ռ䣬��ƴ�ӡ�
 * �ַ������ǳ�����ӣ����ȼӣ�Ȼ���ڳ������ң�����о�ֱ�ӷ��أ����򴴽���
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false
		System.out.println(s3.equals((s1 + s2)));// true

		System.out.println(s3 == "hello" + "world");// false 
		System.out.println(s3.equals("hello" + "world"));// true

		// ͨ�������뿴Դ��֪�������Ѿ������˴���
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));
	}
}


import java.util.Scanner;

/*
 * ������С��Ϸ�Ĵ���
 */
public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		// ����һ�������
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			// ����¼������
			Scanner sc = new Scanner(System.in);
			System.out.println("������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();

			// �ж�
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			} else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}
}

/*
 * String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд  
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
 * boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
 * boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
 * 
 * ע�⣺
 * 		�ַ�������Ϊ�պ��ַ�������Ϊ�ա�
 * 		String s = "";
 * 		String s = null;
 */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ�������
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("-----------------------");

		// boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("-----------------------");

		// boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		System.out.println("contains:" + s1.contains("hello"));
		System.out.println("contains:" + s1.contains("hw"));
		System.out.println("-----------------------");

		// boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		System.out.println("startsWith:" + s1.startsWith("h"));
		System.out.println("startsWith:" + s1.startsWith("hello"));
		System.out.println("startsWith:" + s1.startsWith("world"));
		System.out.println("-----------------------");

		// ��ϰ��boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β����Լ���

		// boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
		System.out.println("isEmpty:" + s1.isEmpty());

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());
		// NullPointerException
		// s5���󶼲����ڣ����Բ��ܵ��÷�������ָ���쳣
		System.out.println("isEmpty:" + s5.isEmpty());
	}
}

import java.util.Scanner;

/*
 * ģ���¼,���λ���,����ʾ���м��Ρ�
 * 
 * ������
 * 		A:�����û��������롣�Ѵ��ڵġ�
 * 		B:����¼���û��������롣
 * 		C:�Ƚ��û��������롣
 * 			�������ͬ�����¼�ɹ�
 * 			�����һ����ͬ�����¼ʧ��
 * 		D:�����λ��ᣬ��ѭ���Ľ��������forѭ����
 */
public class StringTest {
	public static void main(String[] args) {
		// �����û��������롣�Ѵ��ڵġ�
		String username = "admin";
		String password = "admin";

		// �����λ��ᣬ��ѭ���Ľ��������forѭ����
		for (int x = 0; x < 3; x++) {
			// x=0,1,2
			// ����¼���û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �Ƚ��û��������롣
			if (name.equals(username) && pwd.equals(password)) {
				// �������ͬ�����¼�ɹ�
				System.out.println("��¼�ɹ�");
				break;
			} else {
				// �����һ����ͬ�����¼ʧ��
				// 2,1,0
				// ����ǵ�0�Σ�Ӧ�û�һ����ʾ
				if ((2 - x) == 0) {
					System.out.println("�ʺű�����������೤��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}

import java.util.Scanner;

/*
 * ģ���¼,�����λ���,����ʾ���м��Ρ������¼�ɹ����Ϳ����������С��Ϸ�ˡ�
 * 
 * ������
 * 		A:�����û��������롣�Ѵ��ڵġ�
 * 		B:����¼���û��������롣
 * 		C:�Ƚ��û��������롣
 * 			�������ͬ�����¼�ɹ�
 * 			�����һ����ͬ�����¼ʧ��
 * 		D:�����λ��ᣬ��ѭ���Ľ��������forѭ����
 */
public class StringTest2 {
	public static void main(String[] args) {
		// �����û��������롣�Ѵ��ڵġ�
		String username = "admin";
		String password = "admin";

		// �����λ��ᣬ��ѭ���Ľ��������forѭ����
		for (int x = 0; x < 3; x++) {
			// x=0,1,2
			// ����¼���û��������롣
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �Ƚ��û��������롣
			if (name.equals(username) && pwd.equals(password)) {
				// �������ͬ�����¼�ɹ�
				System.out.println("��¼�ɹ�,��ʼ����Ϸ");
				//��������Ϸ
				GuessNumberGame.start();
				break;   
			} else {
				// �����һ����ͬ�����¼ʧ��
				// 2,1,0
				// ����ǵ�0�Σ�Ӧ�û�һ����ʾ
				if ((2 - x) == 0) {
					System.out.println("�ʺű�����������೤��ϵ");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (2 - x) + "�λ���");
				}
			}
		}
	}
}

/*
 * String��Ļ�ȡ����
 * int length():��ȡ�ַ����ĳ��ȡ�
 * char charAt(int index):��ȡָ������λ�õ��ַ�
 * int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
 * 		Ϊʲô������int���ͣ�������char����?
 * 		ԭ���ǣ�'a'��97��ʵ�����Դ���'a'
 * int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
 * int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 * int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
 * String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
 * String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
 */
public class StringDemo {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "helloworld";

		// int length():��ȡ�ַ����ĳ��ȡ�
		System.out.println("s.length:" + s.length());
		System.out.println("----------------------");

		// char charAt(int index):��ȡָ������λ�õ��ַ�
		System.out.println("charAt:" + s.charAt(7));
		System.out.println("----------------------");

		// int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf('l'));
		System.out.println("----------------------");

		// int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf("owo"));
		System.out.println("----------------------");

		// int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		System.out.println("indexOf:" + s.indexOf('l', 4));
		System.out.println("indexOf:" + s.indexOf('k', 4)); // -1
		System.out.println("indexOf:" + s.indexOf('l', 40)); // -1
		System.out.println("----------------------");

		// �Լ���ϰ��int indexOf(String str,int
		// fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������

		// String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ������start�������
		System.out.println("substring:" + s.substring(5));
		System.out.println("substring:" + s.substring(0));
		System.out.println("----------------------");

		// String substring(int start,int
		// end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���������start�������ǲ���end����
		System.out.println("substring:" + s.substring(3, 8));
		System.out.println("substring:" + s.substring(0, s.length()));
	}
}

/*
 * ����
     ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������
 * 		"Hello123World"
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 * 
 * ������
 * 		ǰ�᣺�ַ���Ҫ����
 * 		A:��������ͳ�Ʊ���
 * 			bigCount=0
 * 			smallCount=0
 * 			numberCount=0
 * 		B:�����ַ������õ�ÿһ���ַ���
 * 			length()��charAt()���
 * 		C:�жϸ��ַ������������������͵�
 * 			��bigCount++
 * 			С��smallCount++
 * 			���֣�numberCount++
 * 
 * 			�����Ŀ���ѵ��������ж�ĳ���ַ��Ǵ�ģ�����С�ģ��������ֵġ�
 * 			ASCII���
 * 				0	48
 * 				A	65
 * 				a	97
 * 			��Ȼ�����ǰ������ֵ����ֱȽ��ǿ��Եģ���������ˣ��б��⻹�򵥵�
 * 				char ch = s.charAt(x);
 * 
 * 				if(ch>='0' && ch<='9') numberCount++
 * 				if(ch>='a' && ch<='z') smallCount++
 * 				if(ch>='A' && ch<='Z') bigCount++
 *		D:��������
 *
 * ��ϰ���Ѹ����ַ����ķ�ʽ���Ľ�Ϊ����¼���ַ����ķ�ʽ��
 */
public class StringTest2 {
	public static void main(String[] args) {
		
}

/*
 * String��ת�����ܣ�
 * byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
 * char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
 * static String valueOf(char[] chs):���ַ�����ת���ַ�����
 * static String valueOf(int i):��int���͵�����ת���ַ�����
 * 		ע�⣺String���valueOf�������԰��������͵�����ת���ַ�����
 * String toLowerCase():���ַ���ת��Сд��
 * String toUpperCase():���ַ���ת�ɴ�д��
 * String concat(String str):���ַ���ƴ�ӡ�
 */
public class StringDemo {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String s = "JavaSE";

		// byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("----------------");

		// char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("----------------");

		// static String valueOf(char[] chs):���ַ�����ת���ַ�����
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("----------------");

		// static String valueOf(int i):��int���͵�����ת���ַ�����
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");

		// String toLowerCase():���ַ���ת��Сд��
		System.out.println("toLowerCase:" + s.toLowerCase());
		System.out.println("s:" + s);
		// System.out.println("----------------");
		// String toUpperCase():���ַ���ת�ɴ�д��
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("----------------");

		// String concat(String str):���ַ���ƴ�ӡ�
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
	}
}

/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * 		A:�Ȼ�ȡ��һ���ַ�
 * 		B:��ȡ���˵�һ���ַ�������ַ�
 * 		C:��Aת�ɴ�д
 * 		D:��Bת��Сд
 * 		E:Cƴ��D
 */
public class StringTest {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "helloWORLD";

		
		String result = s.substring(0, 1).toUpperCase()
				.concat(s.substring(1).toLowerCase());
		System.out.println(result);
	}
}
/*
 * String����������ܣ�
 * 
 * �滻���ܣ�
 * String replace(char old,char new)
 * String replace(String old,String new)
 *
 * ȥ���ַ������˿ո�	
 * String trim()
 * 
 * ���ֵ�˳��Ƚ������ַ���  
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 */
public class StringDemo {
	public static void main(String[] args) {
		// �滻����
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
		System.out.println("---------------");

		// ȥ���ַ������ո�
		String s4 = " hello world  ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");
		System.out.println("s5:" + s5 + "---");

		// ���ֵ�˳��Ƚ������ַ���
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));// 0
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16
	}
}

/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 */
public class StringTest {
	public static void main(String[] args) {
		
}

/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 * 
 * �Ѵ����ù���ʵ�֡�
 */
public class StringTest2 {
	public static void main(String[] args) {
		// ǰ���������Ѿ�����
		int[] arr = { 1, 2, 3 };

		// дһ�����ܣ�ʵ�ֽ��
		String result = arrayToString(arr);
		System.out.println("���ս���ǣ�" + result);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�int[] arr
	 */
	public static String arrayToString(int[] arr) {
	
}

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * 
 * ������
 * 		A:����¼��һ���ַ���
 * 		B:����һ�����ַ���
 * 		C:���ű����ַ������õ�ÿһ���ַ�
 * 			a:length()��charAt()���
 * 			b:���ַ���ת���ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
 */
public class StringTest3 {
	public static void main(String[] args) {
		// ����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		/*
		// ����һ�����ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = line.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--) {
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}

		// ����´�
		System.out.println("��ת��Ľ���ǣ�" + result);
		*/

		// �Ľ�Ϊ����ʵ��
		String s = myReverse(line);
		System.out.println("ʵ�ֹ��ܺ�Ľ���ǣ�" + s);
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�String �����б�String
	 */
	public static String myReverse(String s) {
		
}

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 * 
 * ������
 * 		ǰ�᣺���Ѿ�֪���˴󴮺�С����
 * 
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class StringTest4 {
	public static void main(String[] args) {
		// �����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// ����С��
		String minString = "java";

		// д����ʵ��
		int count = getCount(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�" + count + "��");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
	 */
	public static int getCount(String maxString, String minString) {
		
}

/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 * 
 * ������
 * 		ǰ�᣺���Ѿ�֪���˴󴮺�С����
 * 
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class StringTest5 {
	public static void main(String[] args) {
		// �����
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		// ����С��
		String minString = "java";

		// д����ʵ��
		int count = getCount(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�" + count + "��");
	}

	/*
	 * ������ȷ�� ����ֵ���ͣ�int �����б������ַ���
	 */
	public static int getCount(String maxString, String minString) {
		// ����һ��ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;

		/*
		// ���ڴ��в���һ��С����һ�γ��ֵ�λ��
		int index = maxString.indexOf(minString);
		// ��������-1��˵�����ڣ�ͳ�Ʊ���++
		while (index != -1) {
			count++;
			// �Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
			// int startIndex = index + minString.length();
			// maxString = maxString.substring(startIndex);
			maxString = maxString.substring(index + minString.length());
			// ������
			index = maxString.indexOf(minString);
		}
		*/
		
		int index;
		//�Ȳ飬��ֵ���ж�
		while((index=maxString.indexOf(minString))!=-1){
			count++;
			maxString = maxString.substring(index + minString.length());
		}

		return count;
	}
}