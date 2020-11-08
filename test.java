package ex3;



import java.util.Objects;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {


        a:while (true) {
            String b;
            System.out.println("请输入你的名字");
            Scanner a = new Scanner(System.in);
            switch (a.next()) {
                case "张三": {
                    b = "张三";
                    break;
                }
                case "李四": {
                    b = "李四";
                    break;
                }
                default: {
                    System.out.println("查无此人");
                    break a;
                }
            }

            System.out.println("请完善您的个人信息，请输入您的性别(M/F),年龄,每月工资,每学期应缴学费,并以回车分隔");
            try {
                Scanner c = new Scanner(System.in);
                Scanner d = new Scanner(System.in);
                Scanner e = new Scanner(System.in);
                Scanner f = new Scanner(System.in);
                char h = c.next().charAt(0);
                if ((h != 'M' ) && (h != 'F' )) {
                    throw new Exception();
                }
                boshiyanjiusheng g = new boshiyanjiusheng(b, h, d.nextInt(), e.nextDouble(), f.nextDouble());
                g.chaxinshui();
                g.chaxuefei();
            } catch (Exception e) {
                System.out.println("差不多得了\uD83D\uDE05");
            }

        }

    }
}
