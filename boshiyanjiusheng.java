package ex3;

import java.util.Scanner;

public class boshiyanjiusheng implements jiaoshi,xuesheng{
    String name;
    char sex;
    int age;
    double meiyuegongzi;
    double meixueqixuefei;
    double yue=0;
    boshiyanjiusheng(String name,char sex,int age,double meiyuegongzi,double meixueqixuefei){
        this.age=age;
        this.sex=sex;
        this.name=name;
        this.meiyuegongzi=meiyuegongzi;
        this.meixueqixuefei=meixueqixuefei;
    }
    public void chaxuefei(){
        System.out.println("您应缴纳本年学费"+meixueqixuefei*2+"元");
    }
    public void chaxinshui(){
        double a = 0;
        if (1500>meiyuegongzi&&meiyuegongzi>=0)
            a = meiyuegongzi - meiyuegongzi/100*3;
        else if (4500>meiyuegongzi&&meiyuegongzi>=1500)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*10 -105;
        else if (9000>meiyuegongzi&&meiyuegongzi>=4500)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*20 -555;
        else if (35000>meiyuegongzi&&meiyuegongzi>=9000)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*25 -1005;
        else if (55000>meiyuegongzi&&meiyuegongzi>=35000)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*30 -2755;
        else if (80000>meiyuegongzi&&meiyuegongzi>=55000)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*35 -5505;
        else if (meiyuegongzi>=80000)
            a = meiyuegongzi - (meiyuegongzi-1500)/100*45 -13505;
        System.out.println("您每年薪水税后结余"+ a*9 +"元");
    }
}
