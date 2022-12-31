import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
//       String[] str = new String[10];
//        str [0]="1";
//        str [1]="2";
//        str [2]="3";
//        str [3]="4";
//        str [4]="5";
//        str [5]="6";
////        System.out.println(str); 不能打印 如果打印str[0]即可
////        [Ljava.lang.String;@58ceff1   [ 代表数组 中间代表引用类型 从@开始是地址
//
//        int b =0;
//        while (creatdata(b)){
//            for(String s:str){
//                if(s=="3"){
//                    System.out.println("开始执行continue");
//                    continue;
//                }else {
//                    System.out.print(s+" ");
//                }
//
//            }
//            b+=1;
//            if (b==1){
//                continue;
//            }
//
//        }
//    }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("这是1");
        }else if(a==2){
            System.out.println("这是2");
        }else if(a==3){
            System.out.println("这是3");
        }else {
            System.out.println("识别不了了");
        }
    }
//
//    public static Boolean creatdata(int b){
//        System.out.println("正在判断");
//        if(b>=2){
//            return false;
//        }else {
//            return true;
//        }
//
//    }

}
