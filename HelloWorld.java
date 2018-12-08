import java.sql.Date;
import java.unit.Scanner;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

import jdk.nashorn.internal.ir.JoinPredecessor;
import sun.security.x509.X400Address;

public class HelloWorld
{
  public static void main(String[] args) {
    System.out.println("hello \nworld");
    System.out.println(2.0 - 1.1);
    
    double x = 4;
    double y = Math.sqrt(x);
    System.out.println(y);
    
    double x1 = 9.997;
    int nx1 = (int)x1;
    System.out.println(nx1);
    
    double x2 = 9.997; 
    int nx2 = (int)Math.round(x2);
    System.out.println(nx2);
   
    String all = String.join(",", "a","b","c");
    System.out.println(all);

    String greeting = "Hello";
    int n = greeting.length();
    System.out.println(n);

    //System.out.print("what is your name?");
    //String name = in.nextLine();

    double x3 = 10000.0/3.0;
    System.out.println(x3);
    System.out.printf("%9.3f\n",x3);

    System.out.printf("%tc\n",new Date(1));

    for(int i = 10;i > 0;i--)
      System.out.println("Counting down . . . " + i);
    System.out .println("B1astoff!") ;

    float f = 1234.324f;
    System.out.println("f = " + f);
    
    double d = 1234.328d;
    System.out.println("d = " + d);

    double d1 = 1234;
    System.out.println("d1 = " + d1);

    double d2 = d;
    System.out.println("d2 = " + d2);

    //char类型
    char ch = 65535;
    char ch1 = (char)65536;//超出char类型所表示的数据范围，需要进行强制类型转换
    System.out.println("ch=" + ch);
    //定义变量存放Unicode编码表示的字符
    char c ='\u005d';
    System.out.println("c =" + c);

    int x4 = 0,y4 = 0;
    System.out.println("x4=" + x4);
    System.out.println("y4=" + y4);

    //char类型和int类型之间的转换
    char c1 =(char)65536;
    int n1;
    n1 = c1;//隐式类型转换
    c = (char)n1;

    //整型和浮点型的类型装换
    int x5 = 100;
    long y5 = x5;
    x5 = (int)y5;
    float f1 = 100000000000000l;
    System.out.println("f1=" + f1);
    float f2 = 1074849393939393l;
    System.out.println("f2=" + f2);//long型转换成float型可能会发生数据丢失

    //x++
    int x6 = 4;
    int y6 = (x6++) + 5;
    System.out.println("x6=" + x6 + ",y6=" + y6);
    //++x
    x6 = 4;
    y6 = (++x6) + 5;
    System.out.println("x6=" + x6 + ",y6=" + y6);
    //x--
    x6 = 4;
    y6 = (x6--) + 5;
    System.out.println("x6=" + x6 + ",y6=" + y6);
    //--x
    x6 = 4;
    y6 = (--x6) + 5;
    System.out.println("x6=" + x6 + ",y6=" + y6);

    int num1 = 10,num2 = 5;
    int result;
    result = num1 + num2;
    System.out.println(num1 + "+" + num2 + "=" + result);
    //字符串连接
    System.out.println("" + num1 + num2);
    //算术运算符
    System.out.println(num1 + num2);

    double price1,prince2;
    price1 = 80;
    prince2 = 50;
    double sum = price1 + prince2;
    System.out.println("原价为" + sum);
    if(sum > 100){
      sum -=20;
      System.out.println("折后价为" + sum);
    }

    //从键盘接收数据
    /*
    System.out.println("请输入一个整数：");
    Scanner s = new Scanner(System.in);
    int p = s.nextInt();
    if(p % 2 == 0){
      System.out.println(p + "是偶数！");
    }else{
      System.out.println(p + "是奇数！");
    }
    */
    int a = 4,b = 7;
    int max;
    if(a > b){
      max = a;
    }
    else{
      max = b;
    }
    System.out.println(("max=" + max));
    max = a > b ? a : b;
    System.out.println(("max=" + max));    

    /*
    System.out.println("请输入年份：");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (((year % 4 == 0) & (year % 100 != 0))|(year % 400 == 0)){
      System.out.println(year + "是闰年");
    }
    else{
      System.out.println(year + "不是闰年");

    }
    */
  }
}
