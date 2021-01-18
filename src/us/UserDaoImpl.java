package us;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class UserDaoImpl implements UserDao {

    private static File file = new File("user.txt");

    static {
        if (file != null) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("创建文件失败...");
            }
        }
    }


    @Override
    public boolean isLogin(String username, String password) {

        boolean flag = false;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = br.readLine()) != null) {

                String[] datas = line.split("=");

                if (datas[0].equals(username) && datas[1].equals(password)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
        } catch (IOException e) {
            System.out.println("登录失败");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("登录时释放资源失败");
                }
            }
        }
        return flag;

    }

    // 注册
    @Override
    public void register(User user) {

        BufferedWriter bw = null;
        try {

            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(user.getUsername() + "=" + user.getPassword());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("用户注册失败...");
        } finally {

            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("注册时释放的资源失败");
                }
            }
        }
    }

}
