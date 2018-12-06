import java.sql.Date;

import jdk.nashorn.internal.ir.JoinPredecessor;

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
  }
}
