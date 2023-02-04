import java.sql.SQLOutput;

public class Demo {

    private String str = "caozhiqiang";

    public static void main(String[] args) {

        String s1 = "caozhiqiang";              // String 直接创建
        String s2 = "12345";              // String 直接创建
      Demo demo = new Demo();
      demo.loginU(s1,s2);

        String a = "1429141662@qq.com";
        isMail(a);


    }

    //用户登录
    public int loginUser(String username,String password){
        String username_succ = "caozhiqiang";
        String password_succ = "1234560";

        if (username==username_succ&&password==password_succ){
            System.out.println("登陆成功");
            return 1;
        }else {
            System.out.println("登陆失败！！！快检查你的安全");
            return 0;
        }

    }
    public int loginU(String username,String password){
        String username_succ = "caozhiqiang";
        String password_succ = "123654";

        if(username==username_succ&&password==password_succ){
            System.out.println("恭喜你登录成功");
            return 1;
        }else {
            System.out.println("登陆失败！！！ 要小心咯");
            return 0;
        }
    }
 //验证邮箱是否合法
    public static void  isMail(String mail){
        char[] ar = mail.toCharArray();
        boolean ischeck = false;
        for (char s : ar) {
            if (s == '@') {
                System.out.println("合法");
                ischeck = true;
            }
        }
            if (!ischeck){
                System.out.println("不合法");
            }

    }

}


