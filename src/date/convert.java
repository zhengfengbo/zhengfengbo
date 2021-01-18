package date;
import java.util.Arrays;

public class convert {
    public static void main(String[] args) {
        String str = "山东大学软件学院";
        char[] chars = new char[8];
        str.getChars(0,str.length(),chars,0);
        System.out.println(Arrays.toString(chars));

    }
}
