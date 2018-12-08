import java.util.*;
public class InputTest{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("what is your name?");
    String name = in.nextLine();
    System.out.print("how old are you?");
    int age = in.nextInt();
    System.out.println("Hello," + name + ".Next year,you'll be " + (age + 1));

    System.out.println("请输入整数：");
    Scanner s = new Scanner(System.in);
    int p = s.nextInt();
    if(p % 2 == 0){
      System.out.println(p + "是偶数");
    }else{
      System.out.println(p + "是奇数");
    }
  }
}
