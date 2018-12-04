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

    System.out.printf("%tc",new Date(1));
    

  }
}
