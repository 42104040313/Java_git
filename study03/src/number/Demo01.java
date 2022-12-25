package number;

public class Demo01 {

    public static void main (String []args)
    {
//        int a = 12;
//        int b = 20;
//
//        System.out.println(Math.max(a, b));
//

        float a = 1.25f;
        float b = 1.12f;
        float c =a-b;
        if (Math.abs(c)<0.135){
            System.out.println("计算有效");
            System.out.println(c);
        }else{
            System.out.println("计算无效");
        }
        Character d ='a';
        System.out.println(Character.isLetter('a'));
        String str = "caozhiqiang";
        char[] arr = str.toCharArray();
        for(char s :arr){
            System.out.print(s+" ");
        }
        char e = 'a';
        char E = 'A';
        System.out.println((int)e);
        if ((int)e>65&&(int)e<=123){
            System.out.println("是一个字母");
        }else {
            System.out.println("NONONONO");
        }
    }
}

