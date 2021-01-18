package us;

import java.util.Scanner;

public class use {
    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入您的选择:");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            UserDao ud = new UserDaoImpl();
            switch (choice) {
                case "1":
                    // 登录
                    System.out.println("登陆：");
                    System.out.println("请输入用户名:");
                    String username = sc.nextLine();
                    System.out.println("请输入密码:");
                    String password = sc.nextLine();

                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("恭喜您,登录成功");
                        System.exit(0);
                    } else {
                        System.out.println("用户名或者密码输入错误");
                    }
                    break;
                case "2":
                    // 注册
                    System.out.println("注册：");
                    System.out.println("请输入用户名:");
                    String newUserName = sc.nextLine();
                    System.out.println("请输入密码:");
                    String newPwd = sc.nextLine();
                    User user = new User();
                    user.setUsername(newUserName);
                    user.setPassword(newPwd);

                    ud.register(user);
                    System.out.println("注册成功...");
                    break;
                case "3":
                    System.out.println("谢谢使用,下次再来");
                    System.exit(0);
                default:
                    System.out.println("输入有误请重试");
                    break;
            }
        }

    }
}
